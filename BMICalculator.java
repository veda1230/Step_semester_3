import java.util.Scanner;

public class BMICalculator {

    static double calculateBMI(double height, double weight) {
        return weight / (height * height);
    }

    static String getStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int n = sc.nextInt();

        double[] heights = new double[n];
        double[] weights = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter height of person " + (i + 1) + " in meters: ");
            heights[i] = sc.nextDouble();

            System.out.print("Enter weight of person " + (i + 1) + " in kg: ");
            weights[i] = sc.nextDouble();
        }

        System.out.println("\nPerson | Height | Weight | BMI | Status");

        for (int i = 0; i < n; i++) {
            double bmi = calculateBMI(heights[i], weights[i]);
            String status = getStatus(bmi);

            System.out.printf("%d      | %.2f   | %.2f   | %.2f | %s%n",
                    i + 1, heights[i], weights[i], bmi, status);
        }

        sc.close();
    }
}