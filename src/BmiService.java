public class BmiService {
    public double calculate(double heightMeters, double weightKg)
    {
        return weightKg/(heightMeters*heightMeters);
    }
}
