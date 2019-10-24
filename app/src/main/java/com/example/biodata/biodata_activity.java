package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class biodata_activity extends AppCompatActivity {
    public static String getBio = "getbiodata";
    TextView viewData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata_activity);
        viewData = (TextView)findViewById(R.id.tvView);
        bio source = getIntent().getParcelableExtra(getBio);
        String text = "NIM : "+source.getNim()+" Nama : "+source.getNama()+" Kelas : "+source.getKelas()+" Tanggal Lahir : "+source.getTgl();
        viewData.setText(text);
    }
}
