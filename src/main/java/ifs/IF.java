package ifs;
/*
* Classe criada para estudo da condicional If
* */
public class IF {

    public static void main(String[] args) {

        final var condicao = true;

        if (condicao){

            System.out.println("A condição é verdadeira!");
        }else{
            System.out.println("A condição é falsa!");
        }

        if (condicao) System.out.println("uma única linha "); // se código só tem uma linha, não precisa abrir chaves

        final var ternario = condicao ? "É verdadeira.." : "É falça...";
        //if ternário - toda a condição do if e else em uma unica linha

        System.out.println(ternario);

    }
}
