package com.nasythanugroho.reviewwisatangalam;

import java.util.ArrayList;


public class WisataData {

    public static String[][] data = new String[][] {
            {"Coban Talun", "Batu"},
            {"Eco Green Park", "Batu"},
            {"Jatim Park 2", "Batu"},
            {"Alun-Alun Batu", "Batu"},
            {"Museum Angkut", "Batu"},
    };

    public static int [][] detail = new int[][] {
            {R.drawable.cbntalun,R.string.content_lokasi_cbntalun,R.string.fasilitas_cbntalun ,R.string.content_akseskendaraan_cbntalun ,R.string.content_jamweekdays_cbntalun , R.string.content_jamweekend_cbntalun, R.string.content_hargaweekdays_cbntalun, R.string.content_hargaweekend_cbntalun, R.string.content_hargamobil_cbntalun, R.string.content_hargamotor_cbntalun },
            {R.drawable.eco, R.string.content_lokasi_eco,R.string.fasilitas_eco,R.string.content_akseskendaraan_eco,R.string.content_jamweekdays_eco ,R.string.content_jamweekend_eco,R.string.content_hargaweekdays_eco,R.string.content_hargaweekend_eco,R.string.content_hargamobil_eco, R.string.content_hargamotor_eco },
            {R.drawable.jpark2, R.string.content_lokasi_jpark2 , R.string.fasilitas_jpark2,R.string.content_akseskendaraan_jpark2, R.string.content_jamweekdays_jpark2,R.string.content_jamweekend_jpark2 , R.string.content_hargaweekdays_jpark2,R.string.content_hargaweekend_jpark2, R.string.content_hargamobil_jpark2, R.string.content_hargamotor_jpark2 },
            {R.drawable.alun,R.string.content_lokasi_alun , R.string.fasilitas_alun , R.string.content_akseskendaraan_alun, R.string.content_jamweekdays_alun, R.string.content_jamweekend_alun, R.string.content_hargaweekdays_alun,R.string.content_hargaweekend_alun, R.string.content_hargamobil_alun,R.string.content_hargamotor_alun },
            {R.drawable.angkut,R.string.content_lokasi_angkut ,R.string.fasilitas_angkut,R.string.content_akseskendaraan_angkut, R.string.content_jamweekdays_angkut, R.string.content_jamweekend_angkut,R.string.content_hargaweekdays_angkut, R.string.content_hargaweekend_angkut,R.string.content_hargamobil_angkut,R.string.content_hargamotor_angkut },
    };

    public static ArrayList<WisataModel> getListData(){
        WisataModel wisataModel = null;
        ArrayList<WisataModel> list = new ArrayList<>();

        for (int i = 0; i<data.length; i++){
            wisataModel = new WisataModel();

            wisataModel.setName(data[i][0]);
            wisataModel.setPrice(data[i][1]);
            wisataModel.setPhoto(detail[i][0]);
            wisataModel.setLokasi(detail[i][1]);
            wisataModel.setFasilitas(detail[i][2]);
            wisataModel.setAkseskendaraan(detail[i][3]);
            wisataModel.setJamweekdays(detail[i][4]);
            wisataModel.setJamweekend(detail[i][5]);
            wisataModel.setHargaweekdays(detail[i][6]);
            wisataModel.setHargaweekend(detail[i][7]);
            wisataModel.setHargamobil(detail[i][8]);
            wisataModel.setHargamotor(detail[i][9]);

            list.add(wisataModel);
        }
        return list;
    }
}
