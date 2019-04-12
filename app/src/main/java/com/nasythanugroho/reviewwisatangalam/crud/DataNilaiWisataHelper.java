package com.nasythanugroho.reviewwisatangalam.crud;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


public class DataNilaiWisataHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "review.db";
    private static final int DATABASE_VERTSION = 1;
    public DataNilaiWisataHelper(Context context){
        super(context, DATABASE_NAME,null,DATABASE_VERTSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db){
        String sql = "create table wisata(no integer primary key, namatempat text null, tgl text null, nilai text null, alamat text null);";
        Log.d("Data","onCreate: "+sql);
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2){

    }

}
