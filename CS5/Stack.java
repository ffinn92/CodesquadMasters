import java.util.ArrayList;
import java.util.List;

public class Stack implements Area{

    private final List<String> memorys;
    private final int size;
    private final int baseAddress = 0;


    public Stack(List<String> memorys, int size) {
        this.memorys = memorys;
        this.size = size;
    }

    public int maker(List<String> memorys, int size) {
        memorys = new ArrayList<>(size);
        return baseAddress;
    }

}