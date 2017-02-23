package com.rajeev.nit.picorganizer;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.io.File;

/**
 * Created by ranjra on 2/21/2017.
 */
public class ImageThumbView extends RelativeLayout {

    private ImageView iv;
    private CheckBox cb;
    public ImageThumbView(Context context){
        super(context);
        initialize(context);
    }

    public ImageThumbView(Context context, File imgFile){
        super(context);
        initialize(context);
        SetImage(imgFile);
    }

    public void SetImage(File imgFile){

    }

    private void initialize(Context context){
        int valPad = Utils.dipToPixels(context, 4);
        this.setPadding(valPad, valPad, valPad, valPad);

        this.setLayoutParams(new AbsListView.LayoutParams(AbsListView.LayoutParams.MATCH_PARENT, AbsListView.LayoutParams.MATCH_PARENT));

        iv = new ImageView(context);
        iv.setImageResource(R.drawable.folder);
        iv.setAdjustViewBounds(true);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
        this.addView(iv, params);

        cb = new CheckBox(context);
        params = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        params.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
        params.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
        this.addView(cb, params);
        this.setLongClickable(true);

        setEventListener();
    }

    private void setEventListener(){
        setOnLongClickListener(new OnLongClickListener() {
            @Override
            public boolean onLongClick(View arg0) {
                return false;
            }
        });

        cb.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean val = cb.isChecked();
                cb.setChecked(!val);
            }
        });
    }

    @Override
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, widthMeasureSpec);
    }

    public boolean isImgSelected(){
        return cb.isChecked();
    }
}
