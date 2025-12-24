public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

 /*    public void adiciona(String elemento) {
        for (int i=0; i<= this.elementos.length;i++) {
            if (this.elementos[i] == null) {
                this.elementos[i] = elemento;
                break;
            }
        }
    } */

    public boolean adiciona(String elemento) {
        if (tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho ++;
            return true;
        } 
        return false;
    }

    public int quantidade() {
        int tam = 1;
        for (int i = 0; i < elementos.length; i++) {
            if (this.elementos[i] != null) {
                tam ++;
            }    
        }
        return tam;
    }

    public void imprimir() {
        for (String elemento : elementos) {
            System.out.println(elemento);
        }
    }
}
