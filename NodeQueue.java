public class NodeQueue {
    MahasiswaQueue data;
    NodeQueue next;

    public NodeQueue(MahasiswaQueue data, NodeQueue next) {
        this.data = data;
        this.next = next;
    }
}