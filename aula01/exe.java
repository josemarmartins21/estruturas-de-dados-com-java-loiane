public class exe {
    public static void main(String[] args) {
        long vetor[] = new long[10];
        int buscado = 7;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int)(Math.random() * vetor.length);
        }
        
        long resultado = binarySearch(vetor, buscado);
        
        System.out.println(resultado);

    }
    
    public static long binarySearch(long vetor[], long buscado) {
        int inicio = 0;
        int fim = vetor.length - 1;
    
        while (inicio <= fim) {
            int meio = (int)((fim + inicio) / 2);
    
            if (vetor[meio] == buscado) {
                return vetor[meio];
            } else if (vetor[meio] > buscado) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }

        return -1;
    }
}
