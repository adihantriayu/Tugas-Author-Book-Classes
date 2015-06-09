//Define class
public class Gellato {
    //private variables
    private String namaGelaato;
    private double harga;
    private  String topping;
    private String Saus;
    private Eskrim jenisEs;

    //Constructor


    public Gellato(String namaGelaato, double harga, String topping, String saus, Eskrim jenisEs) {
        this.namaGelaato = namaGelaato;
        this.harga = harga;
        this.topping = topping;
        Saus = saus;
        this.jenisEs = jenisEs;
    }

    public void setNamaGelaato(String namaGelaato) {
        this.namaGelaato = namaGelaato;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public void setSaus(String saus) {
        Saus = saus;
    }

    public void setJenisEs(Eskrim jenisEs) {
        this.jenisEs = jenisEs;
    }

    public String getNamaGelaato() {
        return namaGelaato;
    }

    public double getHarga() {
        return harga;
    }

    public String getTopping() {
        return topping;
    }

    public String getSaus() {
        return Saus;
    }

    public Eskrim getJenisEs() {
        return jenisEs;
    }

    @Override
    public String toString() {
        return "\n\t Gellato Pilihanmu{" +
                "\n Nama Gelaato='" + namaGelaato + '\'' +
                ", \n Harga=" + harga +
                ", \n Topping='" + topping + '\'' +
                ", \n Saus='" + Saus + '\'' +
                ", \n JenisEs=" + jenisEs +
                "\n Enjoy your Ice Cream Gellato =D";
    }
}
