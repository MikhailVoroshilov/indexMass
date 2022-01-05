public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double mass = 86;
        double h = 176;
        double bmi = service.calculate(mass, h);
        System.out.println(bmi);

    }
}
