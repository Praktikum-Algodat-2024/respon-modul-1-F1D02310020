public class LinkedList {
    private Node head = null;
    private Node tail = null;

    public void addLast(String nama) {
        Node newNode = new Mahasiswa(nama);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void addFirst(String nama) {
        Node newNode = new Mahasiswa(nama);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void delete(String nama) {
        Node current = head;

        while (current != null) {
            if (current.getData().equals(nama)) {
                if (current == head) {
                    head = head.next;
                    if (head != null) {
                        head.prev = null;
                    }
                } else if (current == tail) {
                    tail = tail.prev;
                    if (tail != null) {
                        tail.next = null;
                    }
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                return;
            }
            current = current.next;
        }
    }

    public boolean search(String nama) {
        Node current = head;

        while (current != null) {
            if (current.getData().equals(nama)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void reverseSection(int start, int end) {
        Node startNode = getNodeAtIndex(start);
        Node endNode = getNodeAtIndex(end);

        while (start < end && startNode != null && endNode != null) {
            String temp = startNode.getData();
            ((Mahasiswa)startNode).setNama(endNode.getData());
            ((Mahasiswa)endNode).setNama(temp);

            startNode = startNode.next;
            endNode = endNode.prev;
            start++;
            end--;
        }
    }

    public void reverseAll() {
        Node current = head;
        Node temp = null;
        

        Node oldTail = tail;
        
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        
        tail = head;
        if (temp != null) {
            head = oldTail;
        }
    }

    private Node getNodeAtIndex(int index) {
        Node current = head;
        int count = 0;
        while (current != null) {
            if (count == index) {
                return current;
            }
            current = current.next;
            count++;
        }
        return null;
    }

 
    public void display() {
        Node current = head;
        int nomor = 1;
        while (current != null) {
            System.out.println(nomor + ". " + current.getData());
            current = current.next;
            nomor++;
        }
    }
}