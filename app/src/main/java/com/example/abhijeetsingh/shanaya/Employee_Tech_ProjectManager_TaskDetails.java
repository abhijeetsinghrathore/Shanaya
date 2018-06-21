package com.example.abhijeetsingh.shanaya;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

public class Employee_Tech_ProjectManager_TaskDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee__tech__project_manager__task_details);

        LinearLayout mSeekLin = (LinearLayout) findViewById(R.id.customseekbarprojectmanagerID);
        CustomSeekBarProjectManager customSeekBar = new CustomSeekBarProjectManager(this, 7, Color.DKGRAY);
        customSeekBar.addSeekBar(mSeekLin);

    }
}
