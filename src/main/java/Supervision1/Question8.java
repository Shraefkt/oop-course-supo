package Supervision1;

public class Question8 {
    public static void main(String[] args) throws Exception {
        Stack mystack = new Stack();
        for (int i=0;i<10;i++) {
            mystack.push(i);
        }
        for (int i=0;i<10;i++) {
            System.out.println(mystack.pop());
        }
    }
}
