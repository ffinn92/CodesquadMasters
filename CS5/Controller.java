import java.util.List;

public class Controller {
    private List<String> memorys;

    public Controller() {
    }

    public int init(int stackSize, int heapSize) {
        int baseAddress = 0;

        Stack stack = new Stack(memorys, stackSize);
        baseAddress = stack.maker(memorys,stackSize);

        Heap heap = new Heap(memorys, heapSize);
        heap.maker(memorys, heapSize);

        return baseAddress;
    }

}