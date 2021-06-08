package lucas.agenda;

import java.util.Scanner;

public class ExecucaoAgenda {
        public static void main (String [] args) {
            Agenda minhaagenda = new Agenda();
            Scanner lertexto = new Scanner(System.in);
            Scanner lerinteiro = new Scanner (System.in);

            System.out.println ("Informe um nome para sua agenda: ");
            minhaagenda.setNome(lertexto.nextLine());


        }

}
