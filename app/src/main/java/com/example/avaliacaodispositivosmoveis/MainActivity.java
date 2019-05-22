package com.example.avaliacaodispositivosmoveis;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "MA";

    private ArrayAdapter<String> pacienteArrayAdapter;
    private ListView listView;
    private ArrayList<String> paciente = new ArrayList<>();
    private Cursor cursor;
    private Runnable run;
    private Button button;

    @SuppressLint("ConstanteERRO")
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        run = new Runnable() {
            public void run() {

                pacienteArrayAdapter.notifyDataSetChanged();
                listView.invalidateViews();
                listView.refreshDrawableState();
            }
        };
            button = findViewById(R.id.buttonPaciente);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent pIntent = new Intent(MainActivity.this, NovoPaciente.class);
                    startActivityForResult(pIntent, 0);
                }
            });

        listView = findViewById(R.id.tabelaPaciente);

        pacienteArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, paciente);
        listView.setAdapter(pacienteArrayAdapter);

    }
}