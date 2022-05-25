package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number > 1;
        for (int index = 1; index == number; index++) {
            if ((number % index) == 0) {
                prime = false;
                break;
            }
        }
                return prime;
    }
}