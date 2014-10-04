package models;

import flexjson.JSONSerializer;
import play.modules.morphia.Model;

/**
 *
 * @author Enrique Ruiz Cisneros
 * @version 1
 * @since 30-sep-2014
 * @see
 */
public class BaseModel extends Model {

    /**
     * Devuelve el objeto en formato serializable de Javascript.
     *
     * @return Objeto convertido en formato JSON
     */
    public static JSONSerializer toJsonListSerializer() {
        JSONSerializer ser = new JSONSerializer();
        ser.exclude("*.class");
        ser.exclude("*.persistent");
        ser.exclude("*._created");
        ser.exclude("*._id");
        ser.exclude("*.manual");
        ser.exclude("*.blobChanged");
        ser.exclude("*.inc");
        ser.exclude("*.id_");
        ser.exclude("*.id");
        ser.exclude("*.embedded_");
        ser.exclude("*.new");
        ser.exclude("*.userDefinedId_");
        return ser;
    }

}
