import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ConsultarMoneda servicio = new ConsultarMoneda();
        Moneda moneda = servicio.buscaMoneda();
        Scanner scanner = new Scanner(System.in);

        int opcion = 0;

        while (opcion != 9) {
            System.out.println("\n=== CONVERSOR DE MONEDAS ===");
            System.out.println("1. Pesos Argentinos a Dólares");
            System.out.println("2. Dólares a Pesos Argentinos");
            System.out.println("3. Reales Brasileños a Dólares");
            System.out.println("4. Dólares a Reales Brasileños");
            System.out.println("5. Pesos Mexicanos a Dólares");
            System.out.println("6. Dólares a Pesos Mexicanos");
            System.out.println("7. Euros a Dólares");
            System.out.println("8. Dólares a Euros");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 8) {
                System.out.print("Ingrese el monto: ");
                double monto = scanner.nextDouble();
                double resultado = 0.0;

                switch (opcion) {
                    case 1: // ARS -> USD
                        resultado = monto / moneda.conversion_rates().get("ARS");
                        System.out.printf("%.2f ARS = %.2f USD\n", monto, resultado);
                        break;
                    case 2: // USD -> ARS
                        resultado = monto * moneda.conversion_rates().get("ARS");
                        System.out.printf("%.2f USD = %.2f ARS\n", monto, resultado);
                        break;
                    case 3: // BRL -> USD
                        resultado = monto / moneda.conversion_rates().get("BRL");
                        System.out.printf("%.2f BRL = %.2f USD\n", monto, resultado);
                        break;
                    case 4: // USD -> BRL
                        resultado = monto * moneda.conversion_rates().get("BRL");
                        System.out.printf("%.2f USD = %.2f BRL\n", monto, resultado);
                        break;
                    case 5: // MXN -> USD
                        resultado = monto / moneda.conversion_rates().get("MXN");
                        System.out.printf("%.2f MXN = %.2f USD\n", monto, resultado);
                        break;
                    case 6: // USD -> MXN
                        resultado = monto * moneda.conversion_rates().get("MXN");
                        System.out.printf("%.2f USD = %.2f MXN\n", monto, resultado);
                        break;
                    case 7: // EUR -> USD
                        resultado = monto / moneda.conversion_rates().get("EUR");
                        System.out.printf("%.2f EUR = %.2f USD\n", monto, resultado);
                        break;
                    case 8: // USD -> EUR
                        resultado = monto * moneda.conversion_rates().get("EUR");
                        System.out.printf("%.2f USD = %.2f EUR\n", monto, resultado);
                        break;
                }
            } else if (opcion == 9) {
                System.out.println("¡Hasta luego!");
            } else {
                System.out.println("Opción inválida. Intente nuevamente.");
            }
        }

        scanner.close();
    }
}



