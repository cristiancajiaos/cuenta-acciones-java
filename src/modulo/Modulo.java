package modulo;

public class Modulo {

    private int cuentaBotonClick;
    private int cuentaBotonEntra;
    private int cuentaBotonSale;

    public Modulo() {
        this.cuentaBotonClick = 0;
        this.cuentaBotonEntra = 0;
        this.cuentaBotonSale = 0;
    }

    public int getCuentaBotonClick() {
        return cuentaBotonClick;
    }

    public void setCuentaBotonClick(int cuentaBotonClick) {
        this.cuentaBotonClick = cuentaBotonClick;
    }

    public int getCuentaBotonEntra() {
        return cuentaBotonEntra;
    }

    public void setCuentaBotonEntra(int cuentaBotonEntra) {
        this.cuentaBotonEntra = cuentaBotonEntra;
    }

    public int getCuentaBotonSale() {
        return cuentaBotonSale;
    }

    public void setCuentaBotonSale(int cuentaBotonSale) {
        this.cuentaBotonSale = cuentaBotonSale;
    }

    public int aumentaCuentaBotonClick() {
        this.setCuentaBotonClick(this.getCuentaBotonClick() + 1);
        return getCuentaBotonClick();
    }

    public int aumentaCuentaBotonEntra() {
        this.setCuentaBotonEntra(this.getCuentaBotonEntra() + 1);
        return getCuentaBotonEntra();
    }

    public int aumentaCuentaBotonSale() {
        this.setCuentaBotonSale(this.getCuentaBotonSale() + 1);
        return getCuentaBotonSale();
    }
    
}
