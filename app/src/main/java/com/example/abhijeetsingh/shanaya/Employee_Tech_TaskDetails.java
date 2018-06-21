package com.example.abhijeetsingh.shanaya;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

public class Employee_Tech_TaskDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee__tech__task_details);

        LinearLayout mSeekLin = (LinearLayout) findViewById(R.id.seekbarLinearLayout);
        CustomSeekBar customSeekBar = new CustomSeekBar(this, 7, R.color.darkgrey);
        customSeekBar.addSeekBar(mSeekLin);
    }
}
