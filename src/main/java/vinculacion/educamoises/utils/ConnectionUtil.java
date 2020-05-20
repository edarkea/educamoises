package vinculacion.educamoises.utils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Edinson Ayui
 */
public class ConnectionUtil {

    public static EntityManagerFactory emf = null;

    static {
        emf = Persistence.createEntityManagerFactory("educamoisesPU");
    }
}
