package geometri;

public class LingkaranBeraksi {
    public static void main(String[] args) {
        Lingkaran Wahyudhi = new Lingkaran();
        
        Wahyudhi.setRadius(69);
        
        System.out.println("Hasil Luas Lingkaran : " + Wahyudhi.Luas());
        System.out.println("Hasil Luas Lingkaran : " + Wahyudhi.Keliling());
        
        PersegiPanjang Wahyu = new PersegiPanjang(100,50);
        
        System.out.println("Hasil Luas Persegi : " + Wahyu.Luas());
        System.out.println("Hasil Keliling Persegi : " + Wahyu.Keliling());
        
    }
}
