package Model;

public class Calculadora implements Cloneable {

    protected double numeroUm;
    private double numeroDois;

    public Calculadora(double numeroUm, double numeroDois) {
        this.numeroUm = numeroUm;
        this.numeroDois = numeroDois;
    }

    public double getNumeroUm() {
        return numeroUm;
    }

    public double getNumeroDois() {
        return numeroDois;
    }

    public void setNumeroUm(double numeroUm) {
        this.numeroUm = numeroUm;
    }

    public void setNumeroDois(double numeroDois) {
        this.numeroDois = numeroDois;
    }

    @Override
    public String toString() {
        return "Calculator [numeroUm=" + numeroUm + ", numeroDois=" + numeroDois + "]";
    }

    public double Soma() {
        double SomaDosValores = numeroUm + numeroDois;
        return SomaDosValores;
    }

    public double Subtracao() {
        double SubtracaoDosValores = numeroUm - numeroDois;
        return SubtracaoDosValores;
    }

    public double Multiplicacao() {
        double MultiplicacaoDosValores = numeroUm * numeroDois;
        return MultiplicacaoDosValores;
    }

    public double Divisao() {
        double DivisaoDosValores = numeroUm / numeroDois;
        return DivisaoDosValores;
    }

    @Override
    public Calculadora clone() throws CloneNotSupportedException {
        return (Calculadora) super.clone();
    }
}
