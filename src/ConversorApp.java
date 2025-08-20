import java.util.Scanner;

public class ConversorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double cantidad;

        do {
            System.out.println("Bienvenido/a al conversor de Monedas\n");
            System.out.println("1) Dólar  => Peso Colombiano");
            System.out.println("2) Peso Colombiano => Dólar");
            System.out.println("3) Dólar  => Real brasileño");
            System.out.println("4) Real brasileño => Dólar");
            System.out.println("5) Dólar  => Peso Argentino");
            System.out.println("6) Peso Argentino => Dólar");
            System.out.println("7) Salir\n");
            System.out.print("Elija una Opción\n*****************************************\n> ");
            opcion = scanner.nextInt();

            String fromCurrency = "";
            String toCurrency = "";

            switch (opcion) {
                case 1:
                    fromCurrency = "USD";
                    toCurrency = "COP";
                    break;
                case 2:
                    fromCurrency = "COP";
                    toCurrency = "USD";
                    break;
                case 3:
                    fromCurrency = "USD";
                    toCurrency = "BRL";
                    break;
                case 4:
                    fromCurrency = "BRL";
                    toCurrency = "USD";
                    break;
                case 5:
                    fromCurrency = "USD";
                    toCurrency = "ARS";
                    break;
                case 6:
                    fromCurrency = "ARS";
                    toCurrency = "USD";
                    break;
                case 7:
                    System.out.println("Gracias por usar el conversor de monedas.");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    continue;
            }

            if (opcion >= 1 && opcion <= 6) {
                System.out.print("Ingrese la cantidad que desea convertir: ");
                cantidad = scanner.nextDouble();
                double resultado = ConversorMoneda.convert(fromCurrency, toCurrency, cantidad);
                System.out.printf("La conversión de "+ cantidad +" "+ fromCurrency +" corresponde a %.2f %s\n\n", resultado, toCurrency);
                System.out.println("********************************************************");
            }

        } while (opcion != 7);

        scanner.close();
    }
}
