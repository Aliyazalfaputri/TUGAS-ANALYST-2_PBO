/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

/**
 *
 * @author Lenovo
 */
class Buku {
    private String judulBuku;
    private String pengarang;
    private String nomorISBN;
    private boolean statusKetersediaan;

    public Buku(String judulBuku, String pengarang, String nomorISBN) {
        this.judulBuku = judulBuku;
        this.pengarang = pengarang;
        this.nomorISBN = nomorISBN;
        this.statusKetersediaan = true;
    }

    public void tambahKeKoleksi() {
        System.out.println("Buku " + judulBuku + " ditambahkan ke koleksi.");
        System.out.println("-----------------------------");
    }

    public boolean cekKetersediaan() {
        return statusKetersediaan;
    }

    public void setKetersediaan(boolean ketersediaan) {
        this.statusKetersediaan = ketersediaan;
    }

    public String getJudulBuku() {
        return judulBuku;
    }
}
