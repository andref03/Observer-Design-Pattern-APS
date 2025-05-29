package br.edu.ifnmg.notificacao;

/**
 *
 * @author andre
 */
public class Testes {

    // Teste 01: Simula uso do LinkedIn
    public static void teste01() {
        Editor editor = new Editor();
        String empresa = "LinkedIn";

        editor.eventos.registrar("nova_conexao", new NotificadorEmail("andre@yahoo.com.br"));
        editor.eventos.registrar("nova_conexao", new NotificadorApp("usuarioLinkedIn"));
        editor.eventos.registrar("mensagem_recebida", new NotificadorSMS("+55 038 9 9999-9999"));
        editor.eventos.registrar("perfil_visualizado", new NotificadorApp("usuarioLinkedIn"));

        System.out.println(">>> [LinkedIn] Nova conexão recebida:");
        editor.acionarEvento("nova_conexao", "João Silva");

        System.out.println("\n>>> [LinkedIn] Mensagem recebida:");
        editor.acionarEvento("mensagem_recebida", "Recrutador da Empresa X");

        System.out.println("\n>>> [LinkedIn] Alguém visualizou seu perfil:");
        editor.acionarEvento("perfil_visualizado", "Maria Souza");
    }

    // Teste 02: Simula notificações do Instagram
    public static void teste02() {
        Editor editor = new Editor();
        String empresa = "Instagram";

        editor.eventos.registrar("nova_seguidora", new NotificadorApp("usuarioInsta"));
        editor.eventos.registrar("curtida_recebida", new NotificadorEmail("meuemail@insta.com"));
        editor.eventos.registrar("comentario_novo", new NotificadorSMS("+55 11 99999-8888"));

        System.out.println("\n>>> [Instagram] Nova seguidora:");
        editor.acionarEvento("nova_seguidora", "Camila Andrade");

        System.out.println("\n>>> [Instagram] Alguém curtiu sua foto:");
        editor.acionarEvento("curtida_recebida", "foto_praia.png");

        System.out.println("\n>>> [Instagram] Novo comentário:");
        editor.acionarEvento("comentario_novo", "Pedro comentou: Muito bom!");
    }

    // Teste 03: Simula alertas do GitHub
    public static void teste03() {
        Editor editor = new Editor();
        String empresa = "GitHub";

        editor.eventos.registrar("novo_commit", new NotificadorApp("devUser"));
        editor.eventos.registrar("novo_commit", new NotificadorEmail("dev@github.com"));
        editor.eventos.registrar("pull_request_aberto", new NotificadorSMS("+55 21 97777-1111"));

        System.out.println("\n>>> [GitHub] Novo commit realizado:");
        editor.acionarEvento("novo_commit", "Commit: refatora código de login");

        System.out.println("\n>>> [GitHub] Pull request aberto:");
        editor.acionarEvento("pull_request_aberto", "PR#42 - feature/cadastro-usuario");
    }

    // Teste 04: Evento sem ouvintes registrados
    public static void teste04() {
        Editor editor = new Editor();

        System.out.println("\n>>> [Teste] Evento sem ouvintes registrados:");
        editor.acionarEvento("evento_inexistente", "Teste sem notificadores");
    }
    
}
