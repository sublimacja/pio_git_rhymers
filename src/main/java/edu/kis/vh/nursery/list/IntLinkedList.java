package edu.kis.vh.nursery.list;
//sprawdzenie przyciskow alt strzalka
public class IntLinkedList {

    Node last;
    private int i;
    private static final int RESULT = -1;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return RESULT;
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return RESULT;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
