package Matematicas;

import java.util.Random;

public class Matematicas {

    public static double generarNumeroPiIterativo(long pasos) {
        Random random = new Random();
        long puntosDentroCirculo = 0;

        for (long i = 0; i < pasos; i++) {
            double x = random.nextDouble(); // Coordenada x
            double y = random.nextDouble(); // Coordenada y

            double distanciaAlCuadrado = (x - 0.5) * (x - 0.5) + (y - 0.5) * (y - 0.5);

            if (distanciaAlCuadrado <= 0.25) {
                puntosDentroCirculo++;
            }
        }

       return 4.0 * puntosDentroCirculo / pasos;
    }
}

