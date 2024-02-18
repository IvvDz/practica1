package aplicacion;

import matematicas.Matematicas;

public class Principal {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Uso: java aplicacion.Principal <numero_de_pasos>");
            return;
        }

        long pasos = Long.parseLong(args[0]);
        System.out.println("El número PI es " + Matematicas.generarNumeroPiIterativo(pasos));
    }
}

