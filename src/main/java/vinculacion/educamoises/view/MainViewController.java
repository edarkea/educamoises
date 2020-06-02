package vinculacion.educamoises.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import static vinculacion.educamoises.utils.FrameUtil.changeJPanel;
import static vinculacion.educamoises.utils.FrameUtil.containerViews;
import vinculacion.educamoises.view.evaluacion.EvaluationViewController;

/**
 *
 * @author Edinson Ayui
 */
public class MainViewController extends ViewController implements ActionListener, MouseListener {

    private final MainView view = new MainView();

    public MainViewController() {
        initEvent();
    }

    @Override
    public JPanel getView() {
        return view;
    }

    @Override
    public void initEvent() {

        view.jButton2.addActionListener(this);
        view.jButton3.addActionListener(this);
        view.jButton4.addActionListener(this);
        view.jButton5.addActionListener(this);
        view.jButton6.addActionListener(this);
        view.profesor.addActionListener(this);
        view.jButton2.addMouseListener(this);
        view.jButton3.addMouseListener(this);
        view.jButton4.addMouseListener(this);
        view.jButton5.addMouseListener(this);
        view.jButton6.addMouseListener(this);
        view.profesor.addMouseListener(this);
    }

    @Override
    public void removeView() {
        containerViews.removeAll();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(view.jButton2)) {
            removeView();
            changeJPanel(new EvaluationViewController(1L, 52L, 103L, "Matemáticas"));
        }
        if (e.getSource().equals(view.jButton3)) {
            removeView();
            changeJPanel(new EvaluationViewController(149L, 200L, 251L, "Ciencias Naturales"));
        }
        if (e.getSource().equals(view.jButton4)) {
            removeView();
            changeJPanel(new EvaluationViewController(457L, 508L, 559L, "Lengua y Literatura"));
        }
        if (e.getSource().equals(view.jButton5)) {
            removeView();
            changeJPanel(new EvaluationViewController(302L, 353l, 406L, "Estudios Sociales"));
        }
        if (e.getSource().equals(view.jButton6)) {
            removeView();
            changeJPanel(new JuegosMainViewController());
        }

        if (e.getSource().equals(view.profesor)) {
            removeView();
            changeJPanel(new LoginViewController());
        }

    }

    @Override
    public void mouseClicked(MouseEvent me) {

    }

    @Override
    public void mousePressed(MouseEvent me) {

    }

    @Override
    public void mouseReleased(MouseEvent me) {

    }

    @Override
    public void mouseEntered(MouseEvent me) {
        if (me.getSource().equals(view.jButton2)) {
            view.jButton2.setForeground(new Color(255, 255, 255));
        }
        if (me.getSource().equals(view.jButton3)) {
            view.jButton3.setForeground(new Color(255, 255, 255));
        }
        if (me.getSource().equals(view.jButton4)) {
            view.jButton4.setForeground(new Color(255, 255, 255));
        }
        if (me.getSource().equals(view.jButton5)) {
            view.jButton5.setForeground(new Color(255, 255, 255));
        }
        if (me.getSource().equals(view.jButton6)) {
            view.jButton6.setForeground(new Color(255, 255, 255));
        }
        if (me.getSource().equals(view.profesor)) {
            view.profesor.setForeground(new Color(255, 255, 255));
        }

    }

    @Override
    public void mouseExited(MouseEvent me) {
        if (me.getSource().equals(view.jButton2)) {
            view.jButton2.setForeground(new Color(0, 0, 0));
        }
        if (me.getSource().equals(view.jButton3)) {
            view.jButton3.setForeground(new Color(0, 0, 0));
        }
        if (me.getSource().equals(view.jButton4)) {
            view.jButton4.setForeground(new Color(0, 0, 0));
        }
        if (me.getSource().equals(view.jButton5)) {
            view.jButton5.setForeground(new Color(0, 0, 0));
        }
        if (me.getSource().equals(view.profesor)) {
            view.profesor.setForeground(new Color(0, 0, 0));
        }
    }

}
