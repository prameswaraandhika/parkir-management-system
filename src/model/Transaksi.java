package model;

import java.math.BigInteger;
import java.time.LocalDateTime;

/**
 *
 * @author Andhika Prameswara <prameswaara@gmail.com>
 */
public class Transaksi {

    private String jenisKendaraan;
    private byte slotParkir;
    private String platNomor;
    private String kodeParkir;
    private LocalDateTime waktuMasuk;
    private LocalDateTime waktuKeluar;
    private long durasi;
    private BigInteger tarif;

    public Transaksi(String jenisKendaraan, byte slotParkir, String platNomor, String kodeParkir, LocalDateTime waktuMasuk, LocalDateTime waktuKeluar, long durasi, BigInteger tarif) {
        this.jenisKendaraan = jenisKendaraan;
        this.slotParkir = slotParkir;
        this.platNomor = platNomor;
        this.kodeParkir = kodeParkir;
        this.waktuMasuk = waktuMasuk;
        this.waktuKeluar = waktuKeluar;
        this.durasi = durasi;
        this.tarif = tarif;
    }

    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    public void setJenisKendaraan(String jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }

    public byte getSlotParkir() {
        return slotParkir;
    }

    public void setSlotParkir(byte slotParkir) {
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

    public long getDurasi() {
        return durasi;
    }

    public void setDurasi(long durasi) {
        this.durasi = durasi;
    }

    public BigInteger getTarif() {
        return tarif;
    }

    public void setTarif(BigInteger tarif) {
        this.tarif = tarif;
    }

}
