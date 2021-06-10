package lucas.agenda;

public class Agenda {
    private String nome;
    private Contatos[] contatosagenda;


    public String getNome() {
        return this.nome;
    }

    public void setNome (String nome) {
        this.nome = nome;

    }

    public Contatos[] getContatosagenda() {
        return this.contatosagenda;
    }

    public void setContatosagenda (Contatos[] contatosagenda) {
        this.contatosagenda = contatosagenda;

    }

    public String obterInformacao() {
        String info = "";
        for (Contatos cont:contatosagenda) {
            info += cont.obterinfo();
        }

        System.out.println("----------------------------");
        System.out.println("    " + this.nome + "   ");
        System.out.println("----------------------------");
        return info;

    }

}
