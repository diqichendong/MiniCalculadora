package com.example.minicalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtNumero1;
    private EditText txtNumero2;
    private TextView lblResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNumero1 = findViewById(R.id.txtNumero1);
        txtNumero2 = findViewById(R.id.txtNumero2);
        lblResultado = findViewById(R.id.lblResultado);
    }

    public void sumar(View v) {

        try {
            double n1 = Double.parseDouble(txtNumero1.getText().toString());
            double n2 = Double.parseDouble(txtNumero2.getText().toString());
            lblResultado.setText("" + (n1 + n2));
        } catch (Exception e) {
            Toast.makeText(this, "Datos vacío o incorrectos", Toast.LENGTH_SHORT).show();
        }

    }

    public void restar(View v) {

        try {
            double n1 = Double.parseDouble(txtNumero1.getText().toString());
            double n2 = Double.parseDouble(txtNumero2.getText().toString());
            lblResultado.setText("" + (n1 - n2));
        } catch (Exception e) {
            Toast.makeText(this, "Datos vacío o incorrectos", Toast.LENGTH_SHORT).show();
        }

    }

    public void multiplicar(View v) {

        try {
            double n1 = Double.parseDouble(txtNumero1.getText().toString());
            double n2 = Double.parseDouble(txtNumero2.getText().toString());
            lblResultado.setText("" + (n1 * n2));
        } catch (Exception e) {
            Toast.makeText(this, "Datos vacío o incorrectos", Toast.LENGTH_SHORT).show();
        }

    }

    public void dividir(View v) {

        try {
            double n1 = Double.parseDouble(txtNumero1.getText().toString());
            double n2 = Double.parseDouble(txtNumero2.getText().toString());
            lblResultado.setText("" + (n1 / n2));
        } catch (Exception e) {
            Toast.makeText(this, "Datos vacío o incorrectos", Toast.LENGTH_SHORT).show();
        }

    }

    public void borrar(View v) {
        txtNumero1.setText("");
        txtNumero2.setText("");
        lblResultado.setText("");
        Toast.makeText(this, "Datos borrados.", Toast.LENGTH_SHORT).show();
    }
}