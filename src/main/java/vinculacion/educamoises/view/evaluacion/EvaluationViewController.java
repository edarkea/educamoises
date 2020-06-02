package vinculacion.educamoises.view.evaluacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import vinculacion.educamoises.controller.CuestionarioJpaController;
import vinculacion.educamoises.utils.ConnectionUtil;
import vinculacion.educamoises.utils.CuestionarioUtil;
import vinculacion.educamoises.view.MainViewController;
import vinculacion.educamoises.view.ViewController;
import static vinculacion.educamoises.utils.FrameUtil.changeJPanel;
import static vinculacion.educamoises.utils.FrameUtil.containerViews;
import vinculacion.educamoises.view.components.Trivia;

/**
 *
 * @author Edinson Ayui
 */
public class EvaluationViewController extends ViewController implements ActionListener, MouseListener {

    private final EvaluationView view = new EvaluationView();
    private List<Trivia> preguntas = new ArrayList<>();
    private int preguntaActual = 0;
    private final Long tercero;
    private final Long quinto;
    private final Long septimo;
    
    public EvaluationViewController(Long tercero, Long quinto, Long septimo, String texto) {
        initEvent();
        this.view.text.setText(texto);
        this.tercero = tercero;
        this.quinto = quinto;
        this.septimo = septimo;
        view.Siguiente.setVisible(false);
    }

    public void generarCuestionario(Long id) {
        preguntas = CuestionarioUtil.generarCuestionarios(new CuestionarioJpaController(ConnectionUtil.emf).findCuestionario(id));
    }

    @Override
    public JPanel getView() {
        return view;
    }

    @Override
    public void initEvent() {
        view.jButton3.addActionListener(this);
        view.jButton4.addActionListener(this);
        view.jButton5.addActionListener(this);
        view.volver.addActionListener(this);
        view.Siguiente.addActionListener(this);

        view.jButton3.addMouseListener(this);
        view.jButton4.addMouseListener(this);
        view.jButton5.addMouseListener(this);
        view.Siguiente.addMouseListener(this);
        view.volver.addMouseListener(this);
        // view.jButton6.addActionListener(this);
    }

    @Override
    public void removeView() {
        containerViews.removeAll();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(view.Siguiente)) {
            preguntaActual++;
            navegarPreguntas();
        }
        if (e.getSource().equals(view.volver)) {
            preguntaActual--;
            navegarPreguntas();
        }
        //Realizar valuacion de 3ro
        if (e.getSource().equals(view.jButton3)) {
            view.Siguiente.setVisible(true);
            generarCuestionario(tercero);
            navegarPreguntas();
        }
        if (e.getSource().equals(view.jButton4)) {
            view.Siguiente.setVisible(true);
            generarCuestionario(quinto);
            navegarPreguntas();
        }
        if (e.getSource().equals(view.jButton5)) {
            view.Siguiente.setVisible(true);
            generarCuestionario(septimo);
            navegarPreguntas();
        }

        if (e.getSource().equals(view.volver)) {
            removeView();
            changeJPanel(new MainViewController());
        }
        /* if (e.getSource().equals(view.jButton6)) {

        }*/
    }

    @Override
    public void mouseClicked(MouseEvent me) {

    }

    @Override
    public void mousePressed(MouseEvent me) {

    }

    @Override
    public void mouseReleased(MouseEvent me) {

    }

    @Override
    public void mouseEntered(MouseEvent me) {

        if (me.getSource().equals(view.jButton3)) {
            view.jButton3.setForeground(new Color(255, 255, 255));
        }
        if (me.getSource().equals(view.jButton4)) {
            view.jButton4.setForeground(new Color(255, 255, 255));
        }
        if (me.getSource().equals(view.jButton5)) {
            view.jButton5.setForeground(new Color(255, 255, 255));
        }
        if (me.getSource().equals(view.Siguiente)) {
            view.volver.setForeground(new Color(255, 255, 255));
        }
        if (me.getSource().equals(view.volver)) {
            view.volver.setForeground(new Color(255, 255, 255));
        }

    }

    @Override
    public void mouseExited(MouseEvent me) {

        if (me.getSource().equals(view.jButton3)) {
            view.jButton3.setForeground(new Color(0, 0, 0));
        }
        if (me.getSource().equals(view.jButton4)) {
            view.jButton4.setForeground(new Color(0, 0, 0));
        }
        if (me.getSource().equals(view.jButton5)) {
            view.jButton5.setForeground(new Color(0, 0, 0));
        }
        if (me.getSource().equals(view.Siguiente)) {
            view.jButton5.setForeground(new Color(0, 0, 0));
        }
        if (me.getSource().equals(view.volver)) {
            view.volver.setForeground(new Color(0, 0, 0));
        }
    }

    public void removeContainerCuestionario() {
        view.containerBtn.removeAll();
    }

    public void updateContainerCuestionario() {
        view.containerBtn.updateUI();
    }

    public void addView(Trivia view) {
        this.view.containerBtn.add(view, BorderLayout.CENTER);
    }

    private void navegarPreguntas() {

        if (preguntaActual == preguntas.size() || preguntaActual == -1) {
            removeContainerCuestionario();
            updateContainerCuestionario();
            preguntaActual = 0;
            view.Siguiente.setVisible(false);
            return;
        }
        if (preguntaActual < preguntas.size()) {
            removeContainerCuestionario();
            addView(preguntas.get(preguntaActual));
            updateContainerCuestionario();
        }
        if (preguntaActual == preguntas.size() - 1) {
            view.Siguiente.setText("Terminar");
        }

    }
}
