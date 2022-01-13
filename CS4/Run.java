public class Run {
    private static final int XY_LENGTH = 2;

    void run(){
        Input.prompt();
        String[] input = Input.input();

        Detach detach = new Detach();
        for (int i = 0; i < XY_LENGTH; i++) {
            detach.setXyDetach(input[i]);
        }



    }
}
