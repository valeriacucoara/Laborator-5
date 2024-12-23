package md.utm.restaurantmanagement.entity;

public class Comenzi {

    private int idComanda;
    private Clienti client; // Relatie cu entitatea Clienti
    private float sumaTotala;

    public Comenzi(int idComanda, Clienti client, float sumaTotala) {
        this.idComanda = idComanda;
        this.client = client;
        this.sumaTotala = sumaTotala;
    }

    public int getIdComanda() {
        return idComanda;
    }

    public void setIdComanda(int idComanda) {
        this.idComanda = idComanda;
    }

    public Clienti getClient() {
        return client;
    }

    public void setClient(Clienti client) {
        this.client = client;
    }

    public float getSumaTotala() {
        return sumaTotala;
    }

    public void setSumaTotala(float sumaTotala) {
        this.sumaTotala = sumaTotala;
    }

    @Override
    public String toString() {
        return "Comenzi{" +
                "idComanda=" + idComanda +
                ", client=" + client +
                ", sumaTotala=" + sumaTotala +
                '}';
    }
}

