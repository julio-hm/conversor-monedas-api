package conversor;

import java.util.Scanner;

public class MenuConversor {

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("*********************************************************");
            System.out.println("Sea usted bienvenido/a al Conversor de Moneda :)");
            System.out.println("1) Dólar => Peso mexicano");
            System.out.println("2) Peso mexicano => Dólar");
            System.out.println("3) Dólar => Real brasileño");
            System.out.println("4) Real brasileño => Dólar");
            System.out.println("5) Dólar => Peso colombiano");
            System.out.println("6) Peso colombiano => Dólar");
            System.out.println("7) Salir del menú");
            System.out.print("Elija una opción válida: ");
            opcion = scanner.nextLine();

            if (!opcion.equals("7")) {
                System.out.print("Escribe la cantidad a convertir: ");
                double cantidad = scanner.nextDouble();
                scanner.nextLine(); // Limpiar el buffer

                procesarOpcion(opcion, cantidad);
            }

        } while (!opcion.equals("7"));

        scanner.close();
        System.out.println("Gracias por usar el conversor. ¡Hasta luego!");
    }

    private void procesarOpcion(String opcion, double cantidad) {
        switch (opcion) {
            case "1":
                System.out.println(cantidad + " Dólares equivale a " + ConversorMonedas.convertir("USD", "MXN", cantidad) + " Pesos mexicanos.");
                break;
            case "2":
                System.out.println(cantidad + " Pesos mexicanos equivale a " + ConversorMonedas.convertir("MXN", "USD", cantidad) + " Dólares.");
                break;
            case "3":
                System.out.println(cantidad + " Dólares equivale a " + ConversorMonedas.convertir("USD", "BRL", cantidad) + " Reales brasileños.");
                break;
            case "4":
                System.out.println(cantidad + " Reales brasileños equivale a " + ConversorMonedas.convertir("BRL", "USD", cantidad) + " Dólares.");
                break;
            case "5":
                System.out.println(cantidad + " Dólares equivale a " + ConversorMonedas.convertir("USD", "COP", cantidad) + " Pesos colombianos.");
                break;
            case "6":
                System.out.println(cantidad + " Pesos colombianos equivale a " + ConversorMonedas.convertir("COP", "USD", cantidad) + " Dólares.");
                break;
            default:
                System.out.println("Opción no válida. Por favor, elija de nuevo.");
        }
    }
}
