package br.edu.ifnmg.notificacao;

import java.io.File;

/**
 *
 * @author IFNMG
 */
public class Editor {

    private File arquivo;
    public final EventManager eventos = new EventManager();

    public void abrirArquivo(String caminho) {
        this.arquivo = new File(caminho);
        eventos.disparar("abrir", arquivo);
    }

    public void salvarArquivo() throws Exception {
        if (arquivo != null) {
            eventos.disparar("salvar", arquivo);
        } else {
            throw new Exception("Nenhum arquivo foi aberto.");
        }
    }
}
