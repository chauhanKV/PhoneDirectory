package PhoneDirectory.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class LinkedList<T> {
    private class Node<T> {
        private T value;
        private Node<T> next;

        public Node(T value) {
            this.value = value;
        }
    }

    private Node<T> first;
    private Node<T> last;
    private int size = 0;

    // Time Complexity -> O(1)
    public void addFirst(T element) {
        var node = new Node(element);

        //First check if the list is empty
        if (isEmpty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
        size++;
    }

    //Time Complexity -> O(1)
    public void addLast(T element) {
        var node = new Node(element);

        // First check if the list is empty
        if (isEmpty()) {
            first = last = node;
        } else {
            //append the node to last node's next and update the last node
            last.next = node;
            last = node;
        }
        size++;
    }

    private boolean isEmpty() {
        return first == null;
    }

    // Time complexity -> O(1)
    public void removeFirst() {
        if (isEmpty())
            throw new IndexOutOfBoundsException();

        var second = first.next;
        first.next = null;
        first = second;
        size--;
    }

    // Time Complexity -> O(N)
    public void removeLast() {
        if (isEmpty())
            throw new IndexOutOfBoundsException();

        var current = first;
        while (current.next != last) {
            current = current.next;
        }
        last = current;
        last.next = null;
        size--;
    }

    // Time Complexity -> O(N)
    public boolean contains(T element) {
        if (isEmpty()) return false;
        var current = first;

        while (current != last) {
            if (current.value == element) {
                return true;
            } else {
                current = current.next;
            }
        }
        return false;
    }

    //Time Complexity -> O(N)
    public int indexOf(T element) {
        if (isEmpty()) return -1;
        var current = first;
        var counter = 0;
        while (current != last) {
            if (current.value == element)
                return counter;
            else {
                current = current.next;
                counter++;
            }
        }
        return -1;
    }

    private int size() {
        return size;
    }

    public ArrayList<T> searchNode(T node)
    {
        ArrayList<T> list = new ArrayList<>();
        // find all consecutive nodes and pass as array
        var current = first;
        while(current != null)
        {
            if(current.value.equals(node))
            {
                list.add((T) current);
            }
            current = current.next;
        }
        return list;
    }

//    public void add(int index, T element)
//    {
//
//    }

//    // Need to create generic array -> refer ->  https://www.baeldung.com/java-generic-array
//      public String[] printList() {
//          String[]
//
//
//          return array;
//      }

//    public <T> T[] toArray(Node<T> a) {
//        if (a.length < size)
//            // Make a new array of a's runtime type, but my contents:
//            return (T[]) Arrays.copyOf(elementData, size, a.getClass());
//        System.arraycopy(elementData, 0, a, 0, size);
//        if (a.length > size)
//            a[size] = null;
//        return a;
//    }

}
