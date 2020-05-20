package vinculacion.educamoises.view.cuestionario;

import javax.swing.JPanel;
import vinculacion.educamoises.view.ViewController;

public class AbiertaViewController extends ViewController {

    private final AbiertaView view = new AbiertaView();
    
    public   AbiertaViewController(){
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
