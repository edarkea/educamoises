package vinculacion.educamoises.view.cuestionario;

import javax.swing.JPanel;
import vinculacion.educamoises.view.ViewController;

public class MultipleViewController extends ViewController {

    public final MultipleView view = new MultipleView();

    public MultipleViewController() {
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

    void limpiar() {
        this.view.jTextField1.setText("");
        this.view.jTextField2.setText("");
        this.view.jTextField3.setText("");
        this.view.jTextField4.setText("");
        this.view.jTextField5.setText("");
        this.view.jCheckBox1.setSelected(false);
        this.view.jCheckBox2.setSelected(false);
        this.view.jCheckBox3.setSelected(false);
        this.view.jCheckBox4.setSelected(false);
    }

}
