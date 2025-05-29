package br.edu.ifnmg.notificacao;

/**
 *
 * @author andre
 */
public class Testes {

    public static void teste01() {
        Editor editor = new Editor();

        // Simulando o LinkedIn
        String empresa = "LinkedIn";

        editor.eventos.registrar("nova_conexao", new NotificadorEmail("andre@yahoo.com.br"));
        editor.eventos.registrar("nova_conexao", new NotificadorApp("usuarioLinkedIn"));
        editor.eventos.registrar("mensagem_recebida", new NotificadorSMS("+55 038 9 9999-9999"));
        editor.eventos.registrar("perfil_visualizado", new NotificadorApp("usuarioLinkedIn"));

        System.out.println(">>> Nova conexão recebida:");
        editor.acionarEvento("nova_conexao", "João Silva");

        System.out.println("\n>>> Mensagem recebida:");
        editor.acionarEvento("mensagem_recebida", "Recrutador da Empresa X");

        System.out.println("\n>>> Alguém visualizou seu perfil:");
        editor.acionarEvento("perfil_visualizado", "Maria Souza");
    }

}
