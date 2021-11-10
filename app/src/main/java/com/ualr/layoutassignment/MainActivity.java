package com.ualr.layoutassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO 02. Create a new method called "calculateTotal" for calculating the invoice's total amount of money

    // TODO 03. Bind the "calculateTotal" method to the button with the "CALCULATE TOTAL" label

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void calculateTotal(View view){
        int total = 0;

        CheckBox checkBox0 = findViewById(R.id.checkBox0);
        CheckBox checkBox1 = findViewById(R.id.checkBox1);
        CheckBox checkBox2 = findViewById(R.id.checkBox2);
        CheckBox checkBox3 = findViewById(R.id.checkBox3);

        TextView textBox0 = findViewById(R.id.textBox0);
        TextView textBox1 = findViewById(R.id.textBox1);
        TextView textBox2 = findViewById(R.id.textBox2);
        TextView textBox3 = findViewById(R.id.textBox3);

        if(checkBox0.isChecked())
        {
            total += Integer.parseInt(textBox0.getText().toString());
        }
        if(checkBox1.isChecked())
        {
            total += Integer.parseInt(textBox1.getText().toString());
        }
        if(checkBox2.isChecked())
        {
            total += Integer.parseInt(textBox2.getText().toString());
        }
        if(checkBox3.isChecked())
        {
            total += Integer.parseInt(textBox3.getText().toString());
        }

        TextView textBox4 = findViewById(R.id.textView2);
        textBox4.setText(String.valueOf(total));

    }
}