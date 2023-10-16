// Geometrica.java
public class Geometrica implements ICalcMedia {
    @Override
    public double CalculaMedia(double p1, double p2) {
        return Math.sqrt(p1 * p2);
    }

    @Override
    public String Situacao(double p1, double p2) {
        if (CalculaMedia(p1, p2) > 7.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}