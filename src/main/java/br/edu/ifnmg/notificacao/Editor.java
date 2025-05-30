package br.edu.ifnmg.notificacao;

import java.io.File;

/**
 *
 * @author andre
 */
public class Editor {

    public final EventManager eventos = new EventManager();

    public void acionarEvento(String tipoEvento, String origem) {
        File eventoSimulado = new File(origem);
        eventos.disparar(tipoEvento, eventoSimulado);
    }
}
