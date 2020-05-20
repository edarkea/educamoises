package vinculacion.educamoises.model;

/**
 *
 * @author Edinson Ayui
 */
public enum TipoRespuesta {

    SELECCION(1, "Selección"),
    MULTIPLE(2, "Múltiple"),
    ABIERTA(3, "Abierta"),
    VOF(3, "Abierta");

    public final int codigo;
    public final String nombre;

    private TipoRespuesta(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

}
