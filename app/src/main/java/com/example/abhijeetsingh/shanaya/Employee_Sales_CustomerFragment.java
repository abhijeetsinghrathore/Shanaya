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


public class Employee_Sales_CustomerFragment extends Fragment {
    FloatingActionButton fab;
    ListView listviewcustomers;
    ArrayAdapter<String> dataadapter;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v;
        v=inflater.inflate(R.layout.fragment_employee__sales__customer, container, false);
        fab=(FloatingActionButton)v.findViewById(R.id.addnewcustomer);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getContext(),Employee_Sales_EnterNewCustomer.class);
                startActivity(i);

            }
        });


        final ArrayList<String> listofcustomers=new ArrayList<String>();
        int i;
        for( i=0;i<10;i++)
        listofcustomers.add(+i+" customer");

        dataadapter=new ArrayAdapter<String>(v.getContext(), android.R.layout.simple_list_item_1,listofcustomers);
        listviewcustomers=(ListView)v.findViewById(R.id.listOfCustomersID);
        listviewcustomers.setAdapter(dataadapter);




// Inflate the layout for this fragment

        return  v;
    }
}
