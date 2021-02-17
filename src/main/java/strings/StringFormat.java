package strings;
/*
* exemplo de utilização do string.format para formatar strings.
* */
public class StringFormat {

    public static void main(String[] args) {

        var nome = "Anderson";
        var sobreNome = "Colin";
        final var nomeCompleto = nome +" "+ sobreNome;

        System.out.println(nome);
        System.out.println("Nome do cliente : " + nome);
        System.out.println("Nome completo do cliente : " + nomeCompleto);
        final var mensagem = String.format("O cliente %s possui sobre nome %s ", nome, sobreNome);
        //a posição onte está %s será substituida pelas variaveis passadas na mesma sequencia
        System.out.println(mensagem);

        System.out.println(String.format("Numero %.2f ", 1.2375d));

    }
}
