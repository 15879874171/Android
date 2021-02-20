package com.example.raspberry.ui.controlpanel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.raspberry.R;
import com.example.raspberry.ui.role.Role;

public class ControlPanel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control);

        LinearLayout layout = findViewById(R.id.layout2);
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(ControlPanel.this, Role.class);
                startActivity(in);
            }
        });
    }
}