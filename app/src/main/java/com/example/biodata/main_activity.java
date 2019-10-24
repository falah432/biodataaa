package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class main_activity extends AppCompatActivity {
    EditText nim, nm, kls, tgl;
    Button simpan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity);
        nim = (EditText)findViewById(R.id.etnim);
        nm = (EditText)findViewById(R.id.etnm);
        kls = (EditText)findViewById(R.id.etkls);
        tgl = (EditText)findViewById(R.id.ettgl);
        simpan = (Button)findViewById(R.id.btsimpan);

        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = String.valueOf(nim.getText());
                String b = String.valueOf(nm.getText());
                String c = String.valueOf(kls.getText());
                String d = String.valueOf(tgl.getText());

                bio source = new bio();
                source.setNim(a);
                source.setNama(b);
                source.setKelas(c);
                source.setTgl(d);
                Intent movedata = new Intent(main_activity.this, biodata_activity.class);
                movedata.putExtra(biodata_activity.getBio, source);
                startActivity(movedata);
            }
        });
    }
}
