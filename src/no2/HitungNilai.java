package no2;

/**
 * Danis Keysara Saputra (2207275)
 * Pilkom A
*/

import java.util.Scanner;

public class HitungNilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int bilangan, jumlahPositif = 0, jumlahNegatif = 0, jumlahTotal = 0, jumlahInput = 0;
        
        System.out.println("Masukkan bilangan integer, program akan berhenti jika memasukkan nilai 0:");
        do {
            bilangan = scanner.nextInt();
            if (bilangan != 0) {
                jumlahInput++;
                jumlahTotal += bilangan;

                if (bilangan > 0) {
                    jumlahPositif++;
                } else if (bilangan < 0) {
                    jumlahNegatif++;
                }
            }
        } while (bilangan != 0);

        System.out.println("Jumlah bilangan positif adalah " + jumlahPositif);
        System.out.println("Jumlah bilangan negatif adalah " + jumlahNegatif);
        System.out.println("Nilai total adalah " + (double) jumlahTotal);

        if (jumlahInput > 0) {
            double rataRata = (double) jumlahTotal / jumlahInput;
            System.out.println("Nilai rata-rata adalah " + rataRata);
        } else {
            System.out.println("Tidak ada input untuk dihitung.");
        }

        scanner.close();
    }
}
