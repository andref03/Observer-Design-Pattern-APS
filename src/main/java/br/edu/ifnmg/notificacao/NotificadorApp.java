package br.edu.ifnmg.notificacao;

import java.io.File;

/**
 *
 * @author IFNMG
 */
public class NotificadorApp implements NotificacaoListener {

    private final String usuario;

    public NotificadorApp(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public void notificar(String evento, File arquivo) {
        System.out.println("[APP] Usuário: " + usuario + " | Evento: " + evento + " | Origem: " + arquivo.getName());
    }
}
