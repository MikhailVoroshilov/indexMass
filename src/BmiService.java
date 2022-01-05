public class BmiService {

    public double calculate(double mass, double h) {
        double hi = h / 100;
        double massIndex = mass / (hi * hi);
        double roundOff = Math.round(massIndex*100)/100.00;
        return roundOff;
    }
}

