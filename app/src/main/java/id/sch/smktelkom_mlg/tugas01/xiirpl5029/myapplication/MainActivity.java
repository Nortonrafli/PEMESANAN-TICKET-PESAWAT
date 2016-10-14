package id.sch.smktelkom_mlg.tugas01.xiirpl5029.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNama, etAlamat;
    TextView tvHasil;
    RadioGroup rgKelamin, rgType;
    CheckBox cb1, cb2, cb3;
    Spinner spAsal, spTujuan;
    String cbHasil = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editTextNama);
        etAlamat = (EditText) findViewById(R.id.editTextAlamat);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);
        rgKelamin = (RadioGroup) findViewById(R.id.RadioGroupKelamin);
        rgType = (RadioGroup) findViewById(R.id.RadioGroupType);
        cb1 = (CheckBox) findViewById(R.id.checkBox1);
        cb2 = (CheckBox) findViewById(R.id.checkBox2);
        cb3 = (CheckBox) findViewById(R.id.checkBox3);
        spAsal = (Spinner) findViewById(R.id.spinnerAsl);
        spTujuan = (Spinner) findViewById(R.id.spinnerTjn);

    }
}
