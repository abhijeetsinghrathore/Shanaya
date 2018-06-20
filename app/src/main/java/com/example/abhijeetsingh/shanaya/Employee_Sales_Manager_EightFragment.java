package com.example.abhijeetsingh.shanaya;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Employee_Sales_Manager_EightFragment extends Fragment {

    Button btnShowLocation;
    private static final int REQUEST_CODE_PERMISSION = 2;
    String mPermission = Manifest.permission.ACCESS_FINE_LOCATION;
    double latitude;
    double longitude;
    private EditText mLat;
    private EditText mLong;
    String latStr,longStr;
    String intentString;



    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View v;
        v =inflater.inflate(R.layout.fragment_employee__sales__manager__eight, container, false);
        btnShowLocation=(Button)v.findViewById(R.id.findlocationbutton);
        mLat=(EditText)v.findViewById(R.id.enteredlatitude);
        mLong=(EditText)v.findViewById(R.id.enteredlongitude);

        btnShowLocation.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                latStr=mLat.getText().toString();
                longStr=mLong.getText().toString();
                intentString=latStr+"/"+longStr;
                Toast.makeText(v.getContext(), "Employee Location is - \nLat: "
                        + latStr + "\nLong: " + longStr, Toast.LENGTH_LONG).show();
                Intent i =new Intent(v.getContext(),MapsActivity.class);
                i.putExtra("intentString",intentString);
                startActivity(i);
            }
        });
        return v;


    }

}
