public class Main {
    public static void main(String[] args) {
        System.out.print("\nЗадача 1");
        int[] integerArray = new int[]{1, 2, 3, 5, 6 , 7 ,8 ,9};


        double[] doubleArray = {1.57, 7.654, 9.986};


        String[] arbitraryArray = new String[]{"apple", "banana", "orange"};

        System.out.println("\nЗадача 2");
        System.out.print("Целочисленный массив: ");
        for (int i = 0; i < integerArray.length; i++) {
            System.out.print(integerArray[i]);
            if (i < integerArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.print("Массив с дробными числами: ");
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.print(doubleArray[i]);
            if (i < doubleArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.print("Произвольный массив: ");
        for (int i = 0; i < arbitraryArray.length; i++) {
            System.out.print(arbitraryArray[i]);
            if (i < arbitraryArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("\nЗадача 3");

        System.out.print("Целочисленный массив: ");
        for (int i = integerArray.length - 1; i >= 0; i--) {
            System.out.print(integerArray[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.print("Массив с дробными числами: ");
        for (int i = doubleArray.length - 1; i >= 0; i--) {
            System.out.print(doubleArray[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.print("Произвольный массив: ");
        for (int i = arbitraryArray.length - 1; i >= 0; i--) {
            System.out.print(arbitraryArray[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println("\nЗадача 4");
        System.out.println("Модифицированный целочисленный массив: ");
        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] % 2 != 0) {
                integerArray[i]++;
            }
            System.out.print(integerArray[i]);
            if (i < integerArray.length - 1) {
                System.out.print(", ");
            }
        }
    }

}