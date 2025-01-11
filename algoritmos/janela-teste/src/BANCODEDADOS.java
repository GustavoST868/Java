
import java.util.ArrayList;
import java.util.List;

public class BANCODEDADOS {
    List<String> banco;
    public BANCODEDADOS() {
        banco = new ArrayList<>();
    }

    public void Adicionar(String dado){
        banco.add(dado);
    }

    public String Mostrar(){

        StringBuilder sb = new StringBuilder();

        for (String dado:banco){

            sb.append(dado+"\n");

        }

        return sb.toString();
    }
}
