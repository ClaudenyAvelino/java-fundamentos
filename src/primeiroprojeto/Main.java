package primeiroprojeto;

public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Scree Match");
        System.out.println("Filme: TOp Gun: Maverick");

        int anoDeLacamento = 2022;
        System.out.println("Ano de Lançamento: " + anoDeLacamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        double media = (9.8 + 6.3 + 8) / 3;
        System.out.println(media);
        String sinopse = """
                Filme TOP Gun
                Fime de aventura com galã dos anos 80
                Muito bom
                Ano de lançamento
                """ + anoDeLacamento;
        System.out.println(sinopse);

        int classificação;
        classificação = (int)media / 2;
        System.out.println(classificação);
    }
}
