package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends BaseController {

    public static void index() {
        render();
    }

    public static void datosPrueba() {

        TODO t1 = new TODO("Terminar la aplicacion", Boolean.FALSE);
        TODO t2 = new TODO("todo de prueba", Boolean.FALSE);
        TODO t3 = new TODO("Todo de pruebas", Boolean.TRUE);
        TODO t4 = new TODO("DATOS INICIALES", Boolean.FALSE);

        Lista lista = new Lista();
//        t1.validateAndSave();
//        t2.validateAndSave();
//        t3.validateAndSave();
//        t4.validateAndSave();

        lista.description = "Probando Probando";
        lista.title = "probando";
        lista.todos.add(t1);
        lista.todos.add(t2);
        lista.todos.add(t3);
        lista.todos.add(t4);

        lista.validateAndSave();
    }

}
