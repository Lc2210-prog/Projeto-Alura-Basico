public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: The Batman");

        int anoDelancamento = 2022;
        System.out.println("Ano de Lancamento: " + anoDelancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 9.3;

        // Medias calculadas baseadas nas 3 notas do Lucas, Camilla e Pedro
        double media = (8.8 + 9.3 + 8.1) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                O filme The batman é um filme de ação/suspense que aborda a vida de Bruce Wayne em uma vibe mais 
                sombria e uma certa experiência como Batman, mostra Gotham como uma cidade dominada pelo crime, os 
                vilões do filme são: Pinguim, Charada, Salvatore Maroni e Carmine Falcone, Batman tem ajuda de mulher
                gato, o policial Jim Gordon e seu mordomo Alfred.
                Ano de Lancamento
                """ + anoDelancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media /2);
        System.out.println(classificacao);

    }
}