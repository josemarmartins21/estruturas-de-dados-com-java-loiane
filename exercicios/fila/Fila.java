public class Fila {
    private ListaLigada lista;
    public Fila () {
        this.lista = new ListaLigada();
    }
    public void adicionar(String valor) {
        this.lista.add(valor);
    }

    public void remover() {
        if (this.get() != null) {
            this.lista.remover(this.get());
        }
    }

    public String get() {
        if (this.lista.getPrimeiro() != null) {
            return this.lista.getPrimeiro().getValor();
        }
        return null;
    }
}
