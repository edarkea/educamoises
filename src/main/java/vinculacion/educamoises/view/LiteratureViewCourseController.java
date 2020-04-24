package vinculacion.educamoises.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;
import org.pushingpixels.substance.api.SubstanceLookAndFeel;
import vinculacion.educamoises.view.cuestionario.CuestionarioViewController;

/**
 *
 * @author Edinson Ayui
 */
public class LiteratureViewCourseController extends ViewController implements ActionListener,MouseListener {

    private final LiteratureViewCourse view = new LiteratureViewCourse();

    public LiteratureViewCourseController() {
        super(null);
        initEvent();
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
        
        view.jButton3.addMouseListener(this);
        view.jButton4.addMouseListener(this);
        view.jButton5.addMouseListener(this);
        
       // view.jButton6.addActionListener(this);
    }

    @Override
    public void exit() {
        System.exit(0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     /*   if (e.getSource().equals(view.jButton1)) {
         //   view.jTabbedPane1.add(new CuestionarioViewController(view.jTabbedPane1).getView(), "Cuestionarios");
        }*/
   
        if (e.getSource().equals(view.jButton3)) {

        }
        if (e.getSource().equals(view.jButton4)) {

        }
        if (e.getSource().equals(view.jButton5)) {

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
    }

}
