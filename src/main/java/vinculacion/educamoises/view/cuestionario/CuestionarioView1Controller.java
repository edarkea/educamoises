

package vinculacion.educamoises.view.cuestionario;

import javax.swing.JPanel;
import vinculacion.educamoises.view.ViewController;


public class CuestionarioView1Controller extends ViewController {
private final CuestionarioView1 view = new CuestionarioView1();


public CuestionarioView1Controller(){
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
