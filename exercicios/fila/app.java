class app {
    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.adicionar("João");
        fila.adicionar("Maria");
        fila.adicionar("Joana");
        fila.adicionar("Juca");

        fila.remover();
   

        System.out.println(fila.get());


    }
}