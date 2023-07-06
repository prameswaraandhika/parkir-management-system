package controller;

import java.text.ParseException;
import java.util.Date;
import juruaplikasi.ParkirSistem;
import model.Parkir;
import storage.ParkirMaster;

/**
 *
 * @author Andhika Prameswara <prameswaara@gmail.com>
 */
public class ParkirController {

    private ParkirMaster parkingMaster;
    private ParkirSistem view;
    private Parkir parkir;
    String kode = null;

    public ParkirController(ParkirSistem view) {
        parkingMaster = new ParkirMaster();
        this.view = view;
    }

    public String generateKodeParkir(String kendaraan) {
        System.out.println("kendaraan: " + kendaraan);

        switch (kendaraan) {
            case "MOTOR" -> {
                int slotMotor = parkingMaster.findTotalSlotByJenisKendaraan(kendaraan);
                if (slotMotor >= 1) {
                    kode = "MTR" + slotMotor;
                    updatingSlotMotor(slotMotor);
                    if (slotMotor == 1) {
                        view.getButtonTambah().setEnabled(false);
                    }
                }

            }
            case "MOBIL" -> {
                int slotMobil = parkingMaster.findTotalSlotByJenisKendaraan(kendaraan);
                if (slotMobil >= 1) {
                    kode = "MBL" + slotMobil;
                    updatingSlotMobil(slotMobil);
                    if (slotMobil == 1) {
                        view.getButtonTambah().setEnabled(false);
                    }
                }
            }
            case "VIP" -> {
                int slotVIP = parkingMaster.findTotalSlotByJenisKendaraan(kendaraan);
                if (slotVIP >= 1) {
                    kode = "VIP" + slotVIP;
                    updatingSlotVIP(slotVIP);
                    if (slotVIP == 1) {
                        view.getButtonTambah().setEnabled(false);
                    }
                }

            }
            default -> {
                System.out.println("not found");
            }
        }
        return kode;
    }

    public void isFull(String kendaraan) {
        System.out.println(kendaraan);
        int total = parkingMaster.findTotalSlotByJenisKendaraan(kendaraan);
        System.out.println(total);
        if (total == 0) {
            view.getButtonTambah().setEnabled(false);
        } else {
            view.getButtonTambah().setEnabled(true);
        }
    }

    public void saveParkirMasuk(String jenisKendaraan, String platNomer, Date waktuMasuk) {
        generateKodeParkir(jenisKendaraan);
        view.getModelParkirMasuk().addRow(new Object[]{kode, jenisKendaraan, platNomer, waktuMasuk});
//        insert data to storage 
        parkingMaster.getTabelParkir().add(new Parkir(jenisKendaraan, platNomer, kode, waktuMasuk));

    }

    public void saveParkirKeluar(String kode, Date waktuKeluar) throws ParseException {
        parkir = parkingMaster.UpdateWaktuKeluarByKodeParkir(kode, waktuKeluar);
        System.out.println("PARKIR KELUAR");
        if (parkir != null) {
            view.getModelParkirKeluar().addRow(new Object[]{kode,
                parkir.getWaktuMasuk(),
                parkir.getWaktuKeluar(),
                parkir.getBiayaParkir()});

        }
        System.out.println(parkir);
    }

    private void updatingSlotMotor(int slotMotor) {
        parkingMaster.getTabelSlot().get(0).setTotalSlot(slotMotor - 1);

    }

    private void updatingSlotMobil(int slotMobil) {
        parkingMaster.getTabelSlot().get(1).setTotalSlot(slotMobil - 1);
    }

    private void updatingSlotVIP(int slotVIP) {
        parkingMaster.getTabelSlot().get(2).setTotalSlot(slotVIP - 1);
    }

}
