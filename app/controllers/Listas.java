package controllers;

import flexjson.JSONDeserializer;
import java.util.List;
import models.Lista;
import models.TODO;

/**
 *
 * @author Enrique Ruiz Cisneros
 * @version 1
 * @since 30-sep-2014
 * @see
 */
public class Listas extends BaseController {

    public static void list() {
        render();
    }

    public static void listJSON() {
        List<Lista> listas = Lista.findAll();
        renderJSON(Lista.toJsonListSerializer().include("todos").serialize(listas));
    }

    public static void todosByListJSON(String id) {
        Lista lista = Lista.findById(id);
        renderJSON(TODO.toJsonListSerializer().serialize(lista.todos));
    }

    public static void saveTodoList() {

        Lista lista;
        JSONDeserializer des = new JSONDeserializer<>();

        lista = (Lista) des.deserialize(params.get("body"));
        lista.save();
        renderJSON(lista);

    }
}
