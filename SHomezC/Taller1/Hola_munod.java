import java.util.Scanner;

public class Hola_mundo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Cantidad de veces que deseas imprimir 'Hola mundo");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Hola mundo ");
        }
    }
}