public class Print {
    public void print() {

        System.out.println("---영상클립---");
        for (DataStructure dataStructure : DataStructure.values()) {
            System.out.println(dataStructure.getSubject() + "(" + dataStructure + ")" + ":" + dataStructure.getRunningTime());
        }
    }
}
