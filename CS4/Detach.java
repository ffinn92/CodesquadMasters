public class Detach {
    private String xyStr;
    private String[] xyDetach;
    Run run = new Run();

    public void setXyDetach(String input) {

        getXyStr(input);
        getXyDetach(xyStr);
        if ((getXy(xyDetach[0]) < 25) && (getXy(xyDetach[1]) < 25)) {
            PointStorge.pointGenerator(getXy(xyDetach[0]), getXy(xyDetach[1]));
        }else {
            System.out.println("Error!!");
            run.run();
        }

    }

    private void getXyStr(String input) {
        xyStr = input;
        xyStr = xyStr.substring(1, xyStr.length() - 1);
    }

    private void getXyDetach(String xyStr) {
        xyDetach = xyStr.split(",");
    }

    private int getXy(String xyDetach) {
        return Integer.parseInt(xyDetach);
    }

}
