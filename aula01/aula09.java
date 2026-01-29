public class aula09 {
    public static void main(String[] args) {
       VetorObjecto vetor = new VetorObjecto(3);

        Contacto contacto1 = new Contacto("josimar", "+244 95485412", "josemar@email.pt");
        Contacto contacto2 = new Contacto("ariel", "+244 940121011", "ariel@email.pt");
        Contacto contacto3 = new Contacto("kimy", "+244 940893450", "kimy@email.pt");
        Contacto contacto4 = new Contacto("benjamim", "+244 92148759", "bvenjami@email.pt");

       vetor.adiciona(contacto3);
       vetor.adiciona(contacto1);
       vetor.adiciona(contacto4);

       int pos = vetor.busca(contacto4);

       if (pos > -1) {
            System.out.println("Elemento existe no vetor");
        } else {
            System.out.println("Elemento não existe no vetor");

        }
        
       System.out.println("Tamanho = " + vetor.tamanho());

       System.out.println(vetor);
    }
}
