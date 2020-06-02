package vinculacion.educamoises.utils;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import vinculacion.educamoises.model.Bloque;
import vinculacion.educamoises.model.Cuestionario;
import vinculacion.educamoises.model.Pregunta;
import vinculacion.educamoises.model.TipoRespuesta;
import vinculacion.educamoises.view.components.Trivia;

/**
 *
 * @author Edinson Ayui
 */
public class CuestionarioUtil {

    public static ArrayList<Trivia> generarCuestionarios(Cuestionario cuestionario) {
        ArrayList<Trivia> preguntas = new ArrayList<>();
        Collections.sort(cuestionario.getBloques());
        for (Bloque bloque : cuestionario.getBloques()) {
            preguntas.add(new Trivia(bloque));
        }
        return preguntas;
    }

    public static List<JPanel> generarCuestionario(Cuestionario cuestionario) {
        List<JPanel> preguntas_ = new ArrayList<>();
        Collections.sort(cuestionario.getBloques());
        for (Bloque bloque : cuestionario.getBloques()) {
            JPanel panel = new JPanel();
            panel.setBackground(new Color(245, 201, 130));
            panel.setLayout(new GridLayout(2, 1));
            JLabel descripcion = new JLabel(bloque.getNumero() + ". " + bloque.getDescripcion());
            if (bloque.getDescripcion().length() > 14) {
                descripcion.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
            } else {
                descripcion.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
            }
            JPanel preguntas = new JPanel(new GridLayout(4, 1));
            preguntas.setBackground(new Color(245, 201, 130));

            for (Pregunta pregunta : bloque.getPreguntas()) {
                if (pregunta.getInstruccion().isEmpty()) {
                    continue;
                }
                if (pregunta.getTipo() == TipoRespuesta.MULTIPLE.codigo) {
                    JCheckBox literal = new JCheckBox(pregunta.getInstruccion());
                    literal.setBackground(new Color(245, 201, 130));
                    literal.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
                    if (pregunta.getInstruccion().length() > 14) {
                        literal.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
                    }
                    preguntas.add(literal);
                }
                if (pregunta.getTipo() == TipoRespuesta.SELECCION.codigo) {
                    JCheckBox literal = new JCheckBox(pregunta.getInstruccion());
                    literal.setBackground(new Color(245, 201, 130));
                    literal.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
                    if (pregunta.getInstruccion().length() > 14) {
                        literal.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
                    }
                    preguntas.add(literal);
                }
                if (pregunta.getTipo() == TipoRespuesta.ABIERTA.codigo) {
                    JTextField literal = new JTextField();
                    literal.setBackground(new Color(245, 201, 130));
                    literal.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
                    if (pregunta.getInstruccion().length() > 14) {
                        literal.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
                    }
                    preguntas.add(literal);
                }
            }
            panel.add(descripcion);
            panel.add(preguntas);

            preguntas_.add(panel);
        }
        return preguntas_;
    }
}
