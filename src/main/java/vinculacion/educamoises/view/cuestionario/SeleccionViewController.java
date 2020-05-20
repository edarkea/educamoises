package vinculacion.educamoises.view.cuestionario;

import java.awt.CheckboxGroup;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;

import javax.swing.JPanel;
import vinculacion.educamoises.view.ViewController;

public class SeleccionViewController extends ViewController implements ActionListener {

    private final SeleccionView view = new SeleccionView();

    public SeleccionViewController() {
          init();
           
    }

    @Override
    public JPanel getView() {

        return view;
    }

    @Override
    public void initEvent() {
       ButtonGroup bg = new ButtonGroup();
       bg.add(view.jRadioButton1);
       bg.add(view.jRadioButton2);
       bg.add(view.jRadioButton3);
       bg.add(view.jRadioButton4);
  
    }

    @Override
    public void removeView() {

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
      
    }

}
