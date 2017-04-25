package com.example.asadaboomtham.teamapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class ProjectActivity extends AppCompatActivity {

    private LinearLayout lldefect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_defect);

        lldefect = (LinearLayout)findViewById(R.id.lldefect);
        lldefect.setOnClickListener(OnClickSubmitListener);
    }

    private View.OnClickListener OnClickSubmitListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent lldefect = new Intent(getApplicationContext(),DefectActivity.class);
            startActivity(lldefect);
        }
    };
}
