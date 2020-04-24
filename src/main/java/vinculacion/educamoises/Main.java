package vinculacion.educamoises;

import javax.swing.JFrame;
import vinculacion.educamoises.utils.FrameUtil;
import vinculacion.educamoises.view.LoginViewController;
import vinculacion.educamoises.view.MainViewController;
import vinculacion.educamoises.view.MathViewCourseController;
import vinculacion.educamoises.view.LiteratureViewCourseController;
import vinculacion.educamoises.view.ScienceViewCourseController;
import vinculacion.educamoises.view.SocialViewCourseController;

/**
 *
 * @author Edinson Ayui
 */
public class Main {

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        FrameUtil.showFrame(new MainViewController(),JFrame.EXIT_ON_CLOSE);
    }
}
