package br.edu.ifnmg.notificacao;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author andre
 */
public class EventManager {

    private final Map<String, List<NotificacaoListener>> ouvintes = new HashMap<>();

    public void registrar(String evento, NotificacaoListener listener) {
        ouvintes.computeIfAbsent(evento, e -> new ArrayList<>()).add(listener);
    }

    public void remover(String evento, NotificacaoListener listener) {
        List<NotificacaoListener> lista = ouvintes.get(evento);
        if (lista != null) {
            lista.remove(listener);
        }
    }

    public void disparar(String evento, File arquivo) {
        List<NotificacaoListener> lista = ouvintes.get(evento);
        if (lista != null) {
            for (NotificacaoListener listener : lista) {
                listener.notificar(evento, arquivo);
            }
        }
    }
}
