import Model.Calculadora;
import Model.CalculadoraCompleta;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        CalculadoraCompleta originalCC = new CalculadoraCompleta(2, 6);
        Calculadora originalC = new Calculadora(2, 6);

        CalculadoraCompleta cc = originalCC.clone();
        Calculadora c = originalC.clone();

        cc.setNumeroUm(3);
        c.setNumeroUm(3);

        System.out.println("CalculadoraCompleta Clone: " + cc.toString() + "\n\n");
        System.out.println("Calculadora Clone: " + c.toString());
    }
}
