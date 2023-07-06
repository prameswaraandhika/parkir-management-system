package model;

/**
 *
 * @author Andhika Prameswara <prameswaara@gmail.com>
 */
public class Slot {

    private long id;
    private String jenisKendaraan;
    private int totalSlot;

    public Slot(long id, String jenisKendaraan, int totalSlot) {
        this.id = id;
        this.jenisKendaraan = jenisKendaraan;
        this.totalSlot = totalSlot;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
