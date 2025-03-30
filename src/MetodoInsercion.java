public class MetodoInsercion {
    public void ordenar(int[] arreglo, boolean ascendente, boolean conPasos) {
        int comparaciones = 0;
        int cambios = 0;
        int n = arreglo.length;
        
        for (int i = 1; i < n; i++) {
            int aux = arreglo[i];
            int j = i - 1;
            while (j >= 0 && ((ascendente && arreglo[j] > aux) |
            (!ascendente && arreglo[j] < aux))) {
                comparaciones++;
                arreglo[j + 1] = arreglo[j];
                j--;
                cambios++;
            }
            arreglo[j + 1] = aux;
        }
        System.out.println("Comparaciones Totales -> " + comparaciones);
        System.out.println("Cambios Totales -> " + cambios);
    }
}
