package streams;

import java.util.stream.IntStream;

/*
* Exercício com IntStream
* Stream API é um recurso implementado no Java 8 com o objetivo de facilitar a manipulação de conjutos de elmentos
* */
public class Stream {

    public static void main(String[] args) {

        //Percorre o array passado e imprime na tela
        IntStream.of(1, 2, 3, 4, 5).forEach(n -> {
            System.out.println(n);
        });

        //passado o range 0 - 3 imprime na tela esses números
        IntStream.range(0, 3).forEach(n -> {
            System.out.println("Número = " + n);
        });

    }
}