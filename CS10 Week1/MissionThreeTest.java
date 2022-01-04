import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MissionThreeTest {

    Adder adder = new Adder();

    @Test
    void byteAdderTestSum1() {
        boolean[] byetA = {true, true, false, true, true, false, true, false};
        boolean[] byetB = {true, false, true, true, false, false, true, true};
        boolean[] answer = {false, false, false, true, false, true, false, false, true};

        assertArrayEquals(answer, adder.byteAdder(byetA, byetB));
    }

    @Test
    void byteAdderTestSum2() {
        boolean[] byetA = {true, true, false, false, true, false, true, false};
        boolean[] byetB = {true, true, false, true, true, false, false, true};
        boolean[] answer = {false, true, true, true, false, true, true, true, false};

        assertArrayEquals(answer, adder.byteAdder(byetA, byetB));
    }

    @Test
    void fourByteAdderTestSum1() {
        boolean[] byetA = {true, true, false, true};
        boolean[] byetB = {true, false, true, true};
        boolean[] answer = {false, false, false, true, true};

        assertArrayEquals(answer, adder.byteAdder(byetA, byetB));
    }

    @Test
    void fourByteAdderTestSum2() {
        boolean[] byetA = {true, true, false, false};
        boolean[] byetB = {true, true, false, true};
        boolean[] answer = {false, true, true, true, false};

        assertArrayEquals(answer, adder.byteAdder(byetA, byetB));
    }

    @Test
    void tenSixByteAdderTestSum1() {
        boolean[] byetA = {true, true, false, true, true, false, true, false, true, true, false, true, true, false, true, false};
        boolean[] byetB = {true, false, true, true, false, false, true, true, true, false, true, true, false, false, true, true};
        boolean[] answer = {false, false, false, true, false, true, false, false, true, false, false, true, false, true, false, false, true};

        assertArrayEquals(answer, adder.byteAdder(byetA, byetB));
    }

    @Test
    void anotherByteAdderTestSum1() {
        boolean[] byetA = {true, true, false, true};
        boolean[] byetB = {true, false, true, true, false, false, true, true};
        boolean[] answer = {false, false, false, true, true, false, true, true, false};

        assertArrayEquals(answer, adder.byteAdder(byetA, byetB));
    }



}
