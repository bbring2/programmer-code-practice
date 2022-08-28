package doitBook.stack;

public class IntStack {

    private int max; //스택 용량
    private int ptr; //스택 포인터
    private int[] stk; //스택 본체

    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() { }
    }

    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() { }
    }

    public IntStack(int capacity) {
        ptr = 0;
        max = capacity;

        try {
            stk = new int[max]; //스택 본체 생성
        } catch (OutOfMemoryError e) {
            max = 0; //스택 생성 불가
        }
    }

    public int push(int x) throws OverflowIntStackException {
        if(ptr >= max) throw new OverflowIntStackException();
        return stk[ptr++] = x;
    }

    public int pop() throws EmptyIntStackException {
        if(ptr <= 0) throw new EmptyIntStackException();

        return stk[--ptr];
    }
}
