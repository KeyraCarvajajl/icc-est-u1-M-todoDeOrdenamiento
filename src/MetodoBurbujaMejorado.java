public class MetodoBurbujaMejorado {
    public void ordenar(int[] arreglo, boolean ascendente, boolean conPasos) {
        int comparaciones = 0;
        int cambios = 0;
        int n = arreglo.length;
        boolean intercambio;
        
        for (int i = 0; i < n - 1; i++) {
            intercambio = false;
            for (int j = 0; j < n - 1 - i; j++) {
                comparaciones++;
                if ((ascendente && arreglo[j] > arreglo[j + 1]) |
                (!ascendente && arreglo[j] < arreglo[j + 1])) {
                    if (conPasos) {
                        System.out.println("Comparación " + comparaciones + ": " + arreglo[j] + " > " + arreglo[j + 1]);
                        System.out.println("Intercambio: " + arreglo[j] + " -> " + arreglo[j + 1]);
                    }
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                    cambios++;
                    intercambio = true;
                }
            }
            if (!intercambio) {
                break;
            }
        }
        System.out.println("Comparaciones Totales -> " + comparaciones);
        System.out.println("Cambios Totales -> " + cambios);
    }
}
