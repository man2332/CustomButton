package com.example.johnl.custombuttonwithimagesdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button customBtn = findViewById(R.id.custom_button);
        Switch switchEnableBtn = findViewById(R.id.switch_enable_button);

        customBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"clicked!",Toast.LENGTH_SHORT).show();
            }
        });

        switchEnableBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    customBtn.setEnabled(true);
                }else{
                    customBtn.setEnabled(false);
                }
            }
        });

    }
}
