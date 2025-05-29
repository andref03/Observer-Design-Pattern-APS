package br.edu.ifnmg.notificacao;

import java.io.File;

/**
 *
 * @author IFNMG
 */
public interface NotificacaoListener {

    void notificar(String evento, File arquivo);
}
