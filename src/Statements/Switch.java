package src.Statements;

import java.util.Random;

public class Switch {

    public static void main(String[] args) {
          Random random= new Random();
          int day =random.nextInt(17);

          switch (day){
              case 1:
                  System.out.println("Hene");
                  break;
              case 2:
                  System.out.println("Marte");
                  break;
              case 3 :
                  System.out.println("Merkure");
                  break;
              case 4 :
                  System.out.println("enjte");
                  break;
              case 5 :
                  System.out.println("premte");
                  break;
              case 6 :
                  System.out.println("shtune");
                  break;
              case 7 :
                  System.out.println("Diele");
                  break;
              default:
                  System.out.println("Asnjera nga lart: "+day);
          }
        switchString();
    }

    public static void switchString(){
        String emri = "test2";

        switch (emri){
            case "test2":
                System.out.println("Emri eshte test1");
                break;
            case "test1":
                System.out.println("emr eshte test2");
        }
    }

}
