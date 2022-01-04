import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MissionOneTest {
    Gate gate = new Gate();

    @Test
    void andGateTest(){
        assertTrue(gate.and(true, true));
        assertFalse(gate.and(true, false));
        assertFalse(gate.and(false, true));
        assertFalse(gate.and(false, false));
    }

    @Test
    void orGateTest(){
        assertTrue(gate.or(true, true));
        assertTrue(gate.or(true, false));
        assertTrue(gate.or(false, true));
        assertFalse(gate.or(false, false));
    }

    @Test
    void nandGateTest(){
        assertFalse(gate.nand(true, true));
        assertTrue(gate.nand(true, false));
        assertTrue(gate.nand(false, true));
        assertTrue(gate.nand(false, false));
    }

    @Test
    void xorGateTest(){
        assertFalse(gate.xor(true, true));
        assertTrue(gate.xor(true, false));
        assertTrue(gate.xor(false, true));
        assertFalse(gate.xor(false, false));
    }
}
