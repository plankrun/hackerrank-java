package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int max = Integer.MIN_VALUE;
        int temp;

        for (int i = 0; i <= arr.length - 3; i++) {
            for (int j = 0; j <= arr.length - 3; j++) {
                temp = arr[i][j] + arr[i][j+1] +arr[i][j+2] +arr[i+1][j+1] +arr[i+2][j] +arr[i+2][j+1] +arr[i+2][j+2];
                if (temp > max) {
                    max = temp;
                }
            }
        }
        System.out.println(max);

        scanner.close();
    }
}