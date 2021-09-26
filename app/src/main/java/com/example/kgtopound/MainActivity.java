package com.example.kgtopound;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private EditText input_kg;
    private TextView output_pound;
    private Button Submit_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Submit_button=findViewById(R.id.submitbutton);
        input_kg=findViewById(R.id.inputid);
        output_pound=findViewById(R.id.outputid);

        Submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Botton Worked", Toast.LENGTH_SHORT).show();
                int kg = Integer.parseInt(input_kg.getText().toString());

                double pound = kg * 2.205;
                output_pound.setText("The Answer is: " + pound);
            }
        });

    }
}