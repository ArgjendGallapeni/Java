package src.Statements;

import java.util.Random;
import java.util.Scanner;

public class Switch {

    static Random random = new Random();

    public static void main(String[] args) {
        int day = random.nextInt(17);

        switch (day) {
            case 1:
                System.out.println("Hene");
                break;
            case 2:
                System.out.println("Marte");
                break;
            case 3:
                System.out.println("Merkure");
                break;
            case 4:
                System.out.println("enjte");
                break;
            case 5:
                System.out.println("premte");
                break;
            case 6:
                System.out.println("shtune");
                break;
            case 7:
                System.out.println("Diele");
                break;
            default:
                System.out.println("Asnjera nga lart: " + day);
        }
        switchString();
        shumaNumrave();
        numratQiftTek();

    }

    public static void switchString() {
        String emri = "test2";

        switch (emri) {
            case "test2":
                System.out.println("Emri eshte test1");
                break;
            case "test1":
                System.out.println("emr eshte test2");
        }
    }

    public static void shumaNumrave() {
        int x = random.nextInt(100);
        int y = random.nextInt(100);
        char operator = '*';
        Scanner scanner = new Scanner(System.in);


        switch (operator) {
            case '+':
                System.out.println("Shuma e " + x + y);
                break;
            case '-':
                System.out.println("Zbritja e nurmava x dhe y eshte : " + (x - y));
                break;
            case '*':
                System.out.println("Shumezimi i numrave x dhe y eshte: " + x * y);
                break;
            case '/':
                System.out.println("Pjestimi e nurmava x dhe y eshte : " + (x / y));
                break;
        }
    }

    public static void numratQiftTek() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sheno Numrin e pare ");
        int numri_pare = scanner.nextInt();
        System.out.println("Sheno Numrin e dyte ");
        int numri_dyte = scanner.nextInt();

        int totali = numri_pare + numri_dyte;

        switch (totali) {
            case 2:
                if (totali % 2 == 0) {
                    System.out.println("Numri eshte qift");
                }else {
                    System.out.println("Numri eshte tek ");
                }
                break;
            case 4:
                System.out.println("shuma eshhte 4");
                break;
            default:
                System.out.println("Shuma nuk eshte asnje nga lart");

        }

    }

}
