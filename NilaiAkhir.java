/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.array;

/**
 *
 * @author engga
 */
import java.util.Scanner;

public class NilaiAkhir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = input.nextInt();
        input.nextLine();

        String[] nim = new String[n];
        String[] nama = new String[n];
        double[] uts = new double[n];
        double[] uas = new double[n];
        double[] nilaiAkhir = new double[n];
        String[] indeks = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nMahasiswa ke-" + (i + 1));

            System.out.print("NIM: ");
            nim[i] = input.nextLine();

            System.out.print("Nama: ");
            nama[i] = input.nextLine();

            System.out.print("Nilai UTS: ");
            uts[i] = input.nextDouble();

            System.out.print("Nilai UAS: ");
            uas[i] = input.nextDouble();
            input.nextLine();

            nilaiAkhir[i] = (uts[i] * 0.5) + (uas[i] * 0.5);

            if (nilaiAkhir[i] >= 80) {
                indeks[i] = "A";
            } else if (nilaiAkhir[i] >= 70) {
                indeks[i] = "B";
            } else if (nilaiAkhir[i] >= 60) {
                indeks[i] = "C";
            } else if (nilaiAkhir[i] >= 50) {
                indeks[i] = "D";
            } else {
                indeks[i] = "E";
            }
        }

        System.out.println("\n==============================================================");
        System.out.printf("%-4s %-12s %-15s %6s %6s %12s %8s%n",
                "No", "NIM", "Nama", "UTS", "UAS",
                "Nilai Akhir", "Indeks");
        System.out.println("==============================================================");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-4d %-12s %-15s %6.1f %6.1f %12.1f %8s%n",
                    i + 1, nim[i], nama[i], uts[i], uas[i],
                    nilaiAkhir[i], indeks[i]);
        }

        System.out.println("==============================================================");

        input.close();
    }
}
