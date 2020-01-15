package id.ac.poliban.aplikasimobile;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText etNama = findViewById(R.id.etNama);
        Button btTampilkan = findViewById(R.id.btTampilkan);

        btTampilkan.setOnClickListener(view ->{
            Toast.makeText(this, "Selamat Datang", Toast.LENGTH_SHORT).show();
        });
    }
}
