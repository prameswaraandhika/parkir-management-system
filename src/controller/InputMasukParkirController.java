package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import juruaplikasi.InputMasukParkir;
import model.Parkir;
import storage.tabel_slot;

/**
 *
 * @author Andhika Prameswara <prameswaara@gmail.com>
 */
public class InputMasukParkirController {

    private tabel_slot tableSlot = new tabel_slot();
    private InputMasukParkir view;
    private Parkir model;
    String kode = null;

    public InputMasukParkirController(InputMasukParkir view) {
        this.view = view;
    }

    public String generateKodeParkir(String kendaraan) {
        System.out.println("kendaraan: " + kendaraan);

        switch (kendaraan) {
            case "MOTOR" -> {
//                nol sebagai index pertama yaitu motor
                int slotMotor = tableSlot.getTabelSlot().get(0).getTotalSlot();
                System.out.println("slotMotor saat ini " + slotMotor);
                if (slotMotor >= 1) {
                    kode = "MTR" + slotMotor;
                    tableSlot.getTabelSlot().get(0).setTotalSlot(slotMotor - 1);
                    if (slotMotor == 1) {
                        view.getButtonTambah().setEnabled(false);
                    }
                }

            }
//            case "MOBIL" -> {
//                if (slotMobil. > 0) {
//                    kode = "MBL" + (slotMobil - 1);
//                    slotMobil -= 1;
//                } else {
//                    System.out.println("seat full");
//                }
//            }
//            case "VIP" -> {
//                if (slotVIP > 0) {
//                    kode = "VIP" + (slotMobil - 1);
//                    slotVIP -= 1;
//                } else {
//                    System.out.println("seat full");
//                }
//            }

            default -> {
                System.out.println("not found");
            }
        }
        return kode;
    }

    public void save(String jenisKendaraan, String platNomer, String waktu) {
        generateKodeParkir(jenisKendaraan);
        view.getModel().addRow(new Object[]{kode, jenisKendaraan, platNomer, waktu});
    }
}
