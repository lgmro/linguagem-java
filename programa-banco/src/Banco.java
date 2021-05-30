//Importações
import java.sql.SQLOutput;
import java.util.Scanner;

public class Banco {
    public static void main (String[] args) {
        //Declarando variáveis.
        float balance, value;
        char opcion;
        int account;
        String replay = "Sim";


        //Scanner.
        Scanner variablenumeric = new Scanner(System.in);
        Scanner variabletext = new Scanner(System.in);

        //Solicitando informações ao usuário.
        System.out.print ("Qual o número da sua conta bancária: ");
        account = variablenumeric.nextInt();

        System.out.print ("Informe o saldo atual da sua conta: R$ ");
        balance = variablenumeric.nextFloat();

        while (replay.equals("Sim")) {
            System.out.println("Saldo " + balance);
            System.out.print("Opções: D - para debitar e C - para creditar. ");

            System.out.print("O que você quer fazer? ");
            opcion = variabletext.nextLine().charAt(0);

            System.out.print("Qual o valor a ser debitado ou creditado? ");
            value = variablenumeric.nextFloat();

            Funcoes funcao = new Funcoes();

            //balance = funcao.balance2;

            switch (opcion) {
                case 'D':
                    System.out.print("A conta " + account);
                    funcao.debit(balance, value);
                    balance = funcao.balance2;
                    break;

                case 'd':
                    System.out.print("A conta " + account);
                    funcao.debit(balance, value);
                    balance = funcao.balance2;
                    break;

                case 'C':
                    System.out.print("A conta " + account);
                    funcao.credit(balance, value);
                    balance = funcao.balance2;
                    break;

                case 'c':
                    System.out.print("A conta " + account);
                    funcao.credit(balance, value);
                    balance = funcao.balance2;
                    break;
                default:
                    System.out.println("Operação inválida.");
                    break;
            }
            System.out.println ("Você quer fazer outra operação: Digite Sim ou Não. ");
            replay = variabletext.nextLine();
        }
    }

}
