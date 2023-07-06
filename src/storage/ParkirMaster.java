package storage;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Parkir;
import model.Slot;

/**
 *
 * @author Andhika Prameswara <prameswaara@gmail.com>
 */
public class ParkirMaster {

    private List<Parkir> tabelParkir;
    private List<Slot> tabelSlot;

    public ParkirMaster() {
        this.tabelParkir = new ArrayList<>();
        this.tabelSlot = new ArrayList<>(List.of(
                new Slot("MOTOR", 3),
                new Slot("MOBIL", 5),
                new Slot("VIP", 2)
        ));
    }

    public List<Parkir> getTabelParkir() {
        return tabelParkir;
    }

    public void setTabelParkir(List<Parkir> tabelParkir) {
        this.tabelParkir = tabelParkir;
    }

    public List<Slot> getTabelSlot() {
        return tabelSlot;
    }

    public void setTabelSlot(List<Slot> tabelSlot) {
        this.tabelSlot = tabelSlot;
    }

    public int findTotalSlotByJenisKendaraan(String keyword) {
        Slot motorSlot = null;
        for (Slot slot : tabelSlot) {
            if (slot.getJenisKendaraan().equals(keyword)) {
                motorSlot = slot;
                break;
            }
        }
        if (motorSlot != null) {
            return motorSlot.getTotalSlot();
        }
        return 0;
    }

    public Parkir UpdateWaktuKeluarByKodeParkir(String kode, Date waktuKeluar) {
        for (Parkir parkir : tabelParkir) {
            System.out.println(kode);
            System.out.println(parkir);
            if (parkir.getKodeParkir().equalsIgnoreCase(kode)) {
                parkir.setWaktuKeluar(waktuKeluar);
                return parkir;
            }
        }
        return null;
    }

}
