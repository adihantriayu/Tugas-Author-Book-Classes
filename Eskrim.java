//Definisi Klass
public class Eskrim {
    //private variables
    private String namaEskrim;
    private String mix;
    private String rasa;

    //Constructor

    public Eskrim(String namaEskrim, String mix, String rasa) {
        this.namaEskrim = namaEskrim;
        this.mix = mix;
        this.rasa = rasa;
    }

    public void setNamaEskrim(String namaEskrim) {
        this.namaEskrim = namaEskrim;
    }

    public void setMix(String mix) {
        this.mix = mix;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public String getNamaEskrim() {
        return namaEskrim;
    }

    public String getMix() {
        return mix;
    }

    public String getRasa() {
        return rasa;
    }

    @Override
    public String toString() {
        return "\n\t Eskrim Pilihanmu :\n" +
                "\n Nama Eskrim='" + namaEskrim + '\'' +
                ",\n Mix='" + mix + '\'' +
                ", \n Rasa=" + rasa ;
    }
}

