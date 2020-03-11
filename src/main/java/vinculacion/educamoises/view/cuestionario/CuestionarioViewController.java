package vinculacion.educamoises.view.cuestionario;

import javax.swing.JPanel;
import vinculacion.educamoises.view.ViewController;

/**
 *
 * @author Edinson Ayui
 */
public class CuestionarioViewController implements ViewController {

    private final CuestionarioView view = new CuestionarioView();

    @Override
    public JPanel getView() {
        return view;
    }

}
