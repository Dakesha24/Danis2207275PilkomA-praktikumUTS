package no3;

/**
 * Danis Keysara Saputra (2207275)
 * Pilkom A
 */

import java.util.Scanner;


public class JumlahDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat: ");
        long bilangan = scanner.nextLong();

        int jumlahDigit = sumDigits(bilangan);
        System.out.println("Jumlah digit dalam bilangan " + bilangan + " adalah " + jumlahDigit);

        scanner.close();
    }

    public static int sumDigits(long n) {
        int jumlah = 0;
        while (n != 0) {
            jumlah += n % 10;
            n /= 10;
        }
        return jumlah;
    }
}

