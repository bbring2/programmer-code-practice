package doitBook.clazz;

public class Id {
    private static int counter = 0; //id를 몇개 부여했는지 저장
    private int id; //id

    //생성자
    public Id() {
        id = ++counter;
    }

    //아이디를 반환하는 인스턴스 메서드
    public int getId() {
        return id;
    }

    //counter를 반환하는 클래스 메서드
    public static int getCounter() {
        return counter;
    }


}
