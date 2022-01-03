public class MissionOne {

    public boolean andGate(int inputA, int inputB) {
        if ((inputA == 1) && (inputB == 1)) {
            return true;
        }
        return false;
    }

    public boolean orGate(int inputA, int inputB) {
        if ((inputA == 1) || (inputB == 1)) {
            return true;
        }
        return false;
    }

    public boolean nandGate(boolean relayA, boolean relayB) {
        if ((relayA == true) && (relayB == true)) {
            return false;
        }
        return true;
    }

    public boolean xorGate(boolean relayA, boolean relayB) {
        if ((relayA != relayB)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
    }

}
