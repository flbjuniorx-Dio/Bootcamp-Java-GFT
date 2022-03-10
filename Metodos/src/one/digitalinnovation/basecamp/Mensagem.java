package one.digitalinnovation.basecamp;

public class Mensagem {

    public static String retornaMensagem(int hora) {

        if (hora >= 5 && hora <= 12) {

            return "Bom dia!";

        } else if ( hora > 12 && hora <=18 ) {

            return "Boa tarde!";

        } else if (( hora > 18 && hora < 23 ) || ( hora >= 0 && hora < 5 )) {

            return "Boa noite!";

        } else {

            return "Hora invalida!";

        }

    }

}
