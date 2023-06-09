package com.example.ipl_app.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.ipl_app.Activity.Player_Edit_Activity;
import com.example.ipl_app.R;

public class Gradient_Adapter1 extends BaseAdapter {

    Player_Edit_Activity player_edit_activity;
    int[] gradArr;
    public Gradient_Adapter1(Player_Edit_Activity player_edit_activity, int[] gradArr) {
        this.player_edit_activity = player_edit_activity;
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

        view = LayoutInflater.from(player_edit_activity).inflate(R.layout.gradient_dialog_layout_item1,parent,false);

        ImageView imageView = view.findViewById(R.id.grad_gridview_item1);
        imageView.setBackgroundResource(gradArr[position]);
        return view;
    }
}
