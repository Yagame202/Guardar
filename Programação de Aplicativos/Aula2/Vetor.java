package Aula2;
public class Vetor {
    public static void main(String[] args) {
        String[] frutas = new String [3];
        frutas[0] = "Maçã";
        frutas[1] = "Laranja";
        frutas[2] = "Banana";
        for(int i = 0; i < frutas.length; i++) {
            System.out.println("Fruta: " + frutas[i]);
         }
    }
}