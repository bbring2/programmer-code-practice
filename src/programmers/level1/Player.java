package programmers.level1;

import java.util.Arrays;
import java.util.List;

public class Player {
            public static String solution(String[] participant, String[] completion) {
                String answer = "";

                List<String> participantList = Arrays.asList(participant);
                List<String> completionList = Arrays.asList(completion);

                for (String s : participantList) {
                    if (!completionList.contains(s)) {
                        answer = s;
                    }
                }

                return answer;
            }

            public static void main(String[] args) {
                String[] participant = {"jayz", "sure", "mf"};
                String[] completion = {"jayz", "sure"};

                System.out.println(solution(participant, completion));
            }

}
