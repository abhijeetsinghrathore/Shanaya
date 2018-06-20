package com.example.abhijeetsingh.shanaya;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class Employee_Sales_OppurtunitiesFragment extends Fragment {

    FloatingActionButton fab;
    ListView listViewOpportunities;
    ArrayAdapter<String> dataadapter;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v;
        v=inflater.inflate(R.layout.fragment_employee__sales__oppurtunities, container, false);
        fab=(FloatingActionButton)v.findViewById(R.id.addnewoppurnity);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getContext(),EnterNewOpportunity.class);
                startActivity(i);

            }
        });


        final ArrayList<String> oppurtunities=new ArrayList<String>();
        oppurtunities.add("First opportunity");
        oppurtunities.add("Second opportunity");
        oppurtunities.add("Third opportunity");
        oppurtunities.add("Fourth opportunity");
        oppurtunities.add("Fifth opportunity");
        oppurtunities.add("Sixth opportunity");


        dataadapter=new ArrayAdapter<String>(v.getContext(), android.R.layout.simple_list_item_1,oppurtunities);
        listViewOpportunities=(ListView)v.findViewById(R.id.listOfOppurnutiesID);
        listViewOpportunities.setAdapter(dataadapter);




// Inflate the layout for this fragment

        return  v;
    }
}
