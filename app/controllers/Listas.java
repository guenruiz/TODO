package controllers;

import java.util.List;
import models.Lista;

/**
 *
 * @author Enrique Ruiz Cisneros
 * @version 1
 * @since 30-sep-2014
 * @see
 */
public class Listas extends BaseController {
    
    public static void list() {
        List<Lista> listas = Lista.findAll();
        renderJSON(Lista.toJsonListSerializer().prettyPrint(true).include("todos").serialize(listas));
        //renderJSON(listas);
    }
}
