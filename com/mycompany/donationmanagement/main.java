package com.mycompany.DonationManagement;

import service.LayananDonasi;
import model.Donatur;
import model.Donasi;
import java.util.Scanner;
import model.RegularDonatur;
import model.VIPDonatur;
import model.RegularDonasi;
import model.LargeDonasi;

public class main {
    public static void main(String[] args) {
        LayananDonasi donationService = new LayananDonasi();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n" +
                "-----------------------------------\n" +
                "   Sistem Manajemen Donasi Online  \n" +
                "-----------------------------------\n" +
                "                                   \n" +
                "    [1] Menu Donatur               \n" +
                "    [2] Menu Donasi                \n" +
                "    [3] Exit                       \n" +
                "                                   \n" +
                "-----------------------------------");
            System.out.print("Pilih (1-3): ");
            int mainChoice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (mainChoice) {
                case 1:
                    manageDonors(donationService, scanner);
                    break;
                case 2:
                    manageDonations(donationService, scanner);
                    break;
                case 3:
                    running = false;
                    System.out.println("Anda Sudah Keluarr...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid bro");
            }
        }

        scanner.close();
    }

    private static void manageDonors(LayananDonasi donationService, Scanner scanner) {
        boolean donorMenu = true;
        while (donorMenu) {
            System.out.println("\n" +
                "-----------------------------------\n" +
                "        Menu Kelola Donatur        \n" +
                "-----------------------------------\n" +
                "                                   \n" +
                "    [1] Tambah Donatur             \n" +
                "    [2] Lihat Daftar Donatur       \n" +
                "    [3] Perbarui Data Donatur      \n" +
                "    [4] Hapus Donatur              \n" +
                "    [5] Kembali ke Menu Utama      \n" +
                "                                   \n" +
                "-----------------------------------");
            System.out.print("Pilih menu (1-5): ");
            int donorChoice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (donorChoice) {
                case 1:
                    System.out.print("Masukkan tipe donatur (1 untuk Regular, 2 untuk VIP): ");
                    int donorType = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Masukkan nama donatur: ");
                    String name = scanner.nextLine();
                    System.out.print("Masukkan email donatur: ");
                    String email = scanner.nextLine();

                    Donatur donatur;
                    if (donorType == 1) {
                        donatur = new RegularDonatur(name, email);
                    } else {
                        donatur = new VIPDonatur(name, email);
                    }

                    donationService.tambah(donatur);
                    break;
                case 2:
                    donationService.daftarSemua(); // Menggunakan metode yang benar
                    break;
                case 3:
                    System.out.print("Masukkan nama donatur yang akan diperbarui: ");
                    String currentName = scanner.nextLine();
                    System.out.print("Masukkan nama baru donatur: ");
                    String newName = scanner.nextLine();
                    System.out.print("Masukkan email baru donatur: ");
                    String newEmail = scanner.nextLine();
                                        Donatur donaturToUpdate = new Donatur(newName, newEmail); // Asumsi Anda memiliki konstruktor di Donatur
                    donationService.perbarui(donaturToUpdate);
                    break;
                case 4:
                    System.out.print("Masukkan nama donatur yang akan dihapus: ");
                    String deleteName = scanner.nextLine();
                    donationService.hapus(deleteName);
                    break;
                case 5:
                    donorMenu = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private static void manageDonations(LayananDonasi donationService, Scanner scanner) {
        boolean donationMenu = true;
        while (donationMenu) {
            System.out.println("\n" +
                "-----------------------------------\n" +
                "           Menu Donasi             \n" +
                "-----------------------------------\n" +
                "                                   \n" +
                "    [1] Tambah Donasi              \n" +
                "    [2] Lihat Daftar Donasi        \n" +
                "    [3] Perbarui Donasi            \n" +
                "    [4] Hapus Donasi               \n" +
                "    [5] Kembali ke Menu Utama      \n" +
                "                                   \n" +
                "-----------------------------------");
            System.out.print("Pilih menu (1-5): ");
            int donationChoice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (donationChoice) {
                case 1:
                    System.out.print("Masukkan nama donatur: ");
                    String donorName = scanner.nextLine();
                    System.out.print("Masukkan jumlah donasi: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine(); // consume newline
                    System.out.print("Masukkan tipe donasi (1 untuk Regular, 2 untuk Large): ");
                    int donationType = scanner.nextInt();
                    Donasi donasi;

                    if (donationType == 1) {
                        donasi = new RegularDonasi(donorName, amount);
                    } else {
                        donasi = new LargeDonasi(donorName, amount);
                    }

                    donationService.tambahDonasi(donasi);
                    break;
                case 2:
                    donationService.daftarSemuaDonasi(); // Menggunakan metode yang benar
                    break;
                case 3:
                    System.out.print("Masukkan nama donatur untuk memperbarui donasi: ");
                    String nameToUpdate = scanner.nextLine();
                    System.out.print("Masukkan jumlah donasi baru: ");
                    double newAmount = scanner.nextDouble();
                    donationService.perbaruiDonasi(nameToUpdate, newAmount);
                    break;
                case 4:
                    System.out.print("Masukkan nama donatur untuk menghapus donasi: ");
                    String nameToDelete = scanner.nextLine();
                    donationService.hapusDonasi(nameToDelete);
                    break;
                case 5:
                    donationMenu = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}

