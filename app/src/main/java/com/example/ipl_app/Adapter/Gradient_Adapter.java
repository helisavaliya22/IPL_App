package com.example.ipl_app.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.ipl_app.Activity.Player_Display_Activity;
import com.example.ipl_app.R;

public class Gradient_Adapter extends BaseAdapter {
    Player_Display_Activity player_display_activity;
    int[] gradArr;
    public Gradient_Adapter(Player_Display_Activity player_display_activity, int[] gradArr) {
        this.player_display_activity = player_display_activity;
        this.gradArr = gradArr;
    }

    @Override
    public int getCount() {
        return gradArr.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        view = LayoutInflater.from(player_display_activity).inflate(R.layout.gradient_dialog_layout_item,parent,false);

        ImageView imageView = view.findViewById(R.id.grad_gridview_item);
        imageView.setBackgroundResource(gradArr[position]);
        return view;
    }
}
