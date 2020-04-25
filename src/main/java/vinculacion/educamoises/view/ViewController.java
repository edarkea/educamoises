package vinculacion.educamoises.view;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import org.pushingpixels.substance.api.SubstanceLookAndFeel;

/**
 *
 * @author Edinson Ayui
 */
public abstract class ViewController {

   

    
    public void init() {
        getView().putClientProperty(SubstanceLookAndFeel.TABBED_PANE_CLOSE_BUTTONS_PROPERTY,
                Boolean.TRUE);
        initEvent();
    }

    public abstract JPanel getView();

    public abstract void initEvent();

    public abstract void removeView();
    
   
}
