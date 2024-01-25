package src.Statements;

public class Forloop {
    public static void main(String[] args) {
        for (int i = 0; i <= 6; i++) { //Iterimi nga 0 deri ne 6 me rritje nga 1
            System.out.println("Numri : "+i);
        }

        for (int i = 10; i <= 60; i+=2) { //Iterimi nga 10 deri ne 60 me rritje nga 2
            System.out.println("Numri me rritje nga 2 cdo iterim : "+i);
            if(i % 5 == 0){
                System.out.println("numri plepjesothet me 5: "+i);
            }else {
                System.out.println("Numri nuk plotpjestohet me 5: " +i);
            }
        }

        for(int i=-100; i<10 ; i+=3){ // Iterim nga -100 ne 10 me rrite nga 3
            System.out.println(i);
            break; //E Largon nga forloop
        }
    }
}
