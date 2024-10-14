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
    }
}