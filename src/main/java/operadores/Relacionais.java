package operadores;
/*
* Exemplo de utilização de operadores relacionais
* */
public class Relacionais {

    public static void main(String[] args) {


        final var numero = 6;

        /*
        * >     maior
        * <     menor
        * >=    maior ou igual
        * <=    menor ou igual
        *
        * */

        if (numero > 20) {
            System.out.println("O número é maior que 20");
        } else if (numero >= 10) {
            System.out.println("O número é maior ou igual a 10");
        } else if (numero <= 5) {
            System.out.println("O número é menor ou igual que 5");
        } else {
            System.out.println("nenhuma da anteriores");
        }

    }
}
