package com.example.abhijeetsingh.shanaya;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class Employee_Tech_TaskDetails extends AppCompatActivity {

    TextView analysis;
    TextView specification;
    TextView design;
    TextView development;
    TextView testing;
    TextView done;
    int oldColor;
    int analysisFlag=0,specificationFlag=0,designFlag=0,developmentFlag=0,testingFlag=0,doneFlag=0;
    Button editstage;
    Button savestage;
    CustomSeekBar customSeekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee__tech__task_details);

        LinearLayout mSeekLin = (LinearLayout) findViewById(R.id.customseekbarID);
        customSeekBar = new CustomSeekBar(this, 7, Color.DKGRAY);
        customSeekBar.addSeekBar(mSeekLin);


        analysis=(TextView)findViewById(R.id.analysisID);
        specification=(TextView)findViewById(R.id.specificationID);
        design=(TextView)findViewById(R.id.designID);
        development=(TextView)findViewById(R.id.developmentID);
        testing=(TextView)findViewById(R.id.testingID);
        done=(TextView)findViewById(R.id.doneID);
        editstage=(Button)findViewById(R.id.editstageID);
        savestage=(Button)findViewById(R.id.savestageID);

        oldColor=analysis.getCurrentTextColor();
        customSeekBar.mSeekBar.setEnabled(false);

        editstage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customSeekBar.mSeekBar.setEnabled(true);
            }
        });

        savestage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customSeekBar.mSeekBar.setEnabled(false);

            }
        });
        customSeekBar.mSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                switch (progress){
                    case 0:
                        analysisFlag=0;specificationFlag=0;designFlag=0;developmentFlag=0;testingFlag=0;doneFlag=0;
                        analysis.setTextColor(oldColor);
                        specification.setTextColor(oldColor);
                        design.setTextColor(oldColor);
                        development.setTextColor(oldColor);
                        testing.setTextColor(oldColor);
                        done.setTextColor(oldColor);
                        break;
                    case 1:
                        analysis.setTextColor(Color.parseColor("#8BC34A"));
                        analysisFlag=1;
                        specificationFlag=0;designFlag=0;developmentFlag=0;testingFlag=0;doneFlag=0;
                        specification.setTextColor(oldColor);
                        design.setTextColor(oldColor);
                        development.setTextColor(oldColor);
                        testing.setTextColor(oldColor);
                        done.setTextColor(oldColor);
                        break;
                    case 2:
                        analysis.setTextColor(Color.parseColor("#8BC34A"));
                        analysisFlag=1;
                        specification.setTextColor(Color.parseColor("#8BC34A"));
                        specificationFlag=1;
                        designFlag=0;developmentFlag=0;testingFlag=0;doneFlag=0;
                        design.setTextColor(oldColor);
                        development.setTextColor(oldColor);
                        testing.setTextColor(oldColor);
                        done.setTextColor(oldColor);
                        break;
                    case 3:
                        analysis.setTextColor(Color.parseColor("#8BC34A"));
                        analysisFlag=1;
                        specification.setTextColor(Color.parseColor("#8BC34A"));
                        specificationFlag=1;
                        design.setTextColor(Color.parseColor("#8BC34A"));
                        designFlag=1;
                        developmentFlag=0;testingFlag=0;doneFlag=0;
                        development.setTextColor(oldColor);
                        testing.setTextColor(oldColor);
                        done.setTextColor(oldColor);
                        break;
                    case 4:
                        analysis.setTextColor(Color.parseColor("#8BC34A"));
                        analysisFlag=1;
                        specification.setTextColor(Color.parseColor("#8BC34A"));
                        specificationFlag=1;
                        design.setTextColor(Color.parseColor("#8BC34A"));
                        designFlag=1;
                        development.setTextColor(Color.parseColor("#8BC34A"));
                        developmentFlag=1;
                        testingFlag=0;doneFlag=0;
                        testing.setTextColor(oldColor);
                        done.setTextColor(oldColor);
                        break;
                    case 5:
                        analysis.setTextColor(Color.parseColor("#8BC34A"));
                        analysisFlag=1;
                        specification.setTextColor(Color.parseColor("#8BC34A"));
                        specificationFlag=1;
                        design.setTextColor(Color.parseColor("#8BC34A"));
                        designFlag=1;
                        development.setTextColor(Color.parseColor("#8BC34A"));
                        developmentFlag=1;
                        testing.setTextColor(Color.parseColor("#8BC34A"));
                        testingFlag=1;
                        doneFlag=0;
                        done.setTextColor(oldColor);
                        break;
                    case 6:
                        analysis.setTextColor(Color.parseColor("#8BC34A"));
                        analysisFlag=1;
                        specification.setTextColor(Color.parseColor("#8BC34A"));
                        specificationFlag=1;
                        design.setTextColor(Color.parseColor("#8BC34A"));
                        designFlag=1;
                        development.setTextColor(Color.parseColor("#8BC34A"));
                        developmentFlag=1;
                        testing.setTextColor(Color.parseColor("#8BC34A"));
                        testingFlag=1;
                        done.setTextColor(Color.parseColor("#8BC34A"));
                        doneFlag=1;
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }


}