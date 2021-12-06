package programmers.level1;

public class CoverMobileNum {
    public String solution(String mobileNum) {
        String answer = "";
        for(int i = 0; i < mobileNum.length();i++) {
            if (i<mobileNum.length()-4)
                answer+="*";
            else answer+=mobileNum.charAt(i);
        } return answer;
    }
}
