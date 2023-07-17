package EstrutradeCondicoes;

public class PlanoInternet {
    public static void main(String[] args) {
        // VAMOS TER O NOSSO PLANO BASICO COM A LETRA ( B );
        // VAMOS TER O NOSSO PLANO MÉDIO COM A LETRA ( M );
        // VAMOS TER O NOSSO PLANO AVANÇADO COM A LETRA ( A );
        String plano = "B";

        switch (plano) {
            case "B": {
                System.out.println("\nPLANO CONTRATADO COM SUCESSO, AGRADECEMOS PELA PREFERENCIA!\n");
                System.out.println(
                        "PLANO CONTRATADO: MODALIDADE ( BÁSICO )\n Whatsapp 30G INTERNET\n INSTAGRAM 20G internet ");
                break;
            }

            case "M": {
                System.out.println("\nPLANO CONTRATADO COM SUCESSO, AGRADECEMOS PELA PREFERENCIA!\n");
                System.out.println(
                        "PLANO CONTRATADO: MODALIDADE ( MÉDIO )\n Whatsapp 60G INTERNET\n INSTAGRAM 40G internet ");
                break;
            }

            case "A": {
                System.out.println("\nPLANO CONTRATADO COM SUCESSO, AGRADECEMOS PELA PREFERENCIA!\n");
                System.out.println(
                        "PLANO CONTRATADO: MODALIDADE ( AVANÇADO )\n Whatsapp ILIMITADO INTERNET\n INSTAGRAM ILIMITADO internet ");
                break;
            }
        }

    }
}
