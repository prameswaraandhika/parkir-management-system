package storage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import model.Slot;

/**
 *
 * @author Andhika Prameswara <prameswaara@gmail.com>
 */
public class tabel_slot {

    private List<Slot> tabelSlot;

    public tabel_slot() {
        tabelSlot = new ArrayList<>(List.of(
                new Slot(1, "Motor", 3),
                new Slot(2, "Mobil", 5),
                new Slot(3, "VIP", 2)
        ));
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

}
