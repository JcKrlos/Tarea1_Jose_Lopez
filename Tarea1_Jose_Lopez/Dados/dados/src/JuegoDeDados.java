import java.util.Random;
public class JuegoDeDados {
    public static void main(String[] args) {
        int jugador1 = 0;
        int jugador2 = 0;
        Random random = new Random();

        System.out.println("Juego de Dados");
        System.out.println("----------------");

        for (int i = 1; i <= 4; i++) {
            int lanzamiento = random.nextInt(6) + 1;

            if (i <= 2) {
                jugador1 += lanzamiento;
                System.out.println("Jugador 1 - Lanzamiento " + i + ": " + lanzamiento);
            } else {
                jugador2 += lanzamiento;
                System.out.println("Jugador 2 - Lanzamiento " + (i - 2) + ": " + lanzamiento);
            }
        }
        System.out.println("----------------");
        System.out.println("Suma del Jugador 1: " + jugador1);
        System.out.println("Suma del Jugador 2: " + jugador2);

        if (jugador1 > jugador2) {
            System.out.println("El ganador es el Jugador 1");
        } else if (jugador2 > jugador1) {
            System.out.println("El ganador es el Jugador 2");
        } else {
            System.out.println("Empate");
        }
    }
}