package models;

import flexjson.JSONSerializer;
import play.modules.morphia.Model.NoAutoTimestamp;

/**
 *
 * @author Enrique Ruiz Cisneros
 * @version 1
 * @since 30-sep-2014
 * @see
 */
@NoAutoTimestamp
public class TODO extends BaseModel {

    public String todo;
    public Boolean completed;

    public TODO() {
        this.completed = Boolean.FALSE;
    }

    public TODO(String todo, Boolean completed) {
        this.todo = todo;
        this.completed = completed;
    }

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
        ser.exclude("*.idAsStr");
        return ser;
    }

}
