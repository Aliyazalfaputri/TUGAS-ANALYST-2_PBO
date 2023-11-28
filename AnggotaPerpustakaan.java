/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Lenovo
 */
class AnggotaPerpustakaan {
    private String nama;
    private String nomorAnggota;
    private String alamat;
    private List<TransaksiPeminjaman> sejarahPeminjaman;

    public AnggotaPerpustakaan(String nama, String nomorAnggota, String alamat) {
        this.nama = nama;
        this.nomorAnggota = nomorAnggota;
        this.alamat = alamat;
        this.sejarahPeminjaman = new ArrayList<>();
        
        Buku bukuSample = new Buku("Java Programming", "ALIYA ZALFA", "123456789");
        TransaksiPeminjaman sampleTransaction = new TransaksiPeminjaman(
                "T1", new Date(), null, "09:00", 7, this, bukuSample);
    }

    public void pinjamBuku(Buku buku, String judulBuku, Date tanggalPinjam, int durasiPinjam) {
        for (TransaksiPeminjaman transaksi : sejarahPeminjaman) {
            if (transaksi.getBuku().getJudulBuku().equals(judulBuku) && transaksi.getTanggalPengembalian() == null) {
                System.out.println("Maaf, buku " + judulBuku + " sudah dipinjam.");
                return;
            }
        }

        if (buku.cekKetersediaan()) {
            TransaksiPeminjaman transaksi = new TransaksiPeminjaman(
                    "T" + (sejarahPeminjaman.size() + 1),
                    new Date(),
                    null,
                    "09:00", // Waktu default
                    durasiPinjam,
                    this,
                    buku
            );
            sejarahPeminjaman.add(transaksi);
            buku.setKetersediaan(false);
            System.out.println("Selamat, Anda berhasil meminjam buku \"" + judulBuku + "\".");
            System.out.println("Buku harus dikembalikan dalam " + durasiPinjam + " hari.");
        } else {
            System.out.println("Maaf, buku " + judulBuku + " tidak tersedia.");
        }
    }

    public void kembalikanBuku(Buku buku, String judulBuku, Date tanggalKembali) {
    for (TransaksiPeminjaman transaksi : sejarahPeminjaman) {
        // Use equalsIgnoreCase for case-insensitive comparison
        if (transaksi.getBuku().getJudulBuku().equalsIgnoreCase(judulBuku) && transaksi.getTanggalPengembalian() == null) {
            transaksi.setTanggalPengembalian(tanggalKembali);
            buku.setKetersediaan(true);
            System.out.println("Anggota " + nama + " telah mengembalikan buku " + judulBuku);
            System.out.println("-----------------------------");
            return;
        }
    }
    System.out.println("Peminjaman buku " + judulBuku + " tidak ditemukan.");
    System.out.println("-----------------------------");
}
}
