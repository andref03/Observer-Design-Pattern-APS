package br.edu.ifnmg.notificacao;

import java.io.File;

/**
 *
 * @author IFNMG
 */
public class Editor {

    public final EventManager eventos = new EventManager();

    public void acionarEvento(String tipoEvento, String origem) {
        // Em vez de File, passamos um "arquivo simulado" com nome = origem do evento
        File eventoSimulado = new File(origem);
        eventos.disparar(tipoEvento, eventoSimulado);
    }
}
