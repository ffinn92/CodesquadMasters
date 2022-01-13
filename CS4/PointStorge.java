import java.util.ArrayList;
import java.util.List;

public class PointStorge {
    private final List<PointXy> points;

    public static PointStorge pointGenerator(int xDetach, int yDetach) {
        PointStorge pointStorge = new PointStorge(new ArrayList<>());

        pointStorge.getPoints().add(new PointXy(xDetach, yDetach));
        return pointStorge;
    }

    public PointStorge(List<PointXy> points) {
        this.points = points;
    }

    public List<PointXy> getPoints() {
        return points;
    }
}
