public class BmiService {
    public int calculate(double heightMeters, double weightKg) {
        return (int) (weightKg / (heightMeters * heightMeters));
    }
}
