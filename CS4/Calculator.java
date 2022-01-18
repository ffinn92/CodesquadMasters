import java.util.ArrayList;

public class Calculator {
    private final PointStorge pointStorge;
    private int x;
    private int y;

    private Calculator(PointStorge pointStorge){
        this.pointStorge = pointStorge;
    }

    public static Calculator calculator() {
        PointStorge pointStorge = new PointStorge(new ArrayList<>());
        x = pointStorge.getPoints(0);
    }
}
