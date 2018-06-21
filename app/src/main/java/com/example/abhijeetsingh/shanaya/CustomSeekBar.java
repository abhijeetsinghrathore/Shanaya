package com.example.abhijeetsingh.shanaya;

/**
 * Created by iesha on 21-Jun-18.
 */

import android.content.Context;
import android.util.Log;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class CustomSeekBar {

    int maxCount, textColor;
    Context mContext;
    LinearLayout mSeekLin;
    SeekBar mSeekBar;

    public CustomSeekBar(Context context, int maxCount, int textColor) {
        this.mContext = context;
        this.maxCount = maxCount;
        this.textColor = textColor;
    }

    public void addSeekBar(LinearLayout parent) {

        if (parent instanceof LinearLayout) {

            parent.setOrientation(LinearLayout.VERTICAL);
            mSeekBar = new SeekBar(mContext);
            mSeekBar.setMax(maxCount - 1);
            mSeekBar.setRotation(90);


            // Add LinearLayout for labels below SeekBar
            mSeekLin = new LinearLayout(mContext);
            mSeekLin.setOrientation(LinearLayout.VERTICAL);
            mSeekLin.setPadding(10, 0, 10, 0);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            );
            params.setMargins(35, 10, 35, 0);
            mSeekLin.setLayoutParams(params);

            addLabelsBelowSeekBar();
            parent.addView(mSeekBar);
            parent.addView(mSeekLin);

        } else {

            Log.e("CustomSeekBar", " Parent is not a LinearLayout");

        }

    }

    private void addLabelsBelowSeekBar() {
        for (int count = 0; count < maxCount; count++) {
            TextView textView = new TextView(mContext);
            if(count==0)
                textView.setText("Analysis");
            else if(count==1)
                textView.setText("Specifications");
            else if(count==2)
                textView.setText("Design");
            else if(count==3)
                textView.setText("Documentation");
            else if(count==4)
                textView.setText("Development");
            else if(count==5)
                textView.setText("Testing");
            else if(count==6)
                textView.setText("Done");

            textView.setTextColor(textColor);
            textView.setGravity(Gravity.LEFT);
            mSeekLin.addView(textView);
            textView.setLayoutParams((count == maxCount - 1) ? getLayoutParams(0.0f) : getLayoutParams(1.0f));
        }
    }

    LinearLayout.LayoutParams getLayoutParams(float weight) {
        return new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT, weight);
    }

}
