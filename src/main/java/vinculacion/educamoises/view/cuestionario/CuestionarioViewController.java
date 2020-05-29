package vinculacion.educamoises.view.cuestionario;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import vinculacion.educamoises.controller.CuestionarioJpaController;
import vinculacion.educamoises.model.Bloque;
import vinculacion.educamoises.model.Cuestionario;
import vinculacion.educamoises.model.Materia;
import vinculacion.educamoises.model.Pregunta;
import vinculacion.educamoises.model.TipoRespuesta;
import vinculacion.educamoises.utils.ConnectionUtil;
import static vinculacion.educamoises.utils.FrameUtil.changeJPanel;
import static vinculacion.educamoises.utils.FrameUtil.containerViews;
import vinculacion.educamoises.view.LoginViewController;
import vinculacion.educamoises.view.ViewController;

/**
 *
 * @author Edinson Ayui
 */
public class CuestionarioViewController extends ViewController implements ActionListener, MouseListener {

    private final CuestionarioView view = new CuestionarioView();
    private final CuestionarioListaViewController listav = new CuestionarioListaViewController();
    private final CuestionarioView1Controller view1 = new CuestionarioView1Controller();
    private final CuestionarioView2Controller view2 = new CuestionarioView2Controller();
    private Cuestionario cuestionario;
    private final CuestionarioJpaController controller;

    public CuestionarioViewController() {
        controller = new CuestionarioJpaController(ConnectionUtil.emf);
        init();
    }

    @Override
    public JPanel getView() {
        return view;
    }

    @Override
    public void initEvent() {
        view.container.add(listav.getView());
        view.siguiente.addActionListener(this);
        view.siguiente.addMouseListener(this);
        view.volver.addActionListener(this);
        view.volver.addMouseListener(this);
        view.siguiente.setActionCommand("crear");
        view.volver.setActionCommand("listar");
        view2.abierta.view.jButton1.addActionListener(this);
        view2.abierta.view.jButton1.setActionCommand("abierta");
        view2.seleccion.view.jButton1.addActionListener(this);
        view2.seleccion.view.jButton1.setActionCommand("seleccion");
        view2.multiple.view.jButton1.addActionListener(this);
        view2.multiple.view.jButton1.setActionCommand("multiple");
        listarCuestionarios();
    }

    @Override
    public void removeView() {
        containerViews.removeAll();
    }

    public void removeContainer() {
        view.container.removeAll();
    }

    public void updateContainer() {
        view.container.updateUI();
    }

    public void addContainer(ViewController viewController) {
        view.container.add(viewController.getView());
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        switch (ae.getActionCommand()) {
            case "salir":
                removeView();
                changeJPanel(new LoginViewController());
                break;
            case "listar":
                guardarTodo();
                removeContainer();
                addContainer(listav);
                listarCuestionarios();
                cambiarComandos("salir", "crear", "Salir", "Crear");
                updateContainer();
                break;
            case "crear":
                cuestionario = new Cuestionario();
                removeContainer();
                addContainer(view1);
                cambiarComandos("listar", "crear2", "Volver", "Siguiente");
                updateContainer();
                break;
            case "crear2":
                if (!guardarEncabezado()) {
                    break;
                }
                removeContainer();
                addContainer(view2);
                cambiarComandos("crear", "listar", "Atrás", "Finalizar");
                updateContainer();
                break;
            case "seleccion":
                guardarPregunta();
                break;
            case "abierta":
                guardarPregunta();
                break;
            case "multiple":
                guardarPregunta();
                break;
        }
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
        if (me.getSource().equals(view.siguiente)) {
            view.siguiente.setForeground(new Color(255, 255, 255));
        }

        if (me.getSource().equals(view.volver)) {
            view.volver.setForeground(new Color(255, 255, 255));
        }
    }

    @Override
    public void mouseExited(MouseEvent me) {
        if (me.getSource().equals(view.siguiente)) {
            view.siguiente.setForeground(new Color(0, 0, 0));
        }
        if (me.getSource().equals(view.volver)) {
            view.volver.setForeground(new Color(0, 0, 0));
        }
    }

    private void cambiarComandos(String iz, String der, String izt, String dert) {
        view.volver.setActionCommand(iz);
        view.siguiente.setActionCommand(der);
        view.volver.setText(izt);
        view.siguiente.setText(dert);
    }

    private boolean guardarEncabezado() {
        if (cuestionario == null) {
            JOptionPane.showMessageDialog(view, "Se a producido un error", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        String titulo = view1.view.jTextField1.getText();
        String grado = view1.view.jComboBox1.getSelectedItem().toString();
        int materia = ((Materia) view1.view.jComboBox2.getSelectedItem()).getCodigo();
        String docente = view1.view.jTextField3.getText();

        if (titulo.isEmpty() || docente.isEmpty()) {
            JOptionPane.showMessageDialog(view, "Existen campos vacios", "Peligro", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        cuestionario.setTitulo(titulo);
        cuestionario.setCurso(grado);
        cuestionario.setMateria(materia);
        cuestionario.setDocente(docente);
        return true;
    }

    private void guardarTodo() {
        if (cuestionario == null) {
            return;
        }
        controller.create(cuestionario);
        JOptionPane.showMessageDialog(containerViews, "Cuestionario guardado", "Exito", JOptionPane.INFORMATION_MESSAGE);
    }

    private void guardarPregunta() {
        if (cuestionario == null) {
            return;
        }

        if (view2.view.jRadioButton1.isSelected()) {
            Bloque bloque = new Bloque(cuestionario.getBloques().size() + 1, view2.seleccion.view.jTextField2.getText());

            String respuesta = "";

            if (view2.seleccion.view.jRadioButton1.isSelected()) {
                respuesta = view2.seleccion.view.jTextField1.getText();
            }
            if (view2.seleccion.view.jRadioButton2.isSelected()) {
                respuesta = view2.seleccion.view.jTextField3.getText();
            }
            if (view2.seleccion.view.jRadioButton3.isSelected()) {
                respuesta = view2.seleccion.view.jTextField5.getText();
            }
            if (view2.seleccion.view.jRadioButton4.isSelected()) {
                respuesta = view2.seleccion.view.jTextField4.getText();
            }

            Pregunta p1 = new Pregunta(
                    "a. ", view2.seleccion.view.jTextField1.getText(), TipoRespuesta.SELECCION.codigo, respuesta, ""
            );
            Pregunta p2 = new Pregunta(
                    "b. ", view2.seleccion.view.jTextField3.getText(), TipoRespuesta.SELECCION.codigo, respuesta, ""
            );
            Pregunta p3 = new Pregunta(
                    "c. ", view2.seleccion.view.jTextField5.getText(), TipoRespuesta.SELECCION.codigo, respuesta, ""
            );
            Pregunta p4 = new Pregunta(
                    "d. ", view2.seleccion.view.jTextField4.getText(), TipoRespuesta.SELECCION.codigo, respuesta, ""
            );

            bloque.getPreguntas().add(p1);
            bloque.getPreguntas().add(p2);
            bloque.getPreguntas().add(p3);
            bloque.getPreguntas().add(p4);

            cuestionario.getBloques().add(bloque);
            view2.seleccion.limpiar();
        }

        if (view2.view.jRadioButton2.isSelected()) {
            Bloque bloque = new Bloque(cuestionario.getBloques().size() + 1, view2.multiple.view.jTextField2.getText());

            String respuesta1 = "";
            String respuesta2 = "";
            String respuesta3 = "";
            String respuesta4 = "";

            if (view2.multiple.view.jCheckBox1.isSelected()) {
                respuesta1 = view2.multiple.view.jTextField1.getText();
            }
            if (view2.multiple.view.jCheckBox2.isSelected()) {
                respuesta2 = view2.multiple.view.jTextField3.getText();
            }
            if (view2.multiple.view.jCheckBox3.isSelected()) {
                respuesta3 = view2.multiple.view.jTextField5.getText();
            }
            if (view2.multiple.view.jCheckBox4.isSelected()) {
                respuesta4 = view2.multiple.view.jTextField4.getText();
            }

            Pregunta p1 = new Pregunta(
                    "a. ", view2.multiple.view.jTextField1.getText(), TipoRespuesta.MULTIPLE.codigo, respuesta1, ""
            );
            Pregunta p2 = new Pregunta(
                    "b. ", view2.multiple.view.jTextField3.getText(), TipoRespuesta.SELECCION.codigo, respuesta2, ""
            );
            Pregunta p3 = new Pregunta(
                    "c. ", view2.multiple.view.jTextField5.getText(), TipoRespuesta.SELECCION.codigo, respuesta3, ""
            );
            Pregunta p4 = new Pregunta(
                    "d. ", view2.multiple.view.jTextField4.getText(), TipoRespuesta.SELECCION.codigo, respuesta4, ""
            );

            bloque.getPreguntas().add(p1);
            bloque.getPreguntas().add(p2);
            bloque.getPreguntas().add(p3);
            bloque.getPreguntas().add(p4);

            cuestionario.getBloques().add(bloque);
            view2.multiple.limpiar();
        }

        if (view2.view.jRadioButton3.isSelected()) {
            Bloque bloque = new Bloque(cuestionario.getBloques().size() + 1, "Escriba la respuesta correcta: ");

            String respuesta1 = view2.abierta.view.jTextField1.getText();

            Pregunta p1 = new Pregunta(
                    "a. ", view2.abierta.view.jTextField2.getText(), TipoRespuesta.ABIERTA.codigo, respuesta1, ""
            );

            bloque.getPreguntas().add(p1);

            cuestionario.getBloques().add(bloque);
            view2.abierta.limpiar();
        }

    }

    private void listarCuestionarios() {
        DefaultTableModel modelo = (DefaultTableModel) listav.view.jTable2.getModel();
        modelo.setRowCount(0);
        List<Cuestionario> list = controller.findCuestionarioEntities();
        for (Cuestionario cuestionario1 : list) {
            modelo.addRow(new Object[]{
                cuestionario1.getId(),
                cuestionario1.getTitulo(),
                cuestionario1.getCurso(),
                cuestionario1.getParalelo()
            });
        }
        listav.view.jTable2.setModel(modelo);
    }
}
