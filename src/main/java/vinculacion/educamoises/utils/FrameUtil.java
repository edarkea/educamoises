package vinculacion.educamoises.utils;

import javax.swing.JFrame;
import vinculacion.educamoises.view.ViewController;

/**
 *
 * @author Edinson Ayui
 */
public class FrameUtil {

    public static void showFrame(ViewController viewController) {
        JFrame view = new JFrame();
        view.setLocationRelativeTo(null);
        view.setExtendedState(view.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        view.setContentPane(viewController.getView());
        view.setDefaultCloseOperation(3);
        view.setVisible(true);
    }
}
