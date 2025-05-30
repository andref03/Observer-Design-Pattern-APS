package br.edu.ifnmg.notificacao;

/**
 *
 * @author andre
 */
public class Testes {

    // Teste 01: Simula uso do LinkedIn
    public static void teste01() {

        // Apenas para melhorar visibilidade
        separador();

        Editor editor = new Editor();
        String empresa = "LinkedIn";

        editor.eventos.registrar("nova_conexao", new NotificadorEmail("andre@yahoo.com.br"));
        editor.eventos.registrar("nova_conexao", new NotificadorApp("@joao.kennedy"));
        editor.eventos.registrar("mensagem_recebida", new NotificadorSMS("+55 38 99999-9999"));
        editor.eventos.registrar("perfil_visualizado", new NotificadorApp("@rafael.josebc"));

        System.out.println(">>> [" + empresa + "] Nova conexão recebida:");
        editor.acionarEvento("nova_conexao", "João Kennedy S. S.");

        System.out.println("\n>>> [" + empresa + "] Mensagem recebida:");
        editor.acionarEvento("mensagem_recebida", "Heuller Ramos - Recrutador");

        System.out.println("\n>>> [" + empresa + "] Alguém visualizou seu perfil:");
        editor.acionarEvento("perfil_visualizado", "André Felipe");

        // Apenas para melhorar visibilidade
        separador();
    }

    // Teste 02: Simula notificações do Instagram
    public static void teste02() {
        Editor editor = new Editor();
        String empresa = "Instagram";

        editor.eventos.registrar("novo_seguidor", new NotificadorApp("@andre.felipe"));
        editor.eventos.registrar("curtida_recebida", new NotificadorEmail("andre.felipe@email.com"));
        editor.eventos.registrar("comentario_novo", new NotificadorSMS("+55 038 9 8888-7777"));

        System.out.println("\n>>> [" + empresa + "] Novo seguidor:");
        editor.acionarEvento("novo_seguidor", "Heuller Ramos");

        System.out.println("\n>>> [" + empresa + "] Alguém curtiu sua foto:");
        editor.acionarEvento("curtida_recebida", "Foto: Viagem ao Japão");

        System.out.println("\n>>> [" + empresa + "] Novo comentário:");
        editor.acionarEvento("comentario_novo", "João Kennedy comentou: 'Incrível'");

        // Apenas para melhorar visibilidade
        separador();
    }

    // Teste 03: Registra, remove e dispara evento para verificar se o listener foi removido corretamente
    public static void teste03() {
        Editor editor = new Editor();
        String empresa = "Twitter";

        // Criando o listener
        NotificadorApp notificadorApp = new NotificadorApp("@andre_felipe");

        // Registrando o listener para o evento "nova_mensagem"
        editor.eventos.registrar("nova_mensagem", notificadorApp);

        System.out.println(">>> [" + empresa + "] Nova mensagem recebida (antes da remoção):");
        editor.acionarEvento("nova_mensagem", "Heuller Ramos te mencionou!");

        // Removendo o listener
        editor.eventos.remover("nova_mensagem", notificadorApp);

        System.out.println("\n>>> [" + empresa + "] Nova mensagem recebida (após a remoção):");
        editor.acionarEvento("nova_mensagem", "João Kennedy também te mencionou!");

        // Apenas para melhorar visibilidade
        separador();
    }

    // Teste 04: Evento sem ouvintes registrados
    public static void teste04() {
        Editor editor = new Editor();
        String empresa = "Exemplo";

        System.out.println("\n>>> [" + empresa + "] Evento sem ouvintes registrados:");
        editor.acionarEvento("evento_inexistente", "Nenhum notificador registrado");
    }

    // Apenas para melhorar visibilidade
    private static void separador() {
        System.out.println("\n");
        System.out.println("------------------------------"
                + "-------------------------------------------------------------");
        System.out.println("");
    }

}
