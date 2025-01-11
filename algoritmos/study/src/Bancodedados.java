import java.util.ArrayList;
import java.util.List;

public class Bancodedados {

    List<String> banco;
    public Bancodedados() {
       banco = new ArrayList<>();
    }

    public void Adicionar(String dado){
        banco.add(dado);
    }


    public String Mostrar(){

        String conta = banco.toString();
        return conta;
    }

    public void Alterar(int i,String dado){
        banco.set(i,dado);
    }


}
