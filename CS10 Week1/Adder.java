public class Adder {
    Gate gate = new Gate();
    private int answerLength;

    public boolean[] halfAdder(boolean relayA, boolean relayB) {
        boolean[] answer = new boolean[2];

        boolean carry = gate.and(relayA, relayB);
        boolean sum = gate.xor(relayA, relayB);

        answer[0] = carry;
        answer[1] = sum;

        return answer;
    }

    public boolean[] fullAdder(boolean relayA, boolean relayB, boolean inputCarry) {
        boolean[] answer = new boolean[2];

        boolean[] halfSum = halfAdder(relayA, relayB);
        boolean[] fullAdderSum = halfAdder(inputCarry, halfSum[1]);

        boolean carry = gate.or(halfSum[0], fullAdderSum[0]);
        boolean sum = fullAdderSum[1];

        answer[0] = carry;
        answer[1] = sum;

        return answer;
    }

    public boolean[] byteAdder(boolean[] relayA, boolean[] relayB) {
        int length = getAnswerLength(relayA, relayB);
        boolean[] answer = new boolean[length];
        boolean[] relayAA = relayConverter(relayA, length);
        boolean[] relayBB = relayConverter(relayB, length);
        boolean carry = false;
        boolean[] adder;

        for (int i = 0; i < answer.length; i++) {
            adder = fullAdder(relayAA[i], relayBB[i], carry);

            carry = adder[0];
            answer[i] = adder[1];
        }


        return answer;
    }

    private boolean[] relayConverter(boolean[] relayA, int length) {
        boolean[] relay = new boolean[length];
        System.arraycopy(relayA, 0, relay, 0, relayA.length);

        return relay;
    }

    private int getAnswerLength(boolean[] relayA, boolean[] relayB) {
        int relayALength = relayA.length;
        int relayBLength = relayB.length;

        if (relayALength > relayBLength) {
            answerLength = relayALength + 1;
        } else if (relayALength < relayBLength) {
            answerLength = relayBLength + 1;
        } else {
            answerLength = relayALength + 1;
        }
        return answerLength;
    }

}
