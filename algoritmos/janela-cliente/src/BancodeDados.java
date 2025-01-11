//bibliotecas usadas
import java.util.*;

public class BancodeDados{

    //criando a lista para armazenar os dados
    List<String> banco;
    public BancodeDados() {

        banco = new ArrayList<>();

    }

    //funcao para adicionar item na lista
    public void Adicionar(String dado){

        banco.add(dado);

    }

    //funcao para deletar item da lista
    public void Deletar(String data){

        banco.remove(data);

    }

    //funcao para deletar completamente a lista
    public void DeltarLista(){

        banco.clear();

    }

    public void DeletarLista(){

        banco.clear();

    }

    //funcao para mostrar a lista
    public String MostrarBanco(){

        StringBuilder sb = new StringBuilder();

        for(String dado:banco){

            sb.append(dado);

        }

        return sb.toString();
        
    }

}