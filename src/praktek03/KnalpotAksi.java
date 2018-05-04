package praktek03;
public class KnalpotAksi {
    public static void main(String[] args) {
        Knalpot k1 = new Knalpot();
        k1.setMerek("Purbo");
        k1.setWarna("Perak");
        k1.setHarga(500);
        
        k1.cetakinfo();
        
        System.out.println("Mereknya \t: ");
        System.out.println(k1.getMerek());
        System.out.println("Warnanya \t: ");
        System.out.println(k1.getWarna());
        System.out.println("Harganya \t: ");
        System.out.println(k1.getHarga());
    }
}
