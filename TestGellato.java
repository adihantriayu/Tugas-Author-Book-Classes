public class TestGellato {
    public static void main(String[] args) {
        Eskrim Chocolate = new Eskrim("Chocolate","Almond","Manis");
        System.out.println(Chocolate.toString());

        Gellato Mochi = new Gellato("Mochi",25000,"Oreo","Chocolate",Chocolate);
        System.out.println(Mochi.toString());
        System.out.println(Mochi.getJenisEs().getNamaEskrim());
	}
}