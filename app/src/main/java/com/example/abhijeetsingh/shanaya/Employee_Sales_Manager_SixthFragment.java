package com.example.abhijeetsingh.shanaya;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Employee_Sales_Manager_SixthFragment extends Fragment{

    public Employee_Sales_Manager_SixthFragment(){}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);
        final View rootView = inflater.inflate(R.layout.fragment_employee__sales__manager__sixth, container, false);

        final ArrayList<Subordinate> subordinates = new ArrayList<Subordinate>();
        subordinates.add(new Subordinate("Subordinate 1", "0001",R.drawable.person));
        subordinates.add(new Subordinate("Subordinate 2", "0002",R.drawable.person));
        subordinates.add(new Subordinate("Subordinate 3", "0003",R.drawable.person));
        subordinates.add(new Subordinate("Subordinate 4", "0004",R.drawable.person));

        SubordinateAdapter adapter = new SubordinateAdapter(getActivity(), subordinates);
        ListView listView = (ListView) rootView.findViewById(R.id.listID);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Subordinate sub=subordinates.get(position);
                Intent i=new Intent(getContext(),Employee_Sales_mySubordinate.class);
                startActivity(i);
            }
        });
        return rootView;
    }

}