package model;

/**
 *
 * @author Andhika Prameswara <prameswaara@gmail.com>
 */
public class Slot {

    private String jenisKendaraan;
    private int totalSlot;

    public Slot(String jenisKendaraan, int totalSlot) {
        this.jenisKendaraan = jenisKendaraan;
        this.totalSlot = totalSlot;
    }

    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    public void setJenisKendaraan(String jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }

    public int getTotalSlot() {
        return totalSlot;
    }

    public void setTotalSlot(int totalSlot) {
        this.totalSlot = totalSlot;
    }

}
