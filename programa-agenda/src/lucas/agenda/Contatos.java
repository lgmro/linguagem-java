package lucas.agenda;

public class Contatos {
    private String nomecontato;
    private String email;
    private int telefone;

    public String getNomecontato() {
        return this.nomecontato;
    }

    public void setNomecontato(String nomecontato) {
        this.nomecontato = nomecontato;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return this.telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String obterinfo() {
        return "Nome: " + this.nomecontato + "; "
                + "E-mail: " + this.email + "; "
                + "Telefone: " + this.telefone + "\n";

    }

}
