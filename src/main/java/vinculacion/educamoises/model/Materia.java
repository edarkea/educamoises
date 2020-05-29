package vinculacion.educamoises.model;

/**
 *
 * @author Edinson Ayui
 */
public enum Materia {
    MATEMATICAS(1, "Matemáticas"),
    LENGUA(2, "Lengua y Literatura"),
    CIENCIAS(3, "Ciencias"),
    ESTUDIOS(4, "Estudios Sociales"),
    INGLES(5, "Inglés"),
    COMPUTACION(6, "Computación");

    private final int codigo;
    private final String nombre;

    private Materia(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
