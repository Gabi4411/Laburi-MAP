import java.util.ArrayList;
import java.util.List;

public class Ex3 {
    public int[] add(int[] firstNum, int[] secondNum) {
        int[] sum = new int[firstNum.length + 1];
        int extra = 0;

        for(int i = firstNum.length - 1; i >= 0; i--) {
            if(firstNum[i] + secondNum[i] + extra > 9) {
                sum[i] = (firstNum[i] + secondNum[i] + extra) % 10;
                extra = (firstNum[i] + secondNum[i] + extra) / 10;
            }
            else {
                sum[i] = firstNum[i] + secondNum[i] + extra;
                extra = 0;
            }
        }

        if(extra != 0) {
            for(int i = sum.length - 1; i > 0; i--) {
                sum[i] = sum[i-1];
            }
            sum[0] = extra;
        }
        return sum;
    }

    public int[] sub(int[] firstNum, int[] secondNum) {
        int[] result = new int[firstNum.length];

        for(int i = firstNum.length - 1; i >= 0; i--) {
            if(firstNum[i] - secondNum[i] < 0) {
                if (i == 0) {
                    result[0] = firstNum[0] - secondNum[0];
                }
                else {
                    result[i] = 10 + (firstNum[i] - secondNum[i]);
                    int j = i - 1;
                    while (firstNum[j] == 0) {
                        firstNum[j] = 9;
                        j -= 1;
                    }
                    firstNum[j] -= 1;
                }
            }
            else {
                result[i] = firstNum[i] - secondNum[i];
            }
        }

        int cnt = 0;
        while(result[cnt] == 0) {
            cnt++;
        }
        if (cnt != 0) {
            for (int i = 0; i < result.length - cnt; i++) {
                result[i] = result[i + cnt];
            }
        }
        return result;
    }

    public int[] mul(int[] firstNum, int secondNum) {
        int[] result = new int[firstNum.length + 1];
        int extra = 0;

        for(int i = firstNum.length - 1; i >= 0; i--) {
            if((firstNum[i] * secondNum + extra) > 9) {
                result[i] = (firstNum[i] * secondNum + extra) % 10;
                extra = (firstNum[i] * secondNum + extra) / 10;
            }
            else {
                result[i] = firstNum[i] * secondNum + extra;
                extra = 0;
            }
        }
        if(extra != 0) {
            for(int i = firstNum.length - 1; i > 0; i--) {
                result[i] = result[i - 1];
            }
            result[0] = extra;
        }
        return result;
    }

    public List<Integer> div(int[] firstNum, int secondNum) {
        List<Integer> result = new ArrayList<>();
        int extra = 0;
        for(int i = 0; i < firstNum.length - 1; i++) {
            result.add((extra * 10 + firstNum[i]) / secondNum);
            extra = (extra * 10 + firstNum[i]) % secondNum;
        }
        return result;
    }
}
