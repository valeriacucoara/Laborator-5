package md.utm.restaurantmanagement.entity;

public class ArticoleComanda {

    private int idArticol;
    private Comenzi comanda; // Relație cu entitatea Comenzi
    private String numeProdus;
    private int cantitate;
    private float pret;

    public ArticoleComanda(int idArticol, Comenzi comanda, String numeProdus, int cantitate, float pret) {
        this.idArticol = idArticol;
        this.comanda = comanda;
        this.numeProdus = numeProdus;
        this.cantitate = cantitate;
        this.pret = pret;
    }

    public int getIdArticol() {
        return idArticol;
    }

    public void setIdArticol(int idArticol) {
        this.idArticol = idArticol;
    }

    public Comenzi getComanda() {
        return comanda;
    }

    public void setComanda(Comenzi comanda) {
        this.comanda = comanda;
    }

    public String getNumeProdus() {
        return numeProdus;
    }

    public void setNumeProdus(String numeProdus) {
        this.numeProdus = numeProdus;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "ArticoleComanda{" +
                "idArticol=" + idArticol +
                ", comanda=" + comanda +
                ", numeProdus='" + numeProdus + '\'' +
                ", cantitate=" + cantitate +
                ", pret=" + pret +
                '}';
    }
}
