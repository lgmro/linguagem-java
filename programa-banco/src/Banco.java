//Importações
import java.sql.SQLOutput;
import java.util.Scanner;

public class Banco {
    public static void main (String[] args) {
        //Declarando variáveis.
        float balance, value;
        char opcion;
        int account;

        //Scanner.
        Scanner variablenumeric = new Scanner(System.in);
        Scanner variabletext = new Scanner(System.in);

        //Solicitando informações ao usuário.
        System.out.print ("Qual o número da sua conta bancária: ");
        account = variablenumeric.nextInt();

        System.out.print ("Informe o saldo atual da sua conta: R$ ");
        balance = variablenumeric.nextFloat();

        System.out.print ("Opções: D - para debitar e C - para creditar. ");

        System.out.print ("O que você quer fazer? ");
        opcion = variabletext.nextLine().charAt(0);

        System.out.print ("Qual o valor a ser debitado ou creditado? ");
        value = variablenumeric.nextFloat();

        switch (opcion) {
            case 'D':
                System.out.print ("A conta " + account);
                debit (balance, value);
                


        }


    }

    static void debit (float x, float y) {

        if (x-y > 0 ) {
            System.out.print (" agora tem o saldo final de: R$ ");
            System.out.println (x-y);

        } else {

            System.out.println (" não possui saldo suficiente para essa operação.");
        }
    }

}
