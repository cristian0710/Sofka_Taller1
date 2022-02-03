package Taller1;

/**
 * Esta es la clase que representa una cuenta bancaria
 * @author Cristian Duran M
 */
public class CuentaBancaria {
    private int accountNumber;
    private String nome;
    private String lastName;
    protected boolean activate;

    /**
     * Metodo constructor
     * @param accountNumber
     * @param nome
     * @param lastName
     * @param activate
     */
    public CuentaBancaria(int accountNumber, String nome, String lastName, boolean activate) {
        this.accountNumber = accountNumber;
        this.nome = nome;
        this.lastName = lastName;
        this.activate = activate;
    }

    /**
     * Metodo para ver si la cuenta se encuentra activa
     * @return
     */
    public boolean isActivate() {
        return activate;
    }

    /**
     * Metodo para activar o desactivar la cuenta
     * @param activate
     */
    public void setActivate(boolean activate) {
        this.activate = activate;
    }
}
