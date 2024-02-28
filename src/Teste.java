public class Teste {
    public static void main(String[] args) throws Exception {
        Vetor vetor = new Vetor(5);

        try {
            vetor.adiciona("elemento 1");
            vetor.adiciona("elemento 2");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(vetor.tamanho());

        System.out.println(vetor.toString());

        System.out.println(vetor.busca(1));

        System.out.println(vetor.busca1("elemento 1"));

    }
}
