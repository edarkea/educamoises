package vinculacion.educamoises.model;

/**
 *
 * @author Edinson Ayui
 */
public class Pregunta implements Comparable<Pregunta> {

    private String literal;
    private String instruccion;
    private TipoRespuesta tipo;
    private String respuesta;
    private String pathImg;

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

    public TipoRespuesta getTipo() {
        return tipo;
    }

    public void setTipo(TipoRespuesta tipo) {
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

}
