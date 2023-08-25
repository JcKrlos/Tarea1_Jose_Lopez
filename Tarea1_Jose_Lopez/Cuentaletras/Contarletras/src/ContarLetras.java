import java.util.Scanner;

public class ContarLetras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombreCompleto = scanner.nextLine();

        String[] palabras = nombreCompleto.split(" ");
        for (String palabra : palabras) {
            System.out.println(palabra + ": " + palabra.length() + " letras");
        }
    }
}