package vinculacion.educamoises.view.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import vinculacion.educamoises.model.Bloque;
import vinculacion.educamoises.model.TipoRespuesta;

/**
 *
 * @author Edinson Ayui
 */
public class Trivia extends JPanel implements ActionListener {

    private final JPanel superior;
    private final JPanel inferior;
    private final JRadioButton ro1;
    private final JRadioButton ro2;
    private final JRadioButton ro3;
    private final JRadioButton ro4;
    private final JCheckBox co1;
    private final JCheckBox co2;
    private final JCheckBox co3;
    private final JCheckBox co4;
    private final JTextField respuesta;
    private ArrayList<JLabel> descripciones = new ArrayList<>();
    private Bloque bloque;
    private boolean correcto = false;
    private ButtonGroup grupo = new ButtonGroup();

    public Trivia(Bloque bloque) {
        this.bloque = bloque;
        this.setBackground(new Color(245, 201, 130));
        this.setLayout(new GridLayout(2, 1));
        this.superior = new JPanel();
        this.superior.setBackground(new Color(245, 201, 130));
        this.superior.setLayout(new BoxLayout(superior, BoxLayout.Y_AXIS));

        this.inferior = new JPanel();
        this.inferior.setBackground(new Color(245, 201, 130));
        this.inferior.setLayout(new BoxLayout(inferior, BoxLayout.Y_AXIS));

        this.ro1 = new JRadioButton();
        this.ro1.setBackground(new Color(245, 201, 130));
        this.ro1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        this.ro2 = new JRadioButton();
        this.ro2.setBackground(new Color(245, 201, 130));
        this.ro2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        this.ro3 = new JRadioButton();
        this.ro3.setBackground(new Color(245, 201, 130));
        this.ro3.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        this.ro4 = new JRadioButton();
        this.ro4.setBackground(new Color(245, 201, 130));
        this.ro4.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

        this.grupo.add(ro1);
        this.grupo.add(ro2);
        this.grupo.add(ro3);
        this.grupo.add(ro4);

        this.co1 = new JCheckBox();
        this.co1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        this.co1.setBackground(new Color(245, 201, 130));
        this.co2 = new JCheckBox();
        this.co2.setBackground(new Color(245, 201, 130));
        this.co2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        this.co3 = new JCheckBox();
        this.co3.setBackground(new Color(245, 201, 130));
        this.co3.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        this.co4 = new JCheckBox();
        this.co4.setBackground(new Color(245, 201, 130));
        this.co4.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

        this.respuesta = new JTextField();
        this.respuesta.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        iniciarEventos();
        colocarDescripcion();
        colocarOpciones();
        this.add(superior);
        this.add(inferior);
    }

    private void iniciarEventos() {
        this.ro1.addActionListener(this);
        this.ro2.addActionListener(this);
        this.ro3.addActionListener(this);
        this.ro4.addActionListener(this);
        this.co1.addActionListener(this);
        this.co2.addActionListener(this);
        this.co3.addActionListener(this);
        this.co4.addActionListener(this);
    }

    public void colocarDescripcion() {

        String numero = bloque.getNumero().toString();
        String descripcion = bloque.getDescripcion();

        if (descripcion.length() < 15) {
            JLabel desp = new JLabel(descripcion);
            desp.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
            descripciones.add(desp);
        } else {
            String partes[] = descripcion.split(" ");
            String frase = numero + ". ";
            for (int i = 0; i < partes.length; i++) {
                if (i % 7 == 0 && i != 0) {
                    JLabel desp = new JLabel(frase);
                    desp.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
                    descripciones.add(desp);
                    frase = "";
                } else {
                    frase = frase + " " + partes[i];
                }
            }
            if (!frase.isEmpty()) {
                JLabel desp = new JLabel(frase);
                desp.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
                descripciones.add(desp);
            }
        }
        for (JLabel descripcione : descripciones) {
            this.superior.add(descripcione);
        }
    }

    public void colocarOpciones() {
        if (bloque.getPreguntas().get(0).getTipo() == TipoRespuesta.SELECCION.codigo) {
            this.ro1.setText(bloque.getPreguntas().get(0).getInstruccion());
            this.ro2.setText(bloque.getPreguntas().get(1).getInstruccion());
            this.ro3.setText(bloque.getPreguntas().get(2).getInstruccion());
            this.ro4.setText(bloque.getPreguntas().get(3).getInstruccion());
            JLabel desp = new JLabel("Seleccione una opción: ");
            desp.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
            this.superior.add(desp);
            if (!ro1.getText().isEmpty()) {
                this.inferior.add(ro1);
            }
            if (!ro2.getText().isEmpty()) {
                this.inferior.add(ro2);
            }
            if (!ro3.getText().isEmpty()) {
                this.inferior.add(ro3);
            }
            if (!ro4.getText().isEmpty()) {
                this.inferior.add(ro4);
            }
        }
        if (bloque.getPreguntas().get(0).getTipo() == TipoRespuesta.MULTIPLE.codigo) {
            this.co1.setText(bloque.getPreguntas().get(0).getInstruccion());
            this.co2.setText(bloque.getPreguntas().get(1).getInstruccion());
            this.co3.setText(bloque.getPreguntas().get(2).getInstruccion());
            this.co4.setText(bloque.getPreguntas().get(3).getInstruccion());
            JLabel desp = new JLabel("Seleccione una o varias opciones: ");
            desp.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
            this.superior.add(desp);
            if (!co1.getText().isEmpty()) {
                this.inferior.add(co1);
            }
            if (!co1.getText().isEmpty()) {
                this.inferior.add(co1);
            }
            if (!co1.getText().isEmpty()) {
                this.inferior.add(co1);
            }
            if (!co1.getText().isEmpty()) {
                this.inferior.add(co1);
            }
        }
        if (bloque.getPreguntas().get(0).getTipo() == TipoRespuesta.ABIERTA.codigo) {
            JLabel desp = new JLabel("Escriba una respuesta: ");
            desp.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
            this.superior.add(desp);
            this.inferior.add(respuesta);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.ro1)) {
            if (ro1.isSelected()) {
                if (ro1.getText().equals(this.bloque.getPreguntas().get(0).getRespuesta())) {
                    this.correcto = true;
                    JOptionPane.showMessageDialog(inferior, "Respuesta Correcta!", "Correcto", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(inferior, "Respuesta Incorrecta", "Incorrecto", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        if (e.getSource().equals(this.ro2)) {
            if (ro2.isSelected()) {
                if (ro2.getText().equals(this.bloque.getPreguntas().get(1).getRespuesta())) {
                    this.correcto = true;
                    JOptionPane.showMessageDialog(inferior, "Respuesta Correcta!", "Correcto", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(inferior, "Respuesta Incorrecta", "Incorrecto", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        if (e.getSource().equals(this.ro3)) {
            if (ro3.isSelected()) {
                if (ro3.getText().equals(this.bloque.getPreguntas().get(2).getRespuesta())) {
                    this.correcto = true;
                    JOptionPane.showMessageDialog(inferior, "Respuesta Correcta!", "Correcto", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(inferior, "Respuesta Incorrecta", "Incorrecto", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        if (e.getSource().equals(this.ro4)) {
            if (ro4.isSelected()) {
                if (ro4.getText().equals(this.bloque.getPreguntas().get(3).getRespuesta())) {
                    this.correcto = true;
                    JOptionPane.showMessageDialog(inferior, "Respuesta Correcta!", "Correcto", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(inferior, "Respuesta Incorrecta", "Incorrecto", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        if (e.getSource().equals(this.co1)) {
            if (co1.isSelected()) {
                if (co1.getText().equals(this.bloque.getPreguntas().get(0).getRespuesta())) {
                    this.correcto = true;
                    JOptionPane.showMessageDialog(inferior, "Respuesta Correcta!", "Correcto", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(inferior, "Respuesta Incorrecta", "Incorrecto", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        if (e.getSource().equals(this.co2)) {
            if (co2.isSelected()) {
                if (co2.getText().equals(this.bloque.getPreguntas().get(1).getRespuesta())) {
                    this.correcto = true;
                    JOptionPane.showMessageDialog(inferior, "Respuesta Correcta!", "Correcto", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(inferior, "Respuesta Incorrecta", "Incorrecto", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        if (e.getSource().equals(this.co3)) {
            if (co3.isSelected()) {
                if (co3.getText().equals(this.bloque.getPreguntas().get(2).getRespuesta())) {
                    this.correcto = true;
                    JOptionPane.showMessageDialog(inferior, "Respuesta Correcta!", "Correcto", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(inferior, "Respuesta Incorrecta", "Incorrecto", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        if (e.getSource().equals(this.co4)) {
            if (co4.isSelected()) {
                if (co4.getText().equals(this.bloque.getPreguntas().get(3).getRespuesta())) {
                    this.correcto = true;
                    JOptionPane.showMessageDialog(inferior, "Respuesta Correcta!", "Correcto", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(inferior, "Respuesta Incorrecta", "Incorrecto", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    public boolean isCorrecto() {
        return correcto;
    }
}
