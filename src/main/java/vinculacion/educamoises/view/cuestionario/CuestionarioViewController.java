package vinculacion.educamoises.view.cuestionario;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import vinculacion.educamoises.view.ViewController;

/**
 *
 * @author Edinson Ayui
 */
public class CuestionarioViewController extends ViewController {

    private final CuestionarioView view = new CuestionarioView();

    public CuestionarioViewController(JTabbedPane plataforma) {
 
        init();
    }

    @Override
    public JPanel getView() {
        return view;
    }

    @Override
    public void initEvent() {
    }
 @Override
    public void removeView() {
       
    }
 
}
