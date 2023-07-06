package model;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Andhika Prameswara <prameswaara@gmail.com>
 */
public class Parkir {

    private String jenisKendaraan;
    private String platNomor;
    private String kodeParkir;
    private Date waktuMasuk;
    private Date waktuKeluar;

    public Parkir(String jenisKendaraan, String platNomor, String kodeParkir, Date waktuMasuk) {
        this.jenisKendaraan = jenisKendaraan;
        this.platNomor = platNomor;
        this.kodeParkir = kodeParkir;
        this.waktuMasuk = waktuMasuk;
    }

    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    public void setJenisKendaraan(String jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
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

    public Date getWaktuMasuk() {
        return waktuMasuk;
    }

    public void setWaktuMasuk(Date waktuMasuk) {
        this.waktuMasuk = waktuMasuk;
    }

    public Date getWaktuKeluar() {
        return waktuKeluar;
    }

    public void setWaktuKeluar(Date waktuKeluar) {
        this.waktuKeluar = waktuKeluar;
    }

    public double getBiayaParkir() throws ParseException {
        double tarifBiaya = getTarifBiaya(jenisKendaraan);
        double biayaParkir = (waktuKeluar.getTime() - waktuMasuk.getTime()) / (100 * 60) * tarifBiaya;
        return biayaParkir;
    }

    private double getTarifBiaya(String jenisKendaraan) {
        switch (jenisKendaraan) {
            case "MOTOR" -> {
                return 100;
            }
            case "MOBIL" -> {
                return 200;
            }
            case "VIP" -> {
                return 300;
            }
            default ->
                throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Parkir{" + "jenisKendaraan=" + jenisKendaraan + ", platNomor=" + platNomor + ", kodeParkir=" + kodeParkir + ", waktuMasuk=" + waktuMasuk + ", waktuKeluar=" + waktuKeluar + '}';
    }

}
