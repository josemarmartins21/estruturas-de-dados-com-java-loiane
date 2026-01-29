

public class VetorObjecto {
    private Object[] elementos;
    private int tamanho;

    public VetorObjecto(int capacidade) {
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }

    public boolean adiciona(Object elemento) {
        
        this.aumentaCapacidade();

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
        for (Object elemento : elementos) {
            System.out.println(elemento);
        }
    }

    public int tamanho() {
        return this.tamanho;
    }

    
    public Object busca(int posicao) {
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("A posição é invalida");
        }
        return this.elementos[posicao];
    }  

    public int busca(Object elemento) {
        for (int i=0; i < this.tamanho;i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }   

    public void aumentaCapacidade() {
        if (tamanho == this.elementos.length) {
            Object[] elementosNovos = new String[this.elementos.length * 2];
            for (int i = 0; i < elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            
            this.elementos = elementosNovos;
        }
    }

    // 0 1 2 3 4 5 6 = tamanho é 5
    // B C E F G + +
    public boolean adiciona(int posicao, Object elemento) {
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("A posição é invalida");
        }
        this.aumentaCapacidade();
        for (int i = this.tamanho-1;i >= posicao; i--) {
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        return true;
       
    }

    @Override
    public String toString() {
        
        StringBuilder s = new StringBuilder();
        s.append("[");
        
        for (int i=0; i<this.tamanho-1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }
        
        if (this.tamanho>0){
            s.append(this.elementos[this.tamanho-1]);
        }
        
        s.append("]");
        
        return s.toString();
    }

}
