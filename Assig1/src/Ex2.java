public class Ex2 {
    private int[] sortArray(int[] arr) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        return arr;
    }

    public int max(int[] arr) {
        return sortArray(arr)[arr.length - 1];
    }

    public int min(int[] arr) {
        return sortArray(arr)[0];
    }

    public int maxSum(int[] arr) {
        int sum = 0;
        for (int i = 1; i < sortArray(arr).length; i++) {
            sum += sortArray(arr)[i];
        }

        return sum;
    }

    public int minSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < sortArray(arr).length - 1; i++) {
            sum += sortArray(arr)[i];
        }

        return sum;
    }
}
