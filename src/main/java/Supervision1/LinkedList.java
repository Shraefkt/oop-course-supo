package Supervision1;

import java.util.List;

public class LinkedList {
    public LinkedList nextElement;
    private int thisElement;
    public LinkedList() {
        this.nextElement = null;
    }
    public LinkedList(LinkedList nextElement, int thisElement) {
        this.nextElement = nextElement;
        this.thisElement = thisElement;
    }

    public LinkedList addElement(int newElement) {
        return new LinkedList(this,newElement);
    }

    public LinkedList removeElement() throws Exception {
        if (this.nextElement == null) {
            throw new Exception();
        }
        return this.nextElement;
    }

    public int queryHead() {
        return this.thisElement;
    }

    public int getNthElement(int N) throws Exception {
        if (this.nextElement == null) {
            throw new Exception();
        }
        if (N==0) return this.thisElement;
        return this.nextElement.getNthElement(N-1);
    }

    public int getLength() {
        if (this.nextElement == null) {
            return 0;
        }
        return 1 + this.nextElement.getLength();
    }
    public boolean detectCycles() {
        LinkedList nextLL = this;
        LinkedList aheadLL = this;
        while (nextLL != null && aheadLL != null) {
            nextLL = nextLL.nextElement;
            if (aheadLL.nextElement == null) {
                return false;
            }
            aheadLL = aheadLL.nextElement.nextElement;
            if (aheadLL == nextLL) return true;
        }
        return false;
    }
}
