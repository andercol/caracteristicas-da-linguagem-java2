package operadores;
/*
* Exemplos de utilização de operadores logicos
*
* Short Circuit - se o primeiro teste falhar não faz o segundo teste
* Non Short Circuit - se o primeiro teste falhar continua e faz o segundo teste
*
* */


public class Logicos {
    public static void main(String[] args) {

        final var numero = 2;
        final var letra = "A";

        // && = e
        // || = ou

        //Sort Circuit
        if (numero < 5 && letra.equals("A")) {
            System.out.println("Atendeu a condição");
        }

        if (numero < 5 || letra.equals("A")) {
            System.out.println("Atendeu a outracondição");
        }

        if ((10 - 5) > 1 && (5 - 3) > 1) {
            System.out.println("Lógica maluca...");
        }

        //Non Sort Circuit
        if (verifica(15) | verifica("A")) {
            System.out.println("OK");
        } else {
            System.out.println("Não OK");
        }

        }

    private static boolean verifica(String letra) {
        System.out.println("Verificando letra...");
        return letra.equals("A");
    }

    private static boolean verifica(Integer numero) {
        System.out.println("verificando numero...");
        System.out.println(numero > 20);
        return numero > 20;
    }

}


