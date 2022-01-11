import java.util.Scanner;

public class Input {
    DataStructure dataStructure;
    Editor editor = new Editor();
    Scanner sc = new Scanner(System.in);


    public void input() {
        while (true) {
            System.out.print("\n" + ">");
            String inputForm = sc.nextLine();
            String[] formArry = inputForm.split("\\s");
            String editSelct = formArry[0];

            if (editSelct.equals("add")) {
                selectAdd(formArry[1]);
            } else if (editSelct.equals("insert")) {
                //blah blah
            } else if (editSelct.equals("delect")) {
                //blah blah
            } else if (editSelct.equals("render")) {
                //blah blah
                break;
            }
        }

    }

    private void selectAdd(String id1) {
        String id = id1;
        dataStructure = DataStructure.toName(id);
        int runningTime = dataStructure.getRunningTime();

        editor.add(id, runningTime);
        System.out.print(editor);
    }


}
