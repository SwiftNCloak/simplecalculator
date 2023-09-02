package com.mj_bonifacio.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Fnum, Snum;
    Button BtnAdd, BtnSub, BtnMul, BtnDiv;
    TextView DispAns;
    int n1, n2, ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Input fields
        Fnum = (EditText) findViewById(R.id.txtFnum);
        Snum = (EditText) findViewById(R.id.txtSnum);

        // Operator Buttons
        BtnAdd = (Button) findViewById(R.id.btnAdd);
        BtnSub = (Button) findViewById(R.id.btnSub);
        BtnMul = (Button) findViewById(R.id.btnMul);
        BtnDiv = (Button) findViewById(R.id.btnDiv);

        // Display Answer
        DispAns = (TextView) findViewById(R.id.tvResult);

        // [1] ADDITION
        BtnAdd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Addition", Toast.LENGTH_SHORT).show();

                if (Fnum.getText().toString().equals("")){
                    Fnum.setError("Empty field!");
                    Fnum.requestFocus();
                    return;
                }

                if (Snum.getText().toString().equals("")){
                    Snum.setError("Empty field!");
                    Snum.requestFocus();
                    return;
                }

                n1 = Integer.valueOf(Fnum.getText().toString());
                n2 = Integer.valueOf(Snum.getText().toString());
                ans = n1 + n2;

                DispAns.setText(String.valueOf(ans));
            }
        });

        // [2] SUBTRACTION
        BtnSub.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Subtraction", Toast.LENGTH_SHORT).show();

                if (Fnum.getText().toString().equals("")){
                    Fnum.setError("Empty field!");
                    Fnum.requestFocus();
                    return;
                }

                if (Snum.getText().toString().equals("")){
                    Snum.setError("Empty field!");
                    Snum.requestFocus();
                    return;
                }

                n1 = Integer.valueOf(Fnum.getText().toString());
                n2 = Integer.valueOf(Snum.getText().toString());
                ans = n1 - n2;

                DispAns.setText(String.valueOf(ans));
            }
        });

        // [3] MULTIPLICATION
        BtnMul.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Multiplication", Toast.LENGTH_SHORT).show();

                if (Fnum.getText().toString().equals("")){
                    Fnum.setError("Empty field!");
                    Fnum.requestFocus();
                    return;
                }

                if (Snum.getText().toString().equals("")){
                    Snum.setError("Empty field!");
                    Snum.requestFocus();
                    return;
                }

                n1 = Integer.valueOf(Fnum.getText().toString());
                n2 = Integer.valueOf(Snum.getText().toString());
                ans = n1 * n2;

                DispAns.setText(String.valueOf(ans));
            }
        });

        // [4] DIVISION
        BtnDiv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Division", Toast.LENGTH_SHORT).show();

                if (Fnum.getText().toString().equals("")){
                    Fnum.setError("Empty field!");
                    Fnum.requestFocus();
                    return;
                }

                if (Snum.getText().toString().equals("")){
                    Snum.setError("Empty field!");
                    Snum.requestFocus();
                    return;
                }

                n1 = Integer.valueOf(Fnum.getText().toString());
                n2 = Integer.valueOf(Snum.getText().toString());
                ans = n1 / n2;

                DispAns.setText(String.valueOf(ans));
            }
        });
    }
}