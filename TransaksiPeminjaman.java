/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class TransaksiPeminjaman {
   private String id;
    private Date tanggalPeminjaman;
    private Date tanggalPengembalian;
    private String waktu;
    private int durasiPeminjaman;
    private AnggotaPerpustakaan anggota;
    private Buku buku;

    public TransaksiPeminjaman(String id, Date tanggalPeminjaman, Date tanggalPengembalian,
                               String waktu, int durasiPeminjaman, AnggotaPerpustakaan anggota, Buku buku) {
        this.id = id;
        this.tanggalPeminjaman = tanggalPeminjaman;
        this.tanggalPengembalian = tanggalPengembalian;
        this.waktu = waktu;
        this.durasiPeminjaman = durasiPeminjaman;
        this.anggota = anggota;
        this.buku = buku;
    }

    public Buku getBuku() {
        return buku;
    }

    public Date getTanggalPengembalian() {
        return tanggalPengembalian;
    }

    public void setTanggalPengembalian(Date tanggalPengembalian) {
        this.tanggalPengembalian = tanggalPengembalian;
    }

    public void catatPeminjaman() {
        if (tanggalPeminjaman != null) {
            System.out.println("Peminjaman buku " + buku.getJudulBuku() + " oleh " + anggota.getNama()
                    + " pada tanggal " + tanggalPeminjaman + " (" + waktu + ").");
        } else {
            System.out.println("Transaksi peminjaman belum tercatat.");
        }
    }

    public void catatPengembalian() {
        if (tanggalPengembalian != null) {
            System.out.println("Pengembalian buku " + buku.getJudulBuku() + " oleh " + anggota.getNama()
                    + " pada tanggal " + tanggalPengembalian + ".");
        } else {
            System.out.println("Transaksi pengembalian belum tercatat.");
        }
    }
}