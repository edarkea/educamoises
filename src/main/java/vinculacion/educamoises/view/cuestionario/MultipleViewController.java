
package vinculacion.educamoises.view.cuestionario;

import javax.swing.JPanel;
import vinculacion.educamoises.view.ViewController;


public class MultipleViewController extends ViewController{
 
    private final MultipleView view=new MultipleView();
         
    
    public  MultipleViewController(){
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
