package src.Homework;

public class ForloopHomework {

    public static void main(String[] args) {
        //Itero nga 0-100 dhe gjej shumen e numrave
        int shuma = 0;
        for (int i = 0; i <= 10; i++) {
            shuma = shuma + i;
        }
        System.out.println("Shuma numrave nga 1-100 eshte :" + shuma);
        numrat();
        mesatarja();
        faktoriel();
        tabelashumzimit();
    }

    public static void numrat() {
        //itero nga 1-100 gjej numrat me tmdhej se 50 dhe te pjotepjeshtuem me 6
        for (int i = 1; i <= 100; i++) {
            if (i > 50 && i % 6 == 0) {
                System.out.println("Numri : " + i);
            }
        }
    }

    public static void mesatarja() {
        //Gjej mesatrene nga shuma e iterimit te numrave nga 1-100
        int shuma = 0;
        for (int i = 0; i <= 100; i++) {
            shuma = shuma + i;
        }
        System.out.println("Mesatarja : " + shuma / 100);
    }



    public static void tabelashumzimit(){
        for (int i = 1; i <= 10; i++) {
            for (int n = 1; n <= 10; n++) {
                int product = i * n;
                System.out.print(String.format("%4d", product));
            }
            System.out.println();
            }
    }

    public static void faktoriel() {
        int prodhimi = 1;
        for (int i = 1; i <= 5; i++) {
            prodhimi = prodhimi * i;
        }
        System.out.println(prodhimi);
    }
}
