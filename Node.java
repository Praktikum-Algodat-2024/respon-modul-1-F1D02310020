
public abstract class Node {

    protected String data;
    public Node next = null;
    public Node prev = null;

    public Node(String data) {
        this.data = data;
    }

    public abstract boolean isEqual(Node n);

    public String getData() {
        return this.data;
    }
}