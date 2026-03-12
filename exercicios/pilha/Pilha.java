public class Pilha {
    private ListaLigada lista;

    public Pilha() {
        this.lista = new ListaLigada();
    }

    public void adicionar(String valor) {
        this.lista.adicionarComeco(valor);
    }

    public void remover() {
        this.lista.remover(this.get());
    }

    public String get() {
        return this.lista.getPrimeiro().getValor();
    }
}
