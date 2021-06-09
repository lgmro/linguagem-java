package lucas.agenda;

import java.util.Scanner;

public class ExecucaoAgenda {
        public static void main (String [] args) {
            Agenda minhaagenda = new Agenda();
            Scanner lertexto = new Scanner(System.in);
            Scanner lerinteiro = new Scanner (System.in);

            System.out.println ("Informe um nome para sua agenda: ");
            minhaagenda.setNome(lertexto.nextLine());

            Contatos[] addcontatos = new Contatos[3];

            for (int i = 0; i < addcontatos.length; i++) {
                Contatos addcontato = new Contatos();
                System.out.println ("Informe os dados do " + (i+1) + "º contato: ");

                System.out.printf ("Informe o nome do contato: ");
                addcontato.setNomecontato(lertexto.nextLine());

                System.out.printf("Informe o e-mail do contato: ");
                addcontato.setEmail(lertexto.nextLine());

                System.out.printf("Informe o telefone do contato: ");
                addcontato.setTelefone(lerinteiro.nextInt());

                addcontatos[i] = addcontato;
            }
            minhaagenda.setContatosagenda(addcontatos);

        }

}
