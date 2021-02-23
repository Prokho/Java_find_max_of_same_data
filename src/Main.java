//Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Main {



    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int [] arr = new int[10];
        for(int i=0; i< arr.length; i++)

        {arr[i] = scanner.nextInt();}


        int count = 1;

        int max = 1;

        for (int i = 0; i < arr.length-1; i++) {

            if (arr[i]==(arr[i + 1])) {

                count++;

            } else if (count > max) {

                max = count;

                count = 1;

            } else {

                count = 1;

            }

        }


        System.out.println(max);

    }

}

