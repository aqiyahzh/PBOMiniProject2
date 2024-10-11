package service;

import model.Donatur;
import model.Donasi;
import java.util.ArrayList;

public final class LayananDonasi implements CRUD<Donatur> {
    private final ArrayList<Donatur> donaturList = new ArrayList<>();
    private final ArrayList<Donasi> donasiList = new ArrayList<>();

    @Override
    public void tambah(Donatur donatur) {
        donaturList.add(donatur);
        System.out.println("Donatur baru ditambahkan: " + donatur.getName());
    }

    @Override
    public void perbarui(Donatur donatur) {
        Donatur donor = cariDonaturBerdasarkanNama(donatur.getName());
        if (donor != null) {
            donor.setName(donatur.getName());
            System.out.println("Donatur diperbarui.");
        } else {
            System.out.println("Donatur tidak ditemukan.");
        }
    }


    @Override
    public void hapus(String nama) {
        Donatur donor = cariDonaturBerdasarkanNama(nama);
        if (donor != null) {
            donaturList.remove(donor);
            System.out.println("Donatur dihapus.");
        } else {
            System.out.println("Donatur tidak ditemukan.");
        }
    }

    @Override
    public void daftarSemua() {
        if (donaturList.isEmpty()) {
            System.out.println("Tidak ada donatur.");
        } else {
            for (Donatur d : donaturList) {
                System.out.println("Nama: " + d.getName() + ", Email: " + d.getEmail() + ", Tipe: " + d.getClass().getSimpleName());
            }
        }
    }

    public void tambahDonasi(Donasi donasi) {
        donasiList.add(donasi);
        System.out.println("Donasi ditambahkan.");
    }

    public void perbaruiDonasi(String namaDonatur, double jumlahBaru) {
        Donasi donasi = cariDonasiBerdasarkanNamaDonatur(namaDonatur);
        if (donasi != null) {
            donasi.setAmount(jumlahBaru); // Now this will work
            System.out.println("Donasi diperbarui.");
        } else {
            System.out.println("Donasi tidak ditemukan.");
        }
    }


    public void hapusDonasi(String namaDonatur) {
        Donasi donasi = cariDonasiBerdasarkanNamaDonatur(namaDonatur);
        if (donasi != null) {
            donasiList.remove(donasi);
            System.out.println("Donasi dihapus.");
        } else {
            System.out.println("Donasi tidak ditemukan.");
        }
    }

    public void daftarSemuaDonasi() {
        if (donasiList.isEmpty()) {
            System.out.println("Tidak ada donasi.");
        } else {
            for (Donasi d : donasiList) {
                System.out.println("Nama Donatur: " + d.getDonorName() + ", Jumlah: " + d.getAmount());
            }
        }
    }

    private Donatur cariDonaturBerdasarkanNama(String nama) {
        for (Donatur d : donaturList) {
            if (d.getName().equalsIgnoreCase(nama)) {
                return d;
            }
        }
        return null;
    }

    private Donasi cariDonasiBerdasarkanNamaDonatur(String namaDonatur) {
        for (Donasi d : donasiList) {
            if (d.getDonorName().equalsIgnoreCase(namaDonatur)) {
                return d;
            }
        }
        return null;
    }
}
