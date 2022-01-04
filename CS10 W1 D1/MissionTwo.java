import java.util.Arrays;

public class MissionTwo {
    //반쪽덧셈 함수
    public boolean[] halfadder(boolean relayA, boolean relayB) {
        boolean[] answer = {halfCarryAndGate(relayA, relayB), halfSumXorGate(relayA, relayB)};
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    private boolean halfSumXorGate(boolean relayA, boolean relayB) {
        if ((relayA != relayB)) {
            return true;
        }
        return false;
    }

    private boolean halfCarryAndGate(boolean relayA, boolean relayB) {
        if ((relayA == true) && (relayB == true)) {
            return true;
        }
        return false;
    }

    //전체덧셈 함수
    public boolean[] fulladder(boolean relayA, boolean relayB, boolean carry) {
        boolean[] answer = {fullCarryAndGate(relayA, relayB, carry), fullSumOrGate(relayA, relayB, carry)};
        System.out.println(Arrays.toString(answer));
        return answer;
    }


    private boolean fullSumOrGate(boolean relayA, boolean relayB, boolean carry) {
        if (((relayA != relayB) != carry)) {
            return true;
        }
        return false;
    }

    private boolean fullCarryAndGate(boolean relayA, boolean relayB, boolean carry) {
        if ((relayA == true) && (relayB == true)) {
            return true;
        } else if (((relayA == true) || (relayB == true)) && (carry == true)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        MissionTwo missionTwo = new MissionTwo();
        missionTwo.halfadder(true, true);
        missionTwo.fulladder(true, true, true);
    }

}
