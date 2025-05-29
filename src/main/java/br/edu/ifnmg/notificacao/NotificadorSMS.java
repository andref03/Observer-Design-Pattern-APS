package br.edu.ifnmg.notificacao;

import java.io.File;

/**
 *
 * @author IFNMG
 */
public class NotificadorSMS implements NotificacaoListener {

    private final String numero;

    public NotificadorSMS(String numero) {
        this.numero = numero;
    }

    @Override
    public void notificar(String evento, File arquivo) {
        System.out.println("[SMS] Para: " + numero + " | Evento: " + evento + " | Arquivo: " + arquivo.getName());
    }
}
