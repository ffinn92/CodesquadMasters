import java.util.ArrayList;
import java.util.List;

public class Heap implements Area{

    private final List<String> memorys;
    private final int size;

    public Heap(List<String> memorys, int size) {
        this.memorys = memorys;
        this.size = size;
    }

    public void maker(List<String> memorys, int size) {
        memorys = new ArrayList<>(size);
    }

}
