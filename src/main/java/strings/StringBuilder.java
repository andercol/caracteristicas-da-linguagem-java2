package strings;
/*
* StringBuilder é outra maneira de formatar strings
* */
public class StringBuilder {

    public static void main(String[] args) {

        var nome = "Anderson";

        final var builder = new java.lang.StringBuilder(nome); //construi uma variavel builder com a variavel nome
        System.out.println(builder.append("Colin")); // concatena a variavel nome com a string passada.

        final var reverse = builder.reverse();

        System.out.println(reverse);

        final var insert = reverse.insert(0, "#").insert(reverse.length(), "#");
        //insere caracteres em posições especificas na variavel reverse.
        System.out.println(insert);

    }
}
