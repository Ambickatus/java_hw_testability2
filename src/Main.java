public class Main {
    public static void main(String[] args) {

        double heightKg = 1.87;
        double weightM = 98;
        BmiService service = new BmiService();
        double bmi = service.calculate(heightKg, weightM);
        System.out.println((int) bmi);

    }
}
