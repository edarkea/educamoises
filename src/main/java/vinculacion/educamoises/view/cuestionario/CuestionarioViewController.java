package vinculacion.educamoises.view.cuestionario;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;
import static vinculacion.educamoises.utils.FrameUtil.changeJPanel;
import static vinculacion.educamoises.utils.FrameUtil.containerViews;
import vinculacion.educamoises.view.LoginViewController;
import vinculacion.educamoises.view.ViewController;

/**
 *
 * @author Edinson Ayui
 */
public class CuestionarioViewController extends ViewController implements ActionListener, MouseListener {

    private final CuestionarioView view = new CuestionarioView();
    private final CuestionarioView1Controller view1 = new CuestionarioView1Controller();
    private final CuestionarioView2Controller view2 = new CuestionarioView2Controller();
     
    public CuestionarioViewController() {
        init();
    }

    @Override
    public JPanel getView() {
        return view;
    }

    @Override
    public void initEvent() {
        view.container.add(view1.getView());
        view.siguiente.addActionListener(this);
        view.siguiente.addMouseListener(this);
        view.volver.addActionListener(this);
        view.volver.addMouseListener(this);
    }

    @Override
    public void removeView() {
     containerViews.removeAll();
    }

    public void removeContainer() {
        view.container.removeAll();
    }

    public void updateContainer() {
        view.container.updateUI();
    }
    
    public void addContainer(ViewController viewController) {
        view.container.add(viewController.getView());
    }
    

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource().equals(view.volver)) {

             if (view2.getView().isVisible()) {
                removeContainer();
                addContainer(view1);
                updateContainer();
            }
            if (view1.getView().isVisible()) {
              
            removeView();
            changeJPanel(new LoginViewController());
            
            }
             
        }

        if (ae.getSource().equals(view.siguiente)) {

            if (view1.getView().isVisible()) {
                removeContainer();
                addContainer(view2);
                view.volver.setText("Cancelar");
                view.siguiente.setText("Terminar");
                updateContainer();
            }
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
        if (me.getSource().equals(view.siguiente)) {
            view.siguiente.setForeground(new Color(255, 255, 255));
        }

        if (me.getSource().equals(view.volver)) {
            view.volver.setForeground(new Color(255, 255, 255));
        }
    }

    @Override
    public void mouseExited(MouseEvent me) {
        if (me.getSource().equals(view.siguiente)) {
            view.siguiente.setForeground(new Color(0, 0, 0));
        }
        if (me.getSource().equals(view.volver)) {
            view.volver.setForeground(new Color(0, 0, 0));
        }
    }

}
