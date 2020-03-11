package vinculacion.educamoises.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Edinson Ayui
 */
public class Bloque implements Comparable<Bloque> {

    private Integer numero;
    private String descripcion;
    private List<Pregunta> preguntas = new ArrayList<>();

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(List<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

    @Override
    public int compareTo(Bloque o) {
        if (numero == null || o == null || o.numero == null) {
            return -1;
        }
        return this.numero.compareTo(o.numero);
    }
}
