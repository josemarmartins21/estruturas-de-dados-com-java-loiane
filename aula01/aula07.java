public class aula07 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(4);
        
            
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("E");

        System.out.println(vetor.tamanho());

        vetor.adiciona(1,"H");
        System.out.println(vetor);
    }
}
