import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Seleccione el método de ordenamiento:");
            System.out.println("1. Burbuja");
            System.out.println("2. Burbuja Mejorado"); 
            System.out.println("3. Inserción");
            System.out.println("4. Selección");
            System.out.println("5. Salir");

            int metodo = leerOpcionValida(scanner, 1, 5); 

            if (metodo == 5) { 
                break;
            }

            boolean conPasos = false;
            while (true) {
                System.out.println("¿Desea ver los pasos (true/false)");
                String input = scanner.next();

                switch (input) {
                    case "true":
                        conPasos = true;
                        break;
                    case "false":
                        conPasos = false;
                        break;
                    default:
                        System.out.println("Opción inválida. Ingrese 'true' o 'false'");
                        continue;
                }
                break;
            }

            System.out.println("¿Desea ordenar ascendentemente (A) o descendentemente (D)?:");
            String orden = scanner.next();
            boolean ascendente = orden.equalsIgnoreCase("A");

            int[] arreglo = { 12, -7, 25, 0, -15, 33, 19, -22, 5, 48, -3, 27, -30, 14, 7, -1, 41, 20, -11, 8 };

            switch (metodo) {
                case 1:
                    System.out.println("Metodo Burbuja");
                    MetodoBurbuja MB = new MetodoBurbuja();
                    imprimirArreglo(arreglo);
                    MB.ordenar(arreglo, ascendente, conPasos);
                    System.out.println("----FIN DEL METODO-----");
                    imprimirArreglo(arreglo);
                    break;
                case 2:
                    System.out.println("Metodo Selección");
                    MetodoSeleccion MS = new MetodoSeleccion();
                    imprimirArreglo(arreglo);
                    MS.ordenar(arreglo, ascendente, conPasos);
                    System.out.println("----FIN DEL METODO----");
                    imprimirArreglo(arreglo);
                    break;
                case 3:
                    System.out.println("Metodo Inserción");
                    MetodoInsercion MI = new MetodoInsercion();
                    imprimirArreglo(arreglo);
                    MI.ordenar(arreglo, ascendente, conPasos);
                    System.out.println("----FIN DEL METODO----");
                    imprimirArreglo(arreglo);
                    break;
                case 4:
                    System.out.println("Metodo Burbuja Mejorado");
                    MetodoBurbujaMejorado MBM = new MetodoBurbujaMejorado();
                    imprimirArreglo(arreglo);
                    MBM.ordenar(arreglo, ascendente, conPasos);
                    System.out.println("----FIN DEL METODO----");
                    imprimirArreglo(arreglo);
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        }
    }

    public static int leerOpcionValida(Scanner scanner, int min, int max) {
        int opcion;
        while (true) {
            System.out.println("Seleccione una opción (" + min + "-" + max + "):");
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                if (opcion >= min && opcion <= max) {
                    return opcion;
                } else {
                    System.out.println("Error: Ingrese un número entre " + min + " y " + max + "-");
                }
            } else {
                System.out.println("Error: Ingrese un número válido.");
                scanner.next(); 
            }
        }
    }

    public static void imprimirArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
