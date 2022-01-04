import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MissionTwoTest {
    Adder adder = new Adder();

    @Test
    void halfAdderTest(){
        assertArrayEquals(new boolean[]{true,false}, adder.halfAdder(true, true));
        assertArrayEquals(new boolean[]{false,true}, adder.halfAdder(true, false));
        assertArrayEquals(new boolean[]{false,true}, adder.halfAdder(false, true));
        assertArrayEquals(new boolean[]{false,false}, adder.halfAdder(false, false));
    }

    @Test
    void fullAdderTest(){
        assertArrayEquals(new boolean[]{true,true}, adder.fullAdder(true, true,true));
        assertArrayEquals(new boolean[]{true,false}, adder.fullAdder(true, false,true));
        assertArrayEquals(new boolean[]{true,false}, adder.fullAdder(false, true,true));
        assertArrayEquals(new boolean[]{false,true}, adder.fullAdder(false, false,true));

        assertArrayEquals(new boolean[]{true,false}, adder.fullAdder(true, true,false));
        assertArrayEquals(new boolean[]{false,true}, adder.fullAdder(true, false,false));
        assertArrayEquals(new boolean[]{false,true}, adder.fullAdder(false, true,false));
        assertArrayEquals(new boolean[]{false,false}, adder.fullAdder(false, false,false));
    }

}
