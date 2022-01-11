public class Editor {

    private Node first;
    private Node last;
    private int size = 0;

    private class Node {

        private String idData;
        private int runningTime;
        private Node next;

        public Node(String id, int runningTime) {
            this.idData = id;
            this.runningTime = runningTime;
            this.next = null;
        }

    }

    public void firstAdd(String id, int runningTime) {

        Node newNode = new Node(id, runningTime);
        newNode.next = first;
        first = newNode;
        size++;

        if (first.next == null) {
            last = first;
        }
    }

    public void add(String id, int runningTime) {

        Node newNode = new Node(id, runningTime);
        if (size == 0) {
            firstAdd(id, runningTime);
        } else {
            last.next = newNode;
            last = newNode;
            size++;
        }
    }

    public String toString() {
        if (first == null) {
            return "null";
        }
        Node nodeData = first;
        String output = "|";

        while (nodeData.next != null) {
            output += "---[" + nodeData.idData + ", " + Integer.toString(nodeData.runningTime) + "sec" + "]";
            nodeData = nodeData.next;
        }
        output += "---[" + nodeData.idData + ", " + Integer.toString(nodeData.runningTime) + "sec" + "]";

        return output + "---" + "[end]"+"\n";
    }
}
