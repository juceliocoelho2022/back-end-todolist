package com.juceliocoelho.backendtodolist;

import com.juceliocoelho.backendtodolist.entity.Todo;

import java.util.ArrayList;
import java.util.List;

public class TestConstants {
    public static final List<Todo> TODOS = new ArrayList<>() {
        {
            add(new Todo(9995L, "@juceliocoelho", "Curtir", false, 1));
            add(new Todo(9996L, "@juceliocoelho", "Comentar", false, 1));
            add(new Todo(9997L, "@juceliocoelho", "Compartilhar", false, 1));
            add(new Todo(9998L, "@juceliocoelho", "Se Inscrever", false, 1));
            add(new Todo(9999L, "@juceliocoelho", "Ativar as Notificações", false, 1));
        }
    };

    public static final Todo TODO = TODOS.get(0);
}
