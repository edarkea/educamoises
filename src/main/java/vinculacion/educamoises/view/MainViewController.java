package vinculacion.educamoises.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import org.pushingpixels.substance.api.SubstanceLookAndFeel;
import vinculacion.educamoises.view.cuestionario.CuestionarioViewController;

/**
 *
 * @author Edinson Ayui
 */
public class MainViewController extends ViewController implements ActionListener {

    private final MainView view = new MainView();

    public MainViewController() {
        super(null);
        initEvent();
    }

    @Override
    public JPanel getView() {
        return view;
    }

    @Override
    public void initEvent() {
        view.jButton1.addActionListener(this);
        view.jButton2.addActionListener(this);
        view.jButton3.addActionListener(this);
        view.jButton4.addActionListener(this);
        view.jButton5.addActionListener(this);
        view.jButton6.addActionListener(this);
    }

    @Override
    public void exit() {
        System.exit(0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(view.jButton1)) {
            view.jTabbedPane1.add(new CuestionarioViewController(view.jTabbedPane1).getView(), "Cuestionarios");
        }
        if (e.getSource().equals(view.jButton2)) {

        }
        if (e.getSource().equals(view.jButton3)) {

        }
        if (e.getSource().equals(view.jButton4)) {

        }
        if (e.getSource().equals(view.jButton5)) {

        }
        if (e.getSource().equals(view.jButton6)) {

        }
    }

}
