//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //задача 1

    float[] inputArray1 = {32, 12, 44, 56, 85};
    float[] outputArray1 = new float[4];

    for (float sum : inputArray1) {
        outputArray1[0] += sum;
    }
    System.out.println(Arrays.toString(inputArray1));
    System.out.println(Arrays.toString(outputArray1));
    float maximum = -1;
    for (float max : inputArray1) {
        if (max > maximum) {
            maximum = max;
        }
    }
    outputArray1[1] = maximum;
    System.out.println(Arrays.toString(inputArray1));
    System.out.println(Arrays.toString(outputArray1));

    float minimum = maximum;
    for (float min : inputArray1) {
        if (min < minimum) {
            minimum = min;
        }
    }
    outputArray1[2] = minimum;
    System.out.println(Arrays.toString(inputArray1));
    System.out.println(Arrays.toString(outputArray1));

    outputArray1[3] = outputArray1[0] / inputArray1.length;
    System.out.println(Arrays.toString(inputArray1));
    System.out.println(Arrays.toString(outputArray1));


    // Задача 2

    float[] inputArray2 = {4000, 8000, 15000, 16000, 23000};
    float[] outputArray2 = new float[inputArray2.length];
    int i = 0;
    for (float el : inputArray2) {
        float tax = el * 0.13f;
        outputArray2[i] = tax;
        i++;
    }
    System.out.println(Arrays.toString(inputArray2));
    System.out.println(Arrays.toString(outputArray2));

    // Задача 3

    int[] inputArray3 = {4000, 5000, 6000, 2000, 3000};
    boolean[] outputArray3 = new boolean[5];
    int j = 0;
    for (int el : inputArray3) {
        if (el >= 5000) {
            outputArray3[j] = true;
        } else {
            outputArray3[j] = false;
        }
        j++;
    }
    System.out.println(Arrays.toString(inputArray3));
    System.out.println(Arrays.toString(outputArray3));


    //Задача 4

    int[] inputArray4 = {2000, 3000, -5, 290, -10000};
    boolean[] outputArray4 = {true};
    for (int debt : inputArray4) {
        if (debt < 0) {
            outputArray4[0] = false;
            break;
        }
    }
    System.out.println(Arrays.toString(inputArray4));
    System.out.println(Arrays.toString(outputArray4));

    //Задача 5

    int[] inputArray5 = {100000, 150000, -20000, 35000, -70000};
    int[] outputArray5 = {0};
    for (int profit : inputArray5) {
        if (profit > 0) {
            outputArray5[0] += 1;
        }
    }
    System.out.println(Arrays.toString(inputArray5));
    System.out.println(Arrays.toString(outputArray5));


}







