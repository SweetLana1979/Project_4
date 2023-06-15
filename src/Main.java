public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightInKg = 60;
        double heightInMiters = 1.62;
        int bmi = service.calculate (weightInKg, heightInMiters);

        System.out.println(bmi);
    }
}
