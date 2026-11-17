package Supervision1;

public class Stack {
    private int elements[];
    private int size;
    private int topPtr;

    public Stack() {
        size = 4;
        this.elements = new int[]{0, 0, 0, 0};
        topPtr = -1;
    }

    public void push(int newElement) {
        if (topPtr + 1>= size) {
            //resize
            size = size * 2;
            int tmp[] = new int[size];
            for (int i=0;i<=topPtr;i++) {
                tmp[i] = elements[i];
            }
            elements = tmp;
        }
        topPtr = topPtr + 1;
        elements[topPtr] = newElement;
    }

    public int pop() throws Exception {
        if (topPtr == -1) throw new Exception();
        topPtr -= 1;
        return elements[topPtr+1];
    }
}
