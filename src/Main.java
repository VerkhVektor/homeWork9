//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //задача 1

    int[] inputArray1 = {32, 12, 44, 56, 85};
    int[] outputArray1 = new int[4];
    int maximum = -1;
    int minimum = 10000000;

    for (int element : inputArray1) {
        outputArray1[0] += element;
        if (element > maximum) {
            maximum = element;
            outputArray1[1] = maximum;
        }
        if (element < minimum) {
            minimum = element;
        }
        outputArray1[2] = minimum;
        outputArray1[3] = outputArray1[0] / inputArray1.length;
    }
    System.out.println(Arrays.toString(inputArray1));
    System.out.println(Arrays.toString(outputArray1));



    // Задача 2

    int[] inputArray2 = {4000, 8000, 15000, 16000, 23000};
    int[] outputArray2 = new int[inputArray2.length];
    int i = 0;
    for (int el : inputArray2) {
        int tax = el * 13 / 100;
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







