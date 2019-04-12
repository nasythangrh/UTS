package com.nasythanugroho.reviewwisatangalam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailWisata extends AppCompatActivity {

    public static String KEY_ITEM = "item";
    private ImageView ivPhoto;
    private TextView tvLokasi;
    private TextView tvFasilitas;
    private TextView tvAkseskendaraan;
    private TextView tvJamweekdays;
    private TextView tvJamweekend;
    private TextView tvHargaweekdays;
    private TextView tvHargaweekend;
    private TextView tvHargamobil;
    private TextView tvHargamotor;
    private WisataModel item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_waterfall);
        getSupportActionBar().setTitle("Detail Wisata ");

        ivPhoto = (ImageView)findViewById(R.id.iv_detail_photo);
        tvLokasi = (TextView)findViewById(R.id.tv_detail_lokasi);
        tvFasilitas = (TextView)findViewById(R.id.tv_detail_fasilitas);
        tvAkseskendaraan = (TextView)findViewById(R.id.tv_detail_akseskendaraan);
        tvJamweekdays = (TextView)findViewById(R.id.tv_detail_jamweekdays);
        tvJamweekend = (TextView)findViewById(R.id.tv_detail_jamweekend);
        tvHargaweekdays = (TextView)findViewById(R.id.tv_detail_hargaweekdays);
        tvHargaweekend  = (TextView)findViewById(R.id.tv_detail_hargaweekend);
        tvHargamobil = (TextView)findViewById(R.id.tv_detail_hargamobil);
        tvHargamotor = (TextView)findViewById(R.id.tv_detail_hargamotor);

        item = (WisataModel)getIntent().getSerializableExtra(KEY_ITEM);

        ivPhoto.setImageResource(item.getPhoto());
        tvLokasi.setText(item.getLokasi());
        tvFasilitas.setText(item.getFasilitas());
        tvAkseskendaraan.setText(item.getAkseskendaraan());
        tvJamweekdays.setText(item.getJamweekdays());
        tvJamweekend.setText(item.getJamweekend());
        tvHargaweekdays.setText(item.getHargaweekdays());
        tvHargaweekend.setText(item.getHargaweekend());
        tvHargamobil.setText(item.getHargamobil());
        tvHargamotor.setText(item.getHargamotor());
    }
}
