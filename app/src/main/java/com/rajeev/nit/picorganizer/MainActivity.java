package com.rajeev.nit.picorganizer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private ImageAdapter mImgAdpt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout lv = (LinearLayout) findViewById(R.id.folderscroll);
        for(int i = 0; i < 10; i++){
            lv.addView(new FolderView(this, "Folder"));
        }

        GridView gv = (GridView) findViewById(R.id.imagegrid);
        mImgAdpt = new ImageAdapter(this);
        gv.setAdapter(mImgAdpt);
    }
}
