package model;

import java.time.LocalDateTime;

/**
 *
 * @author Andhika Prameswara <prameswaara@gmail.com>
 */
public class Parkir {

    private String jenisKendaraan;
    private int slotParkir;
    private String platNomor;
    private String kodeParkir;
    private LocalDateTime waktuMasuk;
    private LocalDateTime waktuKeluar;

    public Parkir(String jenisKendaraan, int slotParkir, String platNomor, String kodeParkir, LocalDateTime waktuMasuk, LocalDateTime waktuKeluar) {
        this.jenisKendaraan = jenisKendaraan;
        this.slotParkir = slotParkir;
        this.platNomor = platNomor;
        this.kodeParkir = kodeParkir;
        this.waktuMasuk = waktuMasuk;
        this.waktuKeluar = waktuKeluar;
    }

    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    public void setJenisKendaraan(String jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }

    public int getSlotParkir() {
        return slotParkir;
    }

    public void setSlotParkir(int slotParkir) {
        this.slotParkir = slotParkir;
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public String getKodeParkir() {
        return kodeParkir;
    }

    public void setKodeParkir(String kodeParkir) {
        this.kodeParkir = kodeParkir;
    }

    public LocalDateTime getWaktuMasuk() {
        return waktuMasuk;
    }

    public void setWaktuMasuk(LocalDateTime waktuMasuk) {
        this.waktuMasuk = waktuMasuk;
    }

    public LocalDateTime getWaktuKeluar() {
        return waktuKeluar;
    }

    public void setWaktuKeluar(LocalDateTime waktuKeluar) {
        this.waktuKeluar = waktuKeluar;
    }

}
