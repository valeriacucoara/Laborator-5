package md.utm.restaurantmanagement.entity;

import java.util.List;

public class ClientComenziArticole {

    private Clienti client; // Relație cu entitatea Clienti
    private List<Comenzi> comenziList; // Lista de comenzi asociate clientului
    private List<ArticoleComanda> articoleComandaList; // Lista de articole pentru comenzi

    public ClientComenziArticole(Clienti client, List<Comenzi> comenziList, List<ArticoleComanda> articoleComandaList) {
        this.client = client;
        this.comenziList = comenziList;
        this.articoleComandaList = articoleComandaList;
    }

    public Clienti getClient() {
        return client;
    }

    public void setClient(Clienti client) {
        this.client = client;
    }

    public List<Comenzi> getComenziList() {
        return comenziList;
    }

    public void setComenziList(List<Comenzi> comenziList) {
        this.comenziList = comenziList;
    }

    public List<ArticoleComanda> getArticoleComandaList() {
        return articoleComandaList;
    }

    public void setArticoleComandaList(List<ArticoleComanda> articoleComandaList) {
        this.articoleComandaList = articoleComandaList;
    }

    @Override
    public String toString() {
        return "ClientComenziArticole{" +
                "client=" + client +
                ", comenziList=" + comenziList +
                ", articoleComandaList=" + articoleComandaList +
                '}';
    }
}
