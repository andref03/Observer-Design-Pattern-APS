package br.edu.ifnmg.notificacao;

import java.io.File;

/**
 *
 * @author andre
 */
public class NotificadorEmail implements NotificacaoListener {

    private final String email;

    public NotificadorEmail(String email) {
        this.email = email;
    }

    @Override
    public void notificar(String evento, File arquivo) {
        System.out.println("[EMAIL] Para: " + email + " | Evento: " + evento + " | Origem: " + arquivo.getName());
    }

}
