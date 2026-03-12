class app {
    public static void main(String[] args) {
        int vetor[] = {
            5,3, 12,2,100,1000
        };

        /* for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int)(Math.random() * vetor.length);   
        } */

        System.out.println("Vetor desordenado");

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        //System.out.println("Menor valor");
       // System.out.println(menorValor(vetor));

        int maior = menorValor(vetor);

        for (int i = 0; i < vetor.length; i++) {
            if (maior > vetor[i]) {
                maior = vetor[i];
            }
        }

        System.out.println("Menor");
        System.out.println(maior);

        /* int aux, posicao_menor;
        for (int i = 0; i < vetor.length; i++) {
            posicao_menor = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[posicao_menor] > vetor[j]) {
                    posicao_menor = j;
                }
            }
            aux = vetor[posicao_menor];
            vetor[posicao_menor] = vetor[i];
            vetor[i] = aux;
        }
        */
        


    }

    public static void insertionSort(int vetor []) {
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
    }

    public static int menorValor(int vetor[]) {
        int meiorValor =0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > meiorValor) {
                meiorValor = vetor[i];
            }
        }
        return meiorValor;
    }

    public static void maiorValor(int vetor[]) {

    }
}