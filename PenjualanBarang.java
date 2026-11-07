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

public class PenjualanBarang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] kodeBarang = {"A01", "B02", "C02"};
        String[] namaBarang = {"Hardisk", "Monitor", "Mouse"};
        int[] hargaBarang = {700000, 800000, 50000};

        System.out.print("Masukkan jumlah pembeli: ");
        int n = input.nextInt();
        input.nextLine();

        String[] namaPembeli = new String[n];
        String[] kode = new String[n];
        String[] barang = new String[n];
        int[] jumlah = new int[n];
        int[] harga = new int[n];
        int[] bayar = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nPembeli ke-" + (i + 1));

            System.out.print("Nama pembeli: ");
            namaPembeli[i] = input.nextLine();

            System.out.print("Kode barang (A01/B02/C02): ");
            kode[i] = input.nextLine();

            System.out.print("Jumlah barang: ");
            jumlah[i] = input.nextInt();
            input.nextLine();

            int posisi = -1;

            for (int j = 0; j < kodeBarang.length; j++) {
                if (kode[i].equalsIgnoreCase(kodeBarang[j])) {
                    posisi = j;
                    break;
                }
            }

            if (posisi != -1) {
                barang[i] = namaBarang[posisi];
                harga[i] = hargaBarang[posisi];
                bayar[i] = harga[i] * jumlah[i];
            } else {
                barang[i] = "Kode tidak valid";
                harga[i] = 0;
                bayar[i] = 0;
                System.out.println("Kode barang tidak ditemukan!");
            }
        }

        System.out.println("\n======================================================================");
        System.out.printf("%-4s %-15s %-12s %-15s %8s %10s %12s%n",
                "No", "Nama Pembeli", "KodeBarang", "NamaBarang",
                "Jumlah", "Harga", "Bayar");
        System.out.println("======================================================================");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-4d %-15s %-12s %-15s %8d %10d %12d%n",
                    i + 1, namaPembeli[i], kode[i], barang[i],
                    jumlah[i], harga[i], bayar[i]);
        }

        System.out.println("======================================================================");

        input.close();
    }
}