package Taller1;

public class Libro {
    private String nome;
    private String edition;
    private int page;
    private boolean onLoan;

    public Libro(String nome, String edition, int page, boolean onLoan) {
        this.nome = nome;
        this.edition = edition;
        this.page = page;
        this.onLoan = onLoan;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public boolean isOnLoan() {
        return onLoan;
    }

    public void setOnLoan(boolean onLoan) {
        this.onLoan = onLoan;
    }
}
