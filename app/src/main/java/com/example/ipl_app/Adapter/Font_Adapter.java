package com.example.ipl_app.Adapter;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ipl_app.Activity.Player_Edit_Activity;
import com.example.ipl_app.R;

public class Font_Adapter extends BaseAdapter {
    Player_Edit_Activity player_edit_activity;
    String[] fontArr;
    public Font_Adapter(Player_Edit_Activity player_edit_activity, String[] fontArr) {
        this.player_edit_activity = player_edit_activity;
        this.fontArr = fontArr;
    }

    @Override
    public int getCount() {
        return fontArr.length;
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

        view = LayoutInflater.from(player_edit_activity).inflate(R.layout.font_dialog_item_layout,parent,false);

        TextView textView = view.findViewById(R.id.font_item);
        Typeface typeface= Typeface.createFromAsset(player_edit_activity.getAssets(),fontArr[position]);
        textView.setTypeface(typeface);
        return view;
    }
}
