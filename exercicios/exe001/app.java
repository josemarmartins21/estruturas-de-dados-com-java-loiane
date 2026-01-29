public class app {
    public static void main(String[] args) {
        int[] vetor = {4, 2, 4, 3, 2, 4};
        boolean[] contados = new boolean[vetor.length]; // marca elementos já contados

        for (int i = 0; i < vetor.length; i++) {
            if (!contados[i]) { // se ainda não contamos este elemento
                int count = 1;
                for (int j = i + 1; j < vetor.length; j++) {
                    if (vetor[i] == vetor[j]) {
                        count++;
                        contados[j] = true; // marca como contado
                    }
                }
                System.out.println(vetor[i] + " aparece " + count + " vezes");
            }
}
    }
}