package br.edu.ifnmg.notificacao;

/**
 *
 * @author IFNMG
 */
public class Main {

    public static void main(String[] args) {
        
        Editor editor = new Editor();
        
        editor.eventos.registrar("abrir", new NotificadorEmail("admin@email.com"));
        editor.eventos.registrar("salvar", new NotificadorSMS("+553199999999"));
        editor.eventos.registrar("salvar", new NotificadorApp("usuarioApp"));

        try {
            editor.abrirArquivo("documento.txt");
            editor.salvarArquivo();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
