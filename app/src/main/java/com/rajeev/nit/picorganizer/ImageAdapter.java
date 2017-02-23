package com.rajeev.nit.picorganizer;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ranjra on 2/22/2017.
 */
public class ImageAdapter extends BaseAdapter {

    private Context mContext;
    private List<File> mFiles;
    private List<ImageThumbView> mImgs;

    public ImageAdapter(Context c){
        mContext = c;
        mImgs = new ArrayList<ImageThumbView>();
        for(int i = 0; i < 15; i++){
            mImgs.add(new ImageThumbView(mContext));
        }
    }

    public int getCount(){
        if(null != mFiles){
            return mFiles.size();
        }
        return 15;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        return mImgs.get(position);
    }

    public void SetImageFileList(List<File> files){
        mFiles = files;
        this.notifyDataSetChanged();
    }
}
