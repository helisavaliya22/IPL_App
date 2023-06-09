package com.example.ipl_app.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ipl_app.Activity.Player_Display_Activity;
import com.example.ipl_app.Activity.Player_Edit_Activity;
import com.example.ipl_app.R;

public class Color_Adapter extends BaseAdapter {
    Player_Edit_Activity player_edit_activity;
    int[] colorArr;
    public Color_Adapter(Player_Edit_Activity player_edit_activity, int[] colorArr) {
        this.player_edit_activity = player_edit_activity;
        this.colorArr = colorArr;
    }

    @Override
    public int getCount() {
        return colorArr.length;
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

        view = LayoutInflater.from(player_edit_activity).inflate(R.layout.color_dialog_item_layout,parent,false);

        TextView textView = view.findViewById(R.id.color_item_box);
        textView.setBackgroundResource(colorArr[position]);
        textView.setTextColor(colorArr[position]);

        return view;
    }
}
