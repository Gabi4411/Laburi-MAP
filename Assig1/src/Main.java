//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Ex1
        Ex1 uni = new Ex1();
        int[] grades = {48, 23, 38, 60, 88, 99, 97, 66};

        System.out.println("Erste Methode: ");
        for(int i = 0; i < uni.filterBadGradesOut(grades).length; i++) {
            System.out.println(uni.filterBadGradesOut(grades)[i] + " ");
        }

        System.out.println("Zweite Methode: " + uni.averageGrade(grades));

        System.out.println("Dritte Methode: ");
        for(int i : uni.roundedGrades(grades)) {
            System.out.println(i + " ");
        }

        System.out.println("Vierte Methode: " + uni.maxGrade(grades));

        //Ex2
        Ex2 arr = new Ex2();
        System.out.println("Max: " + arr.max(grades));
        System.out.println("Min: " + arr.min(grades));
        System.out.println("Max Summe: " + arr.maxSum(grades));
        System.out.println("Min Summe: " + arr.minSum(grades));

        //Ex3
        int[] num1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] num2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};
        int[] num3 = {8, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] num4 = {5, 4, 0, 0, 0, 0, 0, 0, 0};
        int[] num5 = {2, 3, 6, 0, 0, 0, 0, 0, 0};

        Ex3 numbers = new Ex3();
        System.out.println("Sum: ");
        for (int i : numbers.add(num1, num2)) {
            System.out.printf(i + " ");
        }
        System.out.print("\n");

        System.out.println("Difference: ");
        for (int i : numbers.sub(num3, num4)) {
            System.out.printf(i + " ");
        }
        System.out.print("\n");


        System.out.println("Multiplication: ");
        for (int i : numbers.mul(num5, 2)) {
            System.out.printf(i + " ");
        }
        System.out.print("\n");


        System.out.println("Division: ");
        for (int i : numbers.div(num5, 2)) {
            System.out.printf(i + " ");
        }
        System.out.print("\n");

        //Ex4
        int[] keyboardPrices = {40, 35, 70, 15, 45};
        int[] usbPrices = {20, 15, 30, 15};
        Ex4 maga = new Ex4(keyboardPrices, usbPrices);

        System.out.println("Lowest: " + maga.lowest());
        System.out.println("Highest: " + maga.highest());
        System.out.println("What USB Markus can afford: " + maga.whatUsbYouAfford(30));
        System.out.println("What Markus can afford: " + maga.whatYouAfford(60));
    }
}