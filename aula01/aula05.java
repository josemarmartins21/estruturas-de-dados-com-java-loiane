public class aula05 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);
        
            
        vetor.adiciona("Angola");
        vetor.adiciona("Moçambique");
        vetor.adiciona("Canada");

        try {
            System.out.println(vetor.busca(2));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
