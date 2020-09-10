import java.util.Arrays;

public class ht2 {

    public static void main(String[] args) {
        //на вход
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] arr2 = new int[8];
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] arr4 = {11, 33, 12, 2, 49, 55, 73, 14};
        int[][] arr5 = new int[3][3];
        int[] arr6 = {5, 13, 2, 5, 4};

        first(arr1);
        second(arr2);
        third(arr3);
        fourthmin(arr4);
        fourthmax(arr4);
        fourthmax(arr4);
        fifth(arr5);
        sixth(arr6);
    }
    //задание 1. может и не самое короткое решение... думал как-то через свитч.. но свитч не принимает массивы...

    private static void first(int[] arr1) {

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) arr1[i] = 1;
            else arr1[i] = 0;

        }
        //проверка
        //  System.out.println(Arrays.toString(arr1));
    }

    //задание 2, опять все тот же цикл for, но мне он кажется удобным, буду признателен если черканете в 2х словах как былоб лучше
    private static void second(int[] arr2) {

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1 + i * 2;

        }
        //проверка
        // System.out.println(Arrays.toString(arr2));
    }

    //задание 3, опять все тот же цикл for то ли я идиот то ли он очень удобен)
    private static void third(int[] arr3) {

        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
                //проверка
                // System.out.println(arr3[i]);
            }

        }

    }


    //задание 4 //для разнообразия попробую while и do while, а так конечно мне кажется for - универсальный вариант
    //минимум
    private static void fourthmin(int[] arr4) {
        int min = arr4[0];
        int i = 0;
        while (i < arr4.length) {
            if (arr4[i] < min) {
                min = arr4[i];
            }
            i++;

        }
        //проверка
        //      System.out.println(min);
    }

    //максимум
    private static void fourthmax(int[] arr4) {
        int max = arr4[0];
        int i = 0;
        do {
            if (arr4[i] > max) {
                max = arr4[i];
            }
            i++;
        }
        while (i < arr4.length);
        //проверка
        //    System.out.println(max);
    }


    //задание 5 в общем ничего лучше не придумал чем вложенным циклом, единствено проблемы с выводом
    private static void fifth(int[][] arr5) {
        for (int i = 0; i < arr5.length; i++)
            for (int j = 0; j < arr5.length; j++)
                arr5[i][j] = (i == j) || (i + j == arr5.length - 1) ? 1 : 0;
        // не знаю правда как вывести красиво табличку, вы как-то показывали, но что-то не понял...
        //проверка
        // System.out.println(Arrays.deepToString(arr5));
    }


    //задание 6 намудрил, но вроде работает, уверен что можно было проще
    private static boolean sixth(int[] arr6) {
        int[] left1 = new int[arr6.length - (arr6.length / 2)];
        int[] right1 = new int[arr6.length - left1.length];

        int[] left2 = new int[right1.length];
        int[] right2 = new int[left1.length];;

        int sumleft1 =0;
        int sumleft2 =0;
        int sumright1 =0;
        int sumright2 =0;


        for (int i = 0; i < left1.length; i++) {
        left1[i]=arr6[i];
        sumleft1 = sumleft1 + left1[i];

        }

        for (int i = 0; i < right1.length; i++) {
            right1[i]=arr6.length-i;
            sumright1 = sumright1 + right1[i];

        }

        for (int i = 0; i < left2.length; i++) {
            left2[i]=arr6[i];
            sumleft2 = sumleft2 + left1[i];

        }

        for (int i = 0; i < right2.length; i++) {
            right2[i]=arr6.length-i;
            sumright2 = sumright2 + right2[i];

        }






        System.out.println(sumleft2);
        if(sumleft1==sumright1 || sumleft2 == sumright2)
        {
            return true;
        }
else
    return false;
    }


}
