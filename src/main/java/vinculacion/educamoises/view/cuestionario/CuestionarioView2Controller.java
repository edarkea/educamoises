package vinculacion.educamoises.view.cuestionario;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;

import vinculacion.educamoises.view.ViewController;

public class CuestionarioView2Controller extends ViewController implements ActionListener {

    public final CuestionarioView2 view = new CuestionarioView2();
    public final SeleccionViewController seleccion = new SeleccionViewController();
    public final MultipleViewController multiple = new MultipleViewController();
    public final AbiertaViewController abierta = new AbiertaViewController();

    public CuestionarioView2Controller() {
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

        view.jRadioButton1.addActionListener(this);
        view.jRadioButton2.addActionListener(this);
        view.jRadioButton3.addActionListener(this);
    }

    @Override
    public void removeView() {

    }

    public void removeContainerCuestionario() {
        view.containerCuestionario.removeAll();
    }

    public void updateContainerCuestionario() {
        view.containerCuestionario.updateUI();
    }

    public void addView(ViewController viewController) {
        view.containerCuestionario.add(viewController.getView(), BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (view.jRadioButton1.isSelected()) {

            removeContainerCuestionario();
            addView(seleccion);
            updateContainerCuestionario();
        }

        if (view.jRadioButton2.isSelected()) {

            removeContainerCuestionario();
            addView(multiple);
            updateContainerCuestionario();
        }

        if (view.jRadioButton3.isSelected()) {

            removeContainerCuestionario();
            addView(abierta);
            updateContainerCuestionario();

        }
    }

}
