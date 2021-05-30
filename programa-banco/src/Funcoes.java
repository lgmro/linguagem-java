public class Funcoes {


    public void debit (float x, float y) {
        if (x - y > 0) {
            System.out.print(" agora tem o saldo final de: R$ ");
            System.out.println(x - y);

        } else {

            System.out.println(" não possui saldo suficiente para essa operação.");
        }
    }

    public void credit (float x, float y) {
        System.out.print (" agora tem o saldo final de: R$ ");
        System.out.println (x + y);

    }
}
