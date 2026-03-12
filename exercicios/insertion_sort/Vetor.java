public class Vetor {
    private int tamanho;
    private int vetor[];
    public Vetor(int capacidade) {
        vetor = new int[capacidade];
        this.tamanho = 0;
    }

    public void add(int valor) {
        if (this.tamanho < this.vetor.length) {
            this.vetor[this.tamanho] = valor;
            this.tamanho++;
        }

    }

    public void insertionSort() {
        int aux, j;
        for (int i = 1; i < this.vetor.length; i++) {
            aux = this.vetor[i];
            j = i - 1;
            while (j >= 0 && this.vetor[j] > aux) {
                this.vetor[j+1] = this.vetor[j];
                j--;
            } 
            this.vetor[j+1] = aux;
        }
    }

    public void imprimir() {
        for (int i : this.vetor) {
            System.out.println(i);
        }
    }

    public void remove(int posicao) {
        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.vetor[i] = this.vetor[i+1];
        }
        this.tamanho--;
    }

    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    public int[] getVetor() {
        return vetor;
    }
    public void setVetor(int[] vetor) {
        this.vetor = vetor;
    }

    
}
