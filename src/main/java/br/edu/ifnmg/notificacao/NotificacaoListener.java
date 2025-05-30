package br.edu.ifnmg.notificacao;

import java.io.File;

/**
 *
 * @author andre
 */
public interface NotificacaoListener {

    void notificar(String evento, File arquivo);
}
