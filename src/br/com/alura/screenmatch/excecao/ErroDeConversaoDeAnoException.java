package br.com.alura.screenmatch.excecao;

public class ErroDeConversaoDeAnoException extends RuntimeException {
    private String mensagem;

    public ErroDeConversaoDeAnoException(String s) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
