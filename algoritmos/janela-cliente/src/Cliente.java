import java.util.Locale;

public class Cliente {
    //atrinutos
     String nome;
     String cpf;
     String descricao;

    public Cliente(String nome,String cpf,String descricao) {

        this.nome = nome;
        this.cpf = cpf;
        this.descricao = descricao;


    }

    //gets e sets


    public String nome() {

        return nome;

    }

    public String cpf() {

        return cpf;

    }

    public String descricao() {

        return descricao;

    }

    public void setNome(String nome) {

        this.nome = nome;

    }

    public void setCpf(String cpf) {

        this.cpf = cpf;

    }

    public void setDescricao(String descricao) {

        this.descricao = descricao;

    }


    public String toString() {

        return "\n\nCliente{" +"\n"+
                "Nome=" + nome + "\n" +
                "Cpf=" + cpf + "\n" +
                "Descricao=" + descricao + "\n" +
                '}';

    }
}
