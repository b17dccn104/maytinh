package com.example.batsk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private EditText ex1 , ex2;
private Button btAdd;
private Spinner spOp;
private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double n1 = Double.parseDouble(ex1.getText().toString());
                    double n2 = Double.parseDouble(ex2.getText().toString());
                    result.setText("Tong = "+(n1+n2));
                }catch (NumberFormatException e){
                    System.out.println(e);
                }
            }
        });
    }

    private void initView() {
        ex1 = findViewById(R.id.n1);
        ex2 = findViewById(R.id.n2);
        btAdd = findViewById(R.id.button2);
        spOp = findViewById(R.id.spinner);
        result = findViewById(R.id.textView2);
        String [] st = getResources().getStringArray(R.array.op);
        ArrayAdapter<String > adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,st);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spOp.setAdapter(adapter);

    }
}