import java.util.Arrays;

public class MissionThree {
    //바이트덧셈 함수
    public boolean[] byteadder(boolean[] byteA, boolean[] byteB){
        boolean[] answer = new boolean[9];
        boolean carry = false;

        for (int i = 0; i < answer.length; i++) {
            if(i == 8){
                answer[i] = fullCarryAndGate(byteA[i-1], byteB[i-1], carry);
            }else {
                answer[i] = fullSumOrGate(byteA[i], byteB[i], carry);
                carry = fullCarryAndGate(byteA[i], byteB[i], carry);
            }
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public boolean fullSumOrGate(boolean relayA, boolean relayB, boolean carry) {
        if (((relayA != relayB) != carry)) {
            return true;
        }
        return false;
    }

    public boolean fullCarryAndGate(boolean relayA, boolean relayB, boolean carry) {
        if ((relayA == true) && (relayB == true)) {
            return true;
        } else if (((relayA == true) || (relayB == true)) && (carry == true)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        MissionThree missionTwo = new MissionThree();
        //예제 1
//        boolean[] byteA = {true,true,false,true,true,false,true,false};
//        boolean[] byteB = {true,false,true,true,false,false,true,true};

        //예제 2
        boolean[] byteA = {true,true,false,false,true,false,true,false};
        boolean[] byteB = {true,true,false,true,true,false,false,true};
        missionTwo.byteadder(byteA,byteB);
    }

}
