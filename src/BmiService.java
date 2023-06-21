public class BmiService {

    public int calculate(int weightInKg, double heightInMiters) {
        return (int) (weightInKg / heightInMiters / heightInMiters);
    }
}
