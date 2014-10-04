package models;

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

}
