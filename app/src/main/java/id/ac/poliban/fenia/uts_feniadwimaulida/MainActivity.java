package id.ac.poliban.fenia.uts_feniadwimaulida;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Button btClear, btSubmit;
    EditText etPendaftaran, etNama, etTelp, etAlamat;
    RadioGroup rbGoup;
    Spinner spAgama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btClear = findViewById(R.id.btClear);
        Button btSubmit = findViewById(R.id.btSubmit);
        final EditText etPendaftaran = findViewById(R.id.etPendaftaran);
        final EditText etNama = findViewById(R.id.etNama);
        final EditText etTelp = findViewById(R.id.etTelp);
        final EditText etAlamat = findViewById(R.id.etAlamat);
        RadioGroup rbGroup = findViewById(R.id.rbGroup);
        Spinner spAgama = findViewById(R.id.spAgama);

        btClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etPendaftaran.setText("");
                etNama.setText("");
                etTelp.setText("");
                etAlamat.setText("");
                etPendaftaran.requestFocus();
            }
        });

       btSubmit.setOnClickListener(v -> {
            new AlertDialog.Builder (this)
                    .setTitle("Info Registrasi")
                    .setMessage(etPendaftaran.getText())
                    .setPositiveButton("OK", null).show();
        });
    }
}
