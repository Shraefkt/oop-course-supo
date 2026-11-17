package Supervision1;
public class Question6 {
    /** 6. Design and implement (from scratch – i.e. not using java lists) a singly linked list. Your
    class(es) should support the addition and removal of elements, querying of the head
    element, obtaining the nth element and computing the length of the list. Your list only needs
    to work with integers. Do not use Generics.
    **/
    public static void main(String[] args) throws Exception {
        LinkedList myLL = new LinkedList();
        myLL = myLL.addElement(1);
        myLL = myLL.addElement(2);
        System.out.println(myLL.getLength());
        System.out.println(myLL.getNthElement(1));
        System.out.println(myLL.queryHead());
        myLL = myLL.removeElement();
        System.out.println(myLL.queryHead());

        // Question 7
        LinkedList myLLcycle = new LinkedList();
        LinkedList myLLcyclestart = myLLcycle.addElement(1);
        myLLcycle = myLLcyclestart.addElement(2);
        myLLcycle = myLLcycle.addElement(3);
        myLLcyclestart.nextElement = myLLcycle;
        System.out.println(myLL.detectCycles());
        System.out.println(myLLcycle.detectCycles());
    }
}
