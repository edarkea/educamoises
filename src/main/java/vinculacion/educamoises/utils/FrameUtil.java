package vinculacion.educamoises.utils;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

import java.awt.Dimension;

import vinculacion.educamoises.view.ViewController;

public class FrameUtil {

    private static JFrame frame;

    public static JPanel containerViews;

    public static void showFrame(ViewController viewController, int close) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {

                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error Inesperado: " + e.getMessage());
                }

                /*JMenuBar mb = new JMenuBar();
                JMenu menu = new JMenu("Inicio");
                JMenuItem login = new JMenuItem("Login");
                menu.add(login);
                mb.add(menu);*/

                frame = new JFrame();
                frame.setTitle("Escuela Moises Arteaga Valdivieso");
                frame.setSize(800, 600);
                frame.setResizable(true);
                frame.setMinimumSize(new Dimension(800, 600));
                frame.setLocationRelativeTo(null);
                frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
                frame.setLayout(new BorderLayout());

                containerViews = new JPanel();
                containerViews.setSize(800, 600);
                containerViews.setLayout(new GridLayout());
                frame.setDefaultCloseOperation(close);
                changeJPanel(viewController);
                frame.getContentPane().add(containerViews);
                frame.setVisible(true);
            }
        });
    }

    public static void changeJPanel(ViewController viewController) {
        containerViews.add(viewController.getView(), BorderLayout.CENTER);
        containerViews.updateUI();

    }

}
