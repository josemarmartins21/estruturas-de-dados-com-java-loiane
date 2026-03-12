


class app {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);
        vetor.add(20);
        vetor.add(14);
        vetor.add(4);
        vetor.add(1);
        vetor.add(9);

        for (int i  : vetor.getVetor()) {
            System.out.println(i);
        }


        vetor.insertionSort();
        System.out.println("\n\n\n");
        vetor.imprimir();
        
        vetor.remove(0);
        System.out.println("\n\n\n");
        vetor.imprimir();

        /* for(int i = 0; i < vetor.length; i++) {
            vetor[i] = (int)(Math.random() * 100);
        }

        int aux, j;
        for (int i = 1; i < vetor.length; i++) {
            aux = vetor[i];
            j = i - 1;
            while (j >= 0 && vetor[j] > aux) {
                vetor[j+1] = vetor[j];
                j--;
            } 
            vetor[j+1] = aux;
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        } */
    }
}