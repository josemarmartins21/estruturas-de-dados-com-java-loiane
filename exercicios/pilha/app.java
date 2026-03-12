class app {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        pilha.adicionar("E");
        pilha.adicionar("D");
        pilha.adicionar("C");
        pilha.adicionar("B");
        pilha.adicionar("A");

        System.out.println("Topo");
        System.out.println(pilha.get());
        

        pilha.remover();
        System.out.println("Novo Topo");
        System.out.println(pilha.get());

    }
}