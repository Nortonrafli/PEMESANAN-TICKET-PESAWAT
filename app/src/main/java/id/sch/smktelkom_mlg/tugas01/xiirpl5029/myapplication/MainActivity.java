package id.sch.smktelkom_mlg.tugas01.xiirpl5029.myapplication;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNama, etAlamat;
    TextView tvHasil;
    RadioGroup rgKelamin, rgType;
    RadioButton rbLaki, rbPerempuan;
    RadioButton rbDewasa, rbAnak;
    CheckBox cb1, cb2, cb3;
    Spinner spAsal, spTujuan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editTextNama);
        etAlamat = (EditText) findViewById(R.id.editTextAlamat);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);
        rgKelamin = (RadioGroup) findViewById(R.id.RadioGroupKelamin);
        rgType = (RadioGroup) findViewById(R.id.RadioGroupType);
        rbLaki = (RadioButton) findViewById(R.id.rbLaki);
        rbPerempuan = (RadioButton) findViewById(R.id.rbPerempuan);
        rbDewasa = (RadioButton) findViewById(R.id.rbDewasa);
        rbAnak = (RadioButton) findViewById(R.id.rbAnak);
        cb1 = (CheckBox) findViewById(R.id.checkBox1);
        cb2 = (CheckBox) findViewById(R.id.checkBox2);
        cb3 = (CheckBox) findViewById(R.id.checkBox3);
        spAsal = (Spinner) findViewById(R.id.spinnerAsl);
        spTujuan = (Spinner) findViewById(R.id.spinnerTjn);


        findViewById(R.id.buttonOk).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doclcik();

            }


        });
    }


    private void doclcik() {
        if (isValid()) {

            String nama = etNama.getText().toString();
            String alamat = etAlamat.getText().toString();
            String jk = null;
            String jb = null;
            String jt = " ";
            int startlen = jt.length();

            if (rbLaki.isChecked()) {
                jk = rbLaki.getText().toString();
            } else if (rbPerempuan.isChecked()) {
                jk = rbPerempuan.getText().toString();
            } else {


            }


            if (rbDewasa.isChecked()) {
                jb = rbDewasa.getText().toString();
            } else if (rbAnak.isChecked()) {
                jb = rbAnak.getText().toString();
            }
            if (cb1.isChecked()) jt = cb1.getText() + " ";
            if (cb2.isChecked()) jt = cb2.getText() + " ";
            if (cb3.isChecked()) jt = cb3.getText() + " ";
            if (jt.length() == startlen) jt += "Tidak ada pilihan";


            if (jk == null) {
                AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                builder1.setMessage("Anda Belum mengisi Jenis Kelamin");
                builder1.setCancelable(true);

                builder1.setNeutralButton("OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.dismiss();
                            }
                        });
                AlertDialog alert1 = builder1.create();
                alert1.show();
            } else if (jb == null) {
                AlertDialog.Builder builder2 = new AlertDialog.Builder(MainActivity.this);
                builder2.setMessage("Anda Belum mengisi Type");
                builder2.setCancelable(true);

                builder2.setNeutralButton("OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.dismiss();
                            }
                        });
                AlertDialog alert2 = builder2.create();
                alert2.show();

            } else {

                tvHasil.setText(
                        "Nama :" + nama + "\n" +
                                "Alamat :" + alamat + "\n" +
                                "Jenis Kelamin : " + jk + "\n" +
                                "Type :" + jb + "\n" +
                                "Kelas :" + jt + "\n" +
                                "Asal :" + spAsal.getSelectedItem().toString() + "\n" +
                                "Tujuan :" + spTujuan.getSelectedItem().toString());

            }


        }
    }

    private boolean isValid() {
        boolean Valid = true;
        String Nama = etNama.getText().toString();
        String Alamat = etAlamat.getText().toString();

        if (Nama.isEmpty() || (Alamat.isEmpty())) {
            etNama.setError("Nama belum diisi");
            etAlamat.setError("Alamat belum diisi");
            Valid = false;
        } else {
            etNama.setError(null);
            etAlamat.setError(null);
        }
        return Valid;
    }
}
