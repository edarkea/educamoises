package vinculacion.educamoises.model;

/**
 *
 * @author Edinson Ayui
 */
public class Cuestionario {

    private String titulo;
    private String estudiante;
    private String fecha;
    private String curso;
    private String jornada;
    private String docente;

    public Cuestionario() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNombre() {
        return estudiante;
    }

    public void setNombre(String nombre) {
        this.estudiante = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

}
