package strings;
/*
* Projeto elaborado para acompanhamento das aulas de Java no DIO
* Características da linguagem java - parte 2
* String é uma classe que representa uma sequenciade caracteres
* Faz parte do pacote java.lang
* */

import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;

public class Strings {
    public static void main(String[] args) {
/*

        var nome = "Anderson";
        var sobreNome = "Colin";
        final var nomeCompleto = nome +" "+ sobreNome;

        System.out.println(nome);
        System.out.println("Nome do cliente : " + nome);
        System.out.println("Nome completo do cliente : " + nomeCompleto);
        var string = new String(" Minha  String ");
        // posso instanciar uma string com um "new" mas é redundante e não é convecional

        System.out.println("Char na posição : " + string.charAt(5)); //retorna o 5 caracter da string
        System.out.println("Quantidade=" + string.length()); //retorna o tamanho da string
        System.out.println("Sem Trim [" + string + "]");//contacatenando com espaço
        System.out.println("Com Trim [" + string.trim() + "]"); //removendo espaço com o .trim()
        System.out.println("Lower " + string.toLowerCase()); // passando o texto para minusculo
        System.out.println("Upper " + string.toUpperCase()); // passando o texto para maiusculo
        System.out.println("Contém M? " + string.contains("M")); //verifica se a string contem a letra "M"
        System.out.println("Contém X? " + string.contains("X")); //verifica se a string contem a letra "X"
        System.out.println("Replace " + string.replace("n", "$")); //troca um caracter especifico por outro
        System.out.println("Equals? " + string.equals(" Minha String ")); //compara se as strings são iguais
        System.out.println("EqualsIgnoreCase? " + string.equalsIgnoreCase(" minha sTrinG ")); //compara se as strings são iguais ignorando maiusculas e minusculas
        System.out.println("Substring(1,6)=" + string.substring(1, 6));//pega os caracteres entre as posições passadas "1 e 6"
*/

        //Exercicios

        System.out.println("HELO WORLD".toCharArray()); //converte uma string em um array de caracteres

        System.out.println("Aula de Java".split("")); //gera uma array de string com as palavras separadas
        //ao imprimir diretametente vai gerar um códio estranho.
        //para imprir corretamente atribua o resultado a uma variavel e depois imprima conforme abaixo.
        var teste = "Aula de Java".split(" ");
        System.out.println(teste[0]+ " - primeira posição do array teste");
        System.out.println(teste[1]+ " - segunda posição do array teste");
        System.out.println(teste[2]+ " - terceira posição do array teste");

        //ou assim utiliando for
        for (String s: teste){
            System.out.println(s);
        }
        System.out.println("Aula".concat(" de Java ")); //junta as duas strings passadas
        System.out.println("123 asda qw".replaceAll("[0-9]", "#")); //substitui os numeros por #
    }

}
