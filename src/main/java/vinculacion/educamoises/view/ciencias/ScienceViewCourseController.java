package vinculacion.educamoises.view.ciencias;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;
import vinculacion.educamoises.view.MainViewController;
import vinculacion.educamoises.view.ViewController;
import static vinculacion.educamoises.utils.FrameUtil.changeJPanel;
import static vinculacion.educamoises.utils.FrameUtil.containerViews;
import vinculacion.educamoises.view.ciencias.juego.JuegoController;

/**
 *
 * @author Edinson Ayui
 */
public class ScienceViewCourseController extends ViewController implements ActionListener, MouseListener {

    private final ScienceViewCourse view = new ScienceViewCourse();
    private  JuegoController viewJuego;

    public ScienceViewCourseController() {
        initEvent();
        view.Siguiente.setVisible(false);
    }

    @Override
    public JPanel getView() {
        return view;
    }

    @Override
    public void initEvent() {
        //view.jButton1.addActionListener(this);
        view.jButton3.addActionListener(this);
        view.jButton4.addActionListener(this);
        view.jButton5.addActionListener(this);
        view.volver.addActionListener(this);
        view.Siguiente.addActionListener(this);

        view.jButton3.addMouseListener(this);
        view.jButton4.addMouseListener(this);
        view.jButton5.addMouseListener(this);
        view.Siguiente.addMouseListener(this);
        view.volver.addMouseListener(this);
        // view.jButton6.addActionListener(this);
    }

    @Override
    public void removeView() {
        containerViews.removeAll();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /*   if (e.getSource().equals(view.jButton1)) {
         //   view.jTabbedPane1.add(new CuestionarioViewController(view.jTabbedPane1).getView(), "Cuestionarios");
        }*/

        if (e.getSource().equals(view.jButton3)) {
            viewJuego = new JuegoController("3");
            removeContainer();
            addContainer(viewJuego);
            updateContainer();
        }
        if (e.getSource().equals(view.jButton4)) {
            viewJuego = new JuegoController("5");
            removeContainer();
            addContainer(viewJuego);
            updateContainer();
        }
        if (e.getSource().equals(view.jButton5)) {
            viewJuego = new JuegoController("7");
            removeContainer();
            addContainer(viewJuego);
            updateContainer();
        }

        if (e.getSource().equals(view.volver)) {
            removeView();
            changeJPanel(new MainViewController());
        }
        /* if (e.getSource().equals(view.jButton6)) {

        }*/
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

        if (me.getSource().equals(view.jButton3)) {
            view.jButton3.setForeground(new Color(255, 255, 255));
        }
        if (me.getSource().equals(view.jButton4)) {
            view.jButton4.setForeground(new Color(255, 255, 255));
        }
        if (me.getSource().equals(view.jButton5)) {
            view.jButton5.setForeground(new Color(255, 255, 255));
        }
        if (me.getSource().equals(view.Siguiente)) {
            view.volver.setForeground(new Color(255, 255, 255));
        }
        if (me.getSource().equals(view.volver)) {
            view.volver.setForeground(new Color(255, 255, 255));
        }

    }

    @Override
    public void mouseExited(MouseEvent me) {

        if (me.getSource().equals(view.jButton3)) {
            view.jButton3.setForeground(new Color(0, 0, 0));
        }
        if (me.getSource().equals(view.jButton4)) {
            view.jButton4.setForeground(new Color(0, 0, 0));
        }
        if (me.getSource().equals(view.jButton5)) {
            view.jButton5.setForeground(new Color(0, 0, 0));
        }
        if (me.getSource().equals(view.Siguiente)) {
            view.jButton5.setForeground(new Color(0, 0, 0));
        }
        if (me.getSource().equals(view.volver)) {
            view.volver.setForeground(new Color(0, 0, 0));
        }
    }

    public void removeContainerCuestionario() {
        view.containerBtn.removeAll();
    }

    public void updateContainerCuestionario() {
        view.containerBtn.updateUI();
    }

    public void addView(JPanel view) {
        this.view.containerBtn.add(view, BorderLayout.CENTER);
    }

    public void removeContainer() {
        view.containerBtn.removeAll();
    }

    public void addContainer(ViewController viewController) {
        view.containerBtn.add(viewController.getView());
    }

    public void updateContainer() {
        view.containerBtn.updateUI();
    }
}
