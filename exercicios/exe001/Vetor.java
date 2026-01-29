public class Vetor {
    private int vetor[];
    private int tamanho;


    public Vetor(int capacidade) {

        this.vetor = new int[capacidade];
        this.tamanho = 0;
    }

    public boolean add(int value) {
        if (!(tamanho < this.vetor.length)) {
            return false;
        }
        this.vetor[tamanho] = value;
        tamanho ++;
        return true;
    }

    public void imprimir() {
        for (int i = 0; i < this.tamanho; i++) {
            System.out.println(this.vetor[i]);
        }
    }

    public int busca(int value) {
        for (int i = 0; i < vetor.length; i++) {
            if (this.vetor[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public int buscarPelaPosicao(int i) {
        for (int j = 0; j < vetor.length; j++) {
            if (i == j) {
                return vetor[j];
            }
        }
        return -1;
    }

    public void ordernar() {
        int aux = 0;
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] > vetor[j]) {
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux; 
                    
                }
            }
        }

        this.imprimir();
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    
}
