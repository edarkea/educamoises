package vinculacion.educamoises.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Edinson Ayui
 */
@Entity
@Table(name = "preguntas")
public class Pregunta implements Comparable<Pregunta>, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column private String literal;
    @Column private String instruccion;
    @Column private int tipo;
    @Column private String respuesta;
    @Column private String pathImg;

    public Pregunta(String literal, String instruccion, int tipo, String respuesta, String pathImg) {
        this.literal = literal;
        this.instruccion = instruccion;
        this.tipo = tipo;
        this.respuesta = respuesta;
        this.pathImg = pathImg;
    }

    public Pregunta() {
    }

    public String getLiteral() {
        return literal;
    }

    public void setLiteral(String literal) {
        this.literal = literal;
    }

    public String getInstruccion() {
        return instruccion;
    }

    public void setInstruccion(String instruccion) {
        this.instruccion = instruccion;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getPathImg() {
        return pathImg;
    }

    public void setPathImg(String pathImg) {
        this.pathImg = pathImg;
    }

    @Override
    public int compareTo(Pregunta o) {
        if (o == null || o.getLiteral() == null) {
            return 0;
        }

        return getLiteral().compareTo(o.getLiteral());

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Pregunta{" + "id=" + id + ", literal=" + literal + ", instruccion=" + instruccion + ", tipo=" + tipo + ", respuesta=" + respuesta + ", pathImg=" + pathImg + '}';
    }

}
