

class ListaLigada {
    private Elemento primeiro;
    private Elemento ultimo;
    private int tamanho;


    public ListaLigada() {
        this.tamanho = 0;
    }

    public void adicionarComeco(String valor) {
        Elemento novoElemento = new Elemento(valor);
        if (this.primeiro == null && this.ultimo == null) {
            this.setPrimeiro(novoElemento);
            this.setUltimo(novoElemento);
        } else {
            novoElemento.setProximo(this.primeiro);
            this.setPrimeiro(novoElemento);
        }
        this.tamanho ++; 
    }

    public void add(String valor) {
        Elemento novoElemento = new Elemento(valor);
        if (this.primeiro == null && this.ultimo == null) {
            this.setPrimeiro(novoElemento);
            this.setUltimo(novoElemento);
        } else {
            this.getUltimo().setProximo(novoElemento);
            this.setUltimo(novoElemento);
        }
        this.tamanho ++;
    }

    public String get(int pos) {
        Elemento atual = primeiro;
        for (int i = 0; i < pos; i++) {
            if (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
        }
        return atual.getValor();
    }

    public void remover(String valor) {
        Elemento anterior = null;
        Elemento atual = primeiro;

        for (int i = 0; i < tamanho; i++) {
            if (atual.getValor().equalsIgnoreCase(valor)) {
                if (this.tamanho == 1) {
                    this.primeiro = null;
                    this.ultimo = null;
                    this.tamanho--;
                    break;
                } else if (atual == primeiro) {
                    this.setPrimeiro(atual.getProximo());
                    atual = null;
                    tamanho --;
                    break;
                } else if (atual == ultimo) {
                    this.setUltimo(anterior);
                    atual = null;
                    this.tamanho--;
                    break;
                } else {
                    anterior.setProximo(atual.getProximo());
                    atual = null;
                    tamanho --;
                    break;

                }
            }
            anterior = atual;
            atual = atual.getProximo();
        }
    }

 
    public Elemento getPrimeiro() {
        return primeiro;
    }
    public void setPrimeiro(Elemento primeiro) {
        this.primeiro = primeiro;
    }
    public Elemento getUltimo() {
        return ultimo;
    }
    public void setUltimo(Elemento ultimo) {
        this.ultimo = ultimo;
    }



    public int getTamanho() {
        return tamanho;
    }


}