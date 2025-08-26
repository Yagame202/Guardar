package Atividade;

public class Principal {
    public static void main(String[] args) {
        System.out.println("inicio");
        Drone d1 = new Drone("12345", "Xing Ling", 0, 0);
        System.out.println(d1);
        Drone d2 = new Drone("12345", "Xing Ling", 10, 10);
        System.out.println("d1.equals(d2) = " + d1.equals(d2));                          
 
    }
}
