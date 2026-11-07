/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.array;

/**
 *
 * @author engga
 */
import java.util.Scanner;

public class PenjualanTiket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah pembeli: ");
        int n = input.nextInt();
        input.nextLine();

        String[] nama = new String[n];
        String[] jurusan = new String[n];
        String[] kelas = new String[n];
        int[] jumlahTiket = new int[n];
        int[] harga = new int[n];
        int[] bayar = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nPembeli ke-" + (i + 1));

            System.out.print("Nama pembeli: ");
            nama[i] = input.nextLine();

            System.out.print("Jurusan (Bandung/Jakarta): ");
            jurusan[i] = input.nextLine();

            System.out.print("Kelas (Bisnis/Ekonomi): ");
            kelas[i] = input.nextLine();

            System.out.print("Jumlah tiket: ");
            jumlahTiket[i] = input.nextInt();
            input.nextLine();

            if (kelas[i].equalsIgnoreCase("Bisnis")) {
                if (jurusan[i].equalsIgnoreCase("Bandung")) {
                    harga[i] = 40000;
                } else if (jurusan[i].equalsIgnoreCase("Jakarta")) {
                    harga[i] = 60000;
                } else {
                    harga[i] = 0;
                }
            } else if (kelas[i].equalsIgnoreCase("Ekonomi")) {
                if (jurusan[i].equalsIgnoreCase("Bandung")) {
                    harga[i] = 20000;
                } else if (jurusan[i].equalsIgnoreCase("Jakarta")) {
                    harga[i] = 40000;
                } else {
                    harga[i] = 0;
                }
            } else {
                harga[i] = 0;
            }

            bayar[i] = harga[i] * jumlahTiket[i];
        }

        System.out.println("\n==============================================================");
        System.out.printf("%-4s %-15s %-12s %-12s %10s %10s %12s%n",
                "No", "Nama Pembeli", "Jurusan", "Kelas",
                "Jum Tiket", "Harga", "Bayar");
        System.out.println("==============================================================");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-4d %-15s %-12s %-12s %10d %10d %12d%n",
                    i + 1, nama[i], jurusan[i], kelas[i],
                    jumlahTiket[i], harga[i], bayar[i]);
        }

        System.out.println("==============================================================");

        input.close();
    }
}