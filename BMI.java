public class BMI {
    private double weightKg;
    private double heightM;

    public BodyMass(double weightKg, double heightM) {
        this.weightKg = weightKg;
        this.heightM = heightM;
    }

    private double countBmi() {
        return this.weightKg / (this.heightM * this.heightM);
    }

    public String getCriteria() {
        double bmi = countBmi();
        String criteria;

        if (bmi < 18.5) {
            criteria = "Less Weight";
        } else if (bmi <= 24.9) {
            criteria = "Ideal Weight";
        } else if (bmi <= 29.9) {
            criteria = "Much Weight";
        } else if (bmi <= 39.9) {
            criteria = "Fat";
        } else {
            criteria = "Very Fat";
        }
        return criteria;
    }

    public void displayResult() {
        double bmi = countBmi();
        String criteria = getCriteria();

        System.out.println("\n---------------- RESULT ----------------");
        System.out.printf("Ur IMT value: %.1f\n", bmi);
        System.out.println("Criteria              : " + criteria);
        System.out.println("-------------------------------------");
    }
}
