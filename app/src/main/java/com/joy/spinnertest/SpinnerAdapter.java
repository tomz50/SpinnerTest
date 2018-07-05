package com.joy.spinnertest;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class SpinnerAdapter extends BaseAdapter{

    private int position;
    private LayoutInflater inflater;
    private ArrayList<ColorItem> color_lists;

    public SpinnerAdapter(Context c,ArrayList<ColorItem> color_lists) {
        this.color_lists = color_lists;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Color color =(Color) getItem(position);
        View v =inflater.inflate(R.layout.color_view,null);
        TextView color = (TextView) v.findViewById(R.id.imageView);
        color.setText(color.color);
        return v;



    }
}
