package vinculacion.educamoises;

import javax.swing.JFrame;
import vinculacion.educamoises.utils.FrameUtil;
import vinculacion.educamoises.view.MainViewController;


public class Main {

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        FrameUtil.showFrame(new MainViewController(),JFrame.EXIT_ON_CLOSE);
    }
}
