public class Ex1 {
    public int[] filterBadGradesOut(int[] grades) {
        int[] badGrades = new int[0];
        for (int i : grades) {
            if (i < 40) {
                int[] temporaryArray = new int[badGrades.length + 1];
                System.arraycopy(badGrades, 0, temporaryArray, 0, badGrades.length);
                temporaryArray[badGrades.length + 1] = i;
                badGrades = new int[temporaryArray.length];
                System.arraycopy(temporaryArray, 0, badGrades, 0, temporaryArray.length);
            }
        }
        return badGrades;
    }

    public String averageGrade(int[] grades) {
        double average = 0;

        for (int i : grades) {
            average += i;
        }

        average /= grades.length;

        return String.format("%.2f", average);
    }

    public int[] roundedGrades(int[] grades) {
        int[] rounded = new int[grades.length];

        for(int i = 0; i <  rounded.length; i++) {
            if(grades[i] < 38) {
                rounded[i] = grades[i];
            }
            else {
                if((grades[i] + 1) % 5 == 0){
                    rounded[i] = grades[i] + 1;
                }
                else if((grades[i] + 2) % 5 == 0){
                    rounded[i] = grades[i] + 2;
                }
                else {
                    rounded[i] = grades[i];
                }
            }
        }

        return rounded;
    }

    public int maxGrade(int[] grades) {
        int max = 0;

        for(int i : this.roundedGrades(grades)) {
            if(i > max) {
                max = i;
            }
        }
        return max;
    }
}
