package vinculacion.educamoises.utils;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import org.pushingpixels.substance.api.SubstanceLookAndFeel;
import vinculacion.educamoises.view.ViewController;

/**
 *
 * @author Edinson Ayui
 */
public class FrameUtil {

    public static void showFrame(ViewController viewController, int close) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    JFrame.setDefaultLookAndFeelDecorated(true);
                    SubstanceLookAndFeel.setSkin("org.pushingpixels.substance.api.skin.NebulaBrickWallSkin");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error Inesperado: " + e.getMessage());
                }
                JFrame view = new JFrame();
                JMenuBar mb=new JMenuBar();
                JMenu menu=new JMenu("Login");  
                mb.add(menu);
                view.setJMenuBar(mb);
                view.setTitle("Escuela Moises Arteaga Valdivieso");
                view.setSize(800, 600);
                view.setLocationRelativeTo(null);
                view.setExtendedState(view.getExtendedState() | JFrame.MAXIMIZED_BOTH);
                view.setLayout (new BorderLayout());
                view.setContentPane(viewController.getView());
                view.setDefaultCloseOperation(close);
                view.setVisible(true);
            }
        });
    }
}
