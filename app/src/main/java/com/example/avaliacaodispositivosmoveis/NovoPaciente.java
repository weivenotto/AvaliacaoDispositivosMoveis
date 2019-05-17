package com.example.avaliacaodispositivosmoveis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NovoPaciente extends AppCompatActivity {


    @Override
    protected void onUserLeaveHint() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo_paciente);
    }
}
