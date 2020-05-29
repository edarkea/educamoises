package vinculacion.educamoises.view.cuestionario;

import javax.swing.JPanel;
import vinculacion.educamoises.view.ViewController;

public class CuestionarioListaViewController extends ViewController {

    public final CuestionarioListaView view = new CuestionarioListaView();

    public CuestionarioListaViewController() {
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
