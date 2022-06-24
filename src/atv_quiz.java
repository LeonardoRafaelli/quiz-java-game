/**
 * @author Diego Planinscheck e Leonardo Rafaelli
 * @version 0.5
 * Tema: Enigmas, podendo utilizar o navegador para solucioná-los
 */

import java.util.Scanner;

public class atv_quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String res;
        int verify = 0;

        System.out.println("Bem vindo ao QUIZ??");
        System.out.println("1?");
        System.out.println("2008, o filme aonde o tempo não existe mais");

        //Do While, foram colocados para que a pessoa responda até que sua resposta seja a esperada pelo programa (solução de cada fase do enigma);
        do{
            System.out.print("-->: ");
            res = sc.nextLine();
        }while(!res.equalsIgnoreCase("fim dos tempos"));

        System.out.println("2?");
        System.out.println("No meu aniversário de 10 anos, preparou uma surpresa, mas fui eu.");
        do{
            System.out.print("-->: ");
            res = sc.nextLine();
        }while(!res.equalsIgnoreCase("preparei uma surpresa"));

        System.out.println("3?");
        System.out.println("cum morieris");
        do{
            System.out.print("-->: ");
            res = sc.nextLine();
        }while(!res.equalsIgnoreCase("quando voce morre"));

        System.out.println("4?");
        System.out.println("abbacsdee6f4g");
        do{
            System.out.print("-->: ");
            res = sc.nextLine();
        }while(!res.equalsIgnoreCase("Base64"));

        System.out.println("5?");
        System.out.println("01110110 01101111 01100011 01100101 00100000 01100100 01100101 01110011 01100011 01101111 01100010 01110010 01100101 00001010");
        do{
            System.out.print("-->: ");
            res = sc.nextLine();
        }while(!res.equalsIgnoreCase("voce descobre"));

        System.out.println("6?");
        System.out.println(". -. -.-. --- -. - .-. . / .- / -.-. .... .- ...- .");
        do{
            System.out.print("-->: ");
            res = sc.nextLine();
        }while(!res.equalsIgnoreCase("encontre a chave"));

        System.out.println("7?");
        System.out.println("Lawrence Grey, 00110010 ----- 00110001 .....");
        do{
            System.out.print("-->: ");
            res = sc.nextLine();

            // Ifs foram adicionados para dar dicas ao jogador e também para dividir a fase em etapas.

            if(res.equalsIgnoreCase("hidden")){
                System.out.println("≅");
            }
        }while(!res.equalsIgnoreCase("escondido"));

        System.out.println("7?");
        System.out.println("->CESAR<-");
        do{
            System.out.print("-->: ");
            res = sc.nextLine();
            if(res.equalsIgnoreCase("cesar")){
                System.out.println("alualuvchtlual");
            }
        }while(!res.equalsIgnoreCase("tente novamente"));

        System.out.println("9?");
        System.out.println("gajninto??");
        do{
            System.out.print("-->: ");
            res = sc.nextLine();
            if(res.equalsIgnoreCase("ne")){
                System.out.println("איזו בושה");
            }
        }while(!res.equalsIgnoreCase("que pena"));

        System.out.println("100?");
        System.out.println("Criador da Cifra de Vigenère");
        do{
            System.out.print("-->: ");
            res = sc.nextLine();

            //if else, foram adicionados para separar as fases em etapas também.
            if(res.equalsIgnoreCase("Giovan Battista Bellaso")){
                System.out.println("Nada é o que parece, DESISTA");
                verify = 1;
            } else
                if(res.equalsIgnoreCase("Blaise de Vigenere")){
                    if(verify == 1){
                        System.out.println("kxlxk://b.ip.kw/2022/06/22/cgwcl6.tfo");
                        System.out.println("Get your answers all together, 4");
                    }
                }
        }while(!res.equalsIgnoreCase("sua desistencia"));
        
        System.out.println("A vitória é a junção de processos bem realizados, sem que haja espaços para falha");
        do{
            System.out.print("-->: ");
            res = sc.nextLine();
        }while(!res.equalsIgnoreCase("fimdostemposprepareiumasurpresaquandovocemorrebase64vocedescobreencontreachaveescondidotentenovamentequepenasuadesistencia"));


        System.out.println("Estavam certos, a vitória foi feita para poucos,\npena se não conseguistes aproveitar da forma correta.");

    }
}
