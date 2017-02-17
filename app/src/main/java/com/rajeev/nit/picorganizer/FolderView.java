package com.rajeev.nit.picorganizer;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.content.ContextCompat;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by ranjra on 2/17/2017.
 */
public class FolderView extends LinearLayout {

    private String mPath;
    public FolderView(Context context, String path){
        super(context);
        mPath = path;

        this.setOrientation(LinearLayout.VERTICAL);
        int valPad = Utils.dipToPixels(context, 4);
        this.setPadding(valPad,valPad,valPad,valPad);
        this.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 0));

        ImageView iv = new ImageView(context);
        iv.setAdjustViewBounds(true);
        iv.setImageResource(R.drawable.folder);
        this.addView(iv, 0, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        TextView tv = new TextView(context);
        tv.setText(mPath);
        tv.setTextColor(ContextCompat.getColor(context, R.color.colorFolderTxt));
        this.addView(tv, 1, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
    }

    @Override
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, widthMeasureSpec);
    }
}
