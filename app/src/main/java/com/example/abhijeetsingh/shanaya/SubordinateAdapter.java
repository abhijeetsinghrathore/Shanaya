package com.example.abhijeetsingh.shanaya;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by iesha on 15-Jun-18.
 */

public class SubordinateAdapter extends ArrayAdapter<Subordinate> {
    public SubordinateAdapter(Context context, ArrayList<Subordinate> subordinates) {
        super(context, 0, subordinates);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View v, @NonNull ViewGroup parent) {
        View listItemView=v;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.subordinate_list_item, parent, false);
        }
        Subordinate currentSub=getItem(position);
        TextView subName=(TextView)listItemView.findViewById(R.id.subNameID);
        subName.setText(currentSub.getSubName());
        TextView subId=(TextView)listItemView.findViewById(R.id.subIdID);
        subId.setText(currentSub.getSubID());
        ImageView subImage=(ImageView)listItemView.findViewById(R.id.subImageID);
        if (currentSub.hasImage()) {
            subImage.setImageResource(currentSub.getSubImageResourceID());
            subImage.setVisibility(View.VISIBLE);
        }
        else{
            subImage.setImageResource(R.drawable.person);
        }
        return listItemView;
    }
}
