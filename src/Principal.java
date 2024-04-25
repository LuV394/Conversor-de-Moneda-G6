import java.io.IOException;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String menu = """
                ********************************************************************
                BIENVENIDOS AL CONVERSOR DE MONEDAS
                ********************************************************************
                1-Convertir de Dolar (USD)                  a Peso Argentino (ARS)
                2-Convertir de Pesos Argentino (ARS)        a Dolar (USD)
                3-Convertir de Dolar (USD)                  a Real Brasileño (BRL)
                4-Convertir de Real Brasileño               a Dolar (USD)
                5-Convertir de Dolar (USD)                  a Peso Colombiano (COP)
                6-Convertir de Peso Colombiano (COP)        a Dolar (USD)
                7-Convertir de Dolar (USD)                  a Colon Costarricense (CRC)
                8-Convertir de Colon Costarricense (CRC)    a Dolar (USD)
                9-Salir
                """;

        int opcion;
        do {
            System.out.println(menu);
            System.out.println("Elija una opcion valida:");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 8) {
                convertirMoneda(opcion, scanner);
                System.out.println("Quiere seguir Convirtiendo? ");
                System.out.println("1-si");
                System.out.println("2-no");
                int continuar = scanner.nextInt();
                if (continuar != 1) {
                    System.out.println("Gracias por usar el conversor de monedas.");
                    break;
                }
            } else if (opcion == 9) {
                System.out.println("Gracias por usar el conversor de monedas.");
                break;
            } else {
                System.out.println("Opción no válida, por favor elija una opción del menú.");
            }
        } while (true);

        scanner.close();
    }

    private static void convertirMoneda(int opcion, Scanner scanner) {

        String deDivisa = null;
        String aDivisa = null;
        switch (opcion) {
            case 1:
                deDivisa = "USD";
                aDivisa = "ARS";
                break;
            case 2:
                deDivisa = "ARS";
                aDivisa = "USD";
                break;
            case 3:
                deDivisa = "USD";
                aDivisa = "BRL";
                break;
            case 4:
                deDivisa = "BRL";
                aDivisa = "USD";
                break;
            case 5:
                deDivisa = "USD";
                aDivisa = "COP";
                break;
            case 6:
                deDivisa = "COP";
                aDivisa = "USD";
                break;
            case 7:
                deDivisa = "USD";
                aDivisa = "CRC";
                break;
            case 8:
                deDivisa = "CRC";
                aDivisa = "USD";
                break;
            case 9:
                break;

        }
        if (deDivisa != null && aDivisa != null) {
            System.out.println("Ingrese el monto total a convertir: ");
            double cantidad = scanner.nextDouble();
            Conversion conversion = new Conversion(deDivisa, aDivisa, cantidad);

            try {
                double resultado = conversion.convertir();
                System.out.println(cantidad + " " + deDivisa + " son " + resultado + " " + aDivisa);
            } catch (IOException | InterruptedException e) {
                System.out.println("Error al realizar la conversión: " + e.getMessage());
            }
        }
    }
}
