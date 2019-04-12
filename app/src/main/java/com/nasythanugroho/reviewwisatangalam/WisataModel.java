package com.nasythanugroho.reviewwisatangalam;

import java.io.Serializable;

public class WisataModel implements Serializable {

    private int fasilitas;
    private int lokasi;
    private int akseskendaraan;
    private int jamweekdays;
    private int jamweekend;
    private int hargaweekdays;
    private int hargaweekend;
    private int hargamobil;
    private int hargamotor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    private String name, price;

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public int getPhoto() {
        return photo;
    }

    private int photo;

    public int getFasilitas() {
        return fasilitas;
    }

    public void setFasilitas(int fasilitas) {
        this.fasilitas = fasilitas;
    }

    public int getLokasi() {
        return lokasi;
    }

    public void setLokasi(int lokasi) {
        this.lokasi = lokasi;
    }

    public int getAkseskendaraan() {
        return akseskendaraan;
    }

    public void setAkseskendaraan(int akseskendaraan) {
        this.akseskendaraan = akseskendaraan;
    }

    public int getJamweekdays() {
        return jamweekdays;
    }

    public void setJamweekdays(int jamweekdays) {
        this.jamweekdays = jamweekdays;
    }

    public int getJamweekend() {
        return jamweekend;
    }

    public void setJamweekend(int jamweekend) {
        this.jamweekend = jamweekend;
    }

    public int getHargaweekdays() {
        return hargaweekdays;
    }

    public void setHargaweekdays(int hargaweekdays) {
        this.hargaweekdays = hargaweekdays;
    }

    public int getHargaweekend() {
        return hargaweekend;
    }

    public void setHargaweekend(int hargaweekend) {
        this.hargaweekend = hargaweekend;
    }

    public int getHargamobil() {
        return hargamobil;
    }

    public void setHargamobil(int hargamobil) {
        this.hargamobil = hargamobil;
    }

    public int getHargamotor() {
        return hargamotor;
    }

    public void setHargamotor(int hargamotor) {
        this.hargamotor = hargamotor;
    }
}
