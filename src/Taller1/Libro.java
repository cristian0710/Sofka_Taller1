package Taller1;
/**
 * Esta es la clase que representa un libro
 * @author Cristian Duran M
 */
public class Libro {
    private String nome;
    private String edition;
    private int page;
    private boolean onLoan;

    /**
     * Metodo constructor
     * @param nome
     * @param edition
     * @param page
     * @param onLoan
     */
    public Libro(String nome, String edition, int page, boolean onLoan) {
        this.nome = nome;
        this.edition = edition;
        this.page = page;
        this.onLoan = onLoan;
    }

    /**
     * Metodo para saber el estado del libro en prestamo
     * @return
     */
    public boolean isOnLoan() {
        return onLoan;
    }

    /**
     * Metodo para cambiar el estado del libro
     * @param onLoan
     */
    public void setOnLoan(boolean onLoan) {
        this.onLoan = onLoan;
    }
}
