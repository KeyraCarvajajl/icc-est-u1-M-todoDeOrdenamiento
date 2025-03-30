public class MetodoSeleccion {
    public void ordenar(int[] arreglo, boolean ascendente, boolean conPasos) {
        int comparaciones = 0;
        int cambios = 0;
        int n = arreglo.length;
        
        for (int i = 0; i < n - 1; i++) {
            int indice = i;
            for (int j = i + 1; j < n; j++) {
                comparaciones++;
                if ((ascendente && arreglo[j] < arreglo[indice]) |
                (!ascendente && arreglo[j] > arreglo[indice])) {
                    indice = j;
                }
            }
            if (indice != i) {
                int aux = arreglo[i];
                arreglo[i] = arreglo[indice];
                arreglo[indice] = aux;
                cambios++;
            }
        }
        System.out.println("Comparaciones Totales -> " + comparaciones);
        System.out.println("Cambios Totales -> " + cambios);
    }
}