package com.example.avaliacaodispositivosmoveis;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NovoPaciente extends AppCompatActivity {
    private final String TAG = "NP";

    private EditText editTextNome;
    private EditText editTextIdade;
    private EditText editTextLeucocitos;
    private EditText editTextGlicemia;
    private EditText editTextATS;
    private EditText editTextLHD;
    private Button buttonAddPaciente;

    private Cursor cursor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo_paciente);

        editTextNome = findViewById(R.id.Nome);
        editTextIdade = findViewById(R.id.Idade);
        editTextGlicemia = findViewById(R.id.Glicemia);
        editTextLeucocitos = findViewById(R.id.Leucocitos);
        editTextATS = findViewById(R.id.ATS);
        editTextLHD = findViewById(R.id.LHD);
        buttonAddPaciente = findViewById(R.id.buttonPaciente);



    }
}
