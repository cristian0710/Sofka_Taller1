package Taller1;

public class CuentaBancaria {
    private int accountNumber;
    protected boolean activate;

    public CuentaBancaria(int accountNumber, boolean activate) {
        this.accountNumber = accountNumber;
        this.activate = activate;
    }

    public boolean isActivate() {
        return activate;
    }

    public void setActivate(boolean activate) {
        this.activate = activate;
    }
}
