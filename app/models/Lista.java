package models;

import com.google.code.morphia.annotations.Embedded;
import com.google.code.morphia.annotations.Entity;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import play.modules.morphia.Model.NoAutoTimestamp;

/**
 *
 * @author Enrique Ruiz Cisneros
 * @version 1
 * @since 30-sep-2014
 * @see Model
 */
@Entity(noClassnameStored = true)
@NoAutoTimestamp
public class Lista extends BaseModel {

    public String title;
    public String description;
    public Date date;
    @Embedded
    public List<TODO> todos = new ArrayList<>();

    public Lista() {
        this.date = new Date();
        this.todos = new ArrayList<>();
    }

    public Lista(String title, String description, Date date, List<TODO> todos) {
        this.title = title;
        this.description = description;
        this.date = date;
        this.todos = todos;
    }

}
