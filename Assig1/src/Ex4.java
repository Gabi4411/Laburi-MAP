public class Ex4 {
    private final int[] keyboardPrice, usbPrice;
    Ex4(int[] keyboardPrice, int[] usbPrice) {
        this.keyboardPrice = keyboardPrice;
        this.usbPrice = usbPrice;
    }

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

    public int lowest() {
        return sortArray(this.keyboardPrice)[0];
    }

    public int highest() {
        if(sortArray(this.keyboardPrice)[keyboardPrice.length - 1] > sortArray(this.usbPrice)[usbPrice.length - 1]) {
            return sortArray(this.keyboardPrice)[keyboardPrice.length - 1];
        }
        return sortArray(this.usbPrice)[usbPrice.length - 1];
    }

    public int whatUsbYouAfford(int afford) {
        int i = 0;
        while(i < this.usbPrice.length && sortArray(this.usbPrice)[i] <= afford) {
            i++;
        }
        return sortArray(this.usbPrice)[i - 1];
    }

    public String whatYouAfford(int afford) {
        int max = 0;
        int keyboard = 0;
        int usb = 0;

        for (int i = 0; i < usbPrice.length; i++) {
            for (int j = 0; j < keyboardPrice.length; j++) {
                if(sortArray(this.usbPrice)[i] + sortArray(this.keyboardPrice)[j] > afford) {
                    break;
                }
                else {
                    if((sortArray(this.usbPrice)[i] + sortArray(this.keyboardPrice)[j]) > max) {
                        max = sortArray(this.usbPrice)[i] + sortArray(this.keyboardPrice)[j];
                        usb = sortArray(this.usbPrice)[i];
                        keyboard = sortArray(this.keyboardPrice)[j];
                    }
                }
            }
        }

        if(max == 0) {
            return "-1";
        }
        else {
            return "Max: " + max + " = " + usb + " = " + keyboard;
        }
    }
}
