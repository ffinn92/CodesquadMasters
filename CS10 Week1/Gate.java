public class Gate {

    public boolean and(boolean relayA, boolean relayB){
        return relayA && relayB;
    }

    public boolean or(boolean relayA, boolean relayB){
        return relayA || relayB;
    }

    public boolean not(boolean relay){
        return !relay;
    }

    public boolean nand(boolean relayA, boolean relayB){
        return not(and(relayA , relayB));
    }

    public boolean xor(boolean relayA, boolean relayB){
        return or(and(not(relayA),relayB), and(relayA, not(relayB)));
    }

}
