package vinculacion.educamoises.view.cuestionario;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;

import vinculacion.educamoises.view.ViewController;

public class CuestionarioView2Controller extends ViewController implements ActionListener {

    private final CuestionarioView2 view = new CuestionarioView2();

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
        view.containerCuestionario.add(viewController.getView());
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (view.jRadioButton1.isSelected()) {

            removeContainerCuestionario();
            SeleccionViewController seleccion = new SeleccionViewController();
            addView(seleccion);
            updateContainerCuestionario();
        }

        if (view.jRadioButton2.isSelected()) {

            removeContainerCuestionario();
            MultipleViewController multiple = new MultipleViewController();
            addView(multiple);
            updateContainerCuestionario();
        }

        if (view.jRadioButton3.isSelected()) {

            removeContainerCuestionario();
            AbiertaViewController abierta = new AbiertaViewController();
            addView(abierta);

            updateContainerCuestionario();

        }
    }

}
