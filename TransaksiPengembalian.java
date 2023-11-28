/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class TransaksiPengembalian {
    private String id;
    private Date tanggalPeminjaman;
    private Date tanggalPengembalian;
    private String waktu;
    private int durasiPeminjaman;

    public TransaksiPengembalian(String id, Date tanggalPeminjaman, Date tanggalPengembalian,
                                String waktu, int durasiPeminjaman) {
        this.id = id;
        this.tanggalPeminjaman = tanggalPeminjaman;
        this.tanggalPengembalian = tanggalPengembalian;
        this.waktu = waktu;
        this.durasiPeminjaman = durasiPeminjaman;
    }

    public void catatPengembalian() {
        System.out.println("Transaksi Pengembalian - ID: " + id);
        System.out.println("Tanggal Peminjaman: " + formatDate(tanggalPeminjaman));
        System.out.println("Tanggal Pengembalian: " + formatDate(tanggalPengembalian));
        System.out.println("Waktu: " + waktu);
        System.out.println("Durasi Peminjaman: " + durasiPeminjaman + " hari");
        System.out.println("Pengembalian berhasil dicatat.");
        System.out.println("-----------------------------");
    }

    private String formatDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try {
            return sdf.format(date);
        } catch (Exception e) {
            e.printStackTrace();
            return "Invalid Date";
        }
    }
}

