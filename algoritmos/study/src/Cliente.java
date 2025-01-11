public class Cliente {

    private String nome;


    public Cliente(String nome) {
        this.nome = nome;

    }

    public String nome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }




    public String toString() {
        String dado = "\nCliente"+"{" + "Nome =" + nome + '}';
        return dado;
    }
}
