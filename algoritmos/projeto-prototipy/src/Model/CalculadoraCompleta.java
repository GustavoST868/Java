package Model;

public class CalculadoraCompleta extends Calculadora implements Cloneable {

    public CalculadoraCompleta(double numeroUm, double numeroDois) {
        super(numeroUm, numeroDois);
    }

    double Raiz_1() {
        double Raiz1 = Math.sqrt(getNumeroUm());
        return Raiz1;
    }

    double Raiz_2() {
        double Raiz2 = Math.sqrt(getNumeroDois());
        return Raiz2;
    }

    double Exponencial1() {
        double pow1 = Math.pow(2, getNumeroUm());
        return pow1;
    }

    double Exponencial2() {
        double pow2 = Math.pow(2, getNumeroDois());
        return pow2;
    }

    @Override
    public String toString() {
        return "CalculadoraCompleta [ Exponencial1 = " + Exponencial1() + " Exponencial2 = " + Exponencial2()
                + " Raiz 1 = " + Raiz_1() + " Raiz 2 = " + Raiz_2();
    }

    @Override
    public CalculadoraCompleta clone() throws CloneNotSupportedException {
        return (CalculadoraCompleta) super.clone();
    }
}
