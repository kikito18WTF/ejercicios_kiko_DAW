package org.example;
import java.util.Scanner;

/**
 * @author: Kiko Perez
 * @version: 1.0 (15/12/2024)
 */

public class Nochevieja {

    /**
     * Método principal que ejecuta el programa lee las horas y calcula los minutos restantes hasta medianoche para cada hora introducida.
     * El programa termina cuando se ingresa la hora "00:00".
     *
     * @param args - Los argumentos de la línea de comandos (no utilizados en este caso).
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while (true) {
            String hora = entrada.nextLine();

            if (MEDIANOCHE(hora)) {
                break;
            }

            int minutosquequedan = calcularMinutos(hora);

            if (minutosquequedan != -1) {
                System.out.println(minutosquequedan);
            } else {
                System.out.println("Formato de hora no válido");
            }
        }


    }

    /**
     * Verifica si la hora ingresada es medianoche .
     *
     * @param hora - La hora a verificar en formato "HH:mm".
     * @return true si la hora es 00:00, de lo contrario, false.
     */

    public static boolean MEDIANOCHE (String hora) {
        return "00:00".equals(hora);
    }

    /**
     * Calcula los minutos restantes hasta medianoche, dado un valor de hora en formato HH:mm.
     * Si la hora o los minutos no son válidos, devuelve -1.
     *
     * @param hora - La hora en formato HH:mm que se desea calcular.
     * @return Los minutos restantes hasta medianoche, o -1 si la hora no es válida.
     */

    public static int calcularMinutos(String hora) {
        try {
            String[] partes = hora.split(":");
            int horas = Integer.parseInt(partes[0]);
            int minutos = Integer.parseInt(partes[1]);

            if (horas < 0 || horas > 23 || minutos < 0 || minutos > 59) {
                System.out.println("La hora o los minutos no son válidos");
                return -1;
            }

            int minutosquequedan = (23 - horas) * 60 + (60 - minutos);
            if (minutos == 0) {
                minutosquequedan -= 60;
            }
            return minutosquequedan;
        } catch (NumberFormatException e1) {
            System.out.println("Error en el formato de la hora");
            return -1;
        }
    }
}
