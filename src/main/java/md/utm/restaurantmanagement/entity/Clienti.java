package md.utm.restaurantmanagement.entity;

public class Clienti {

    private int idClient;
    private String numePrenume;
    private String telefon;

    public Clienti(int idClient, String numePrenume, String telefon) {
        this.idClient = idClient;
        this.numePrenume = numePrenume;
        this.telefon = telefon;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getNumePrenume() {
        return numePrenume;
    }

    public void setNumePrenume(String numePrenume) {
        this.numePrenume = numePrenume;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return "Clienti{" +
                "idClient=" + idClient +
                ", numePrenume='" + numePrenume + '\'' +
                ", telefon='" + telefon + '\'' +
                '}';
    }
}
