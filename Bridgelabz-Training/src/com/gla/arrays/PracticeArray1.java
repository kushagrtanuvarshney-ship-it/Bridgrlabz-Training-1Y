package com.gla.arrays;

    import java.util.Scanner;

    public class PracticeArray1{

        // Method to sort array
        public static void sorting(int a[]) {
            int n = a.length;

            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (a[j] > a[j + 1]) {
                        int temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }
                }
            }
        }

        // Method to print array
        public static void printArray(int a[]) {
            for (int i : a) {
                System.out.print(i + " ");
            }
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter array size: ");
            int n = sc.nextInt();

            int a[] = new int[n];

            System.out.println("Enter array elements:");
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            sorting(a);

            System.out.println("Sorted Array:");
            printArray(a);
        }
    }

