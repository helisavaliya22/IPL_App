package com.example.ipl_app.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ipl_app.Activity.Player_List_Activity;
import com.example.ipl_app.R;

public class Player_Name_Adapter extends BaseAdapter {

    Player_List_Activity player_list_activity;
    int[] playerpic;
    String[] playername;
    String[] playersubname;
    public Player_Name_Adapter(Player_List_Activity player_list_activity, int[] playerpic, String[] playername,String[] playersubname)
    {
        this.player_list_activity=player_list_activity;
        this.playerpic=playerpic;
        this.playername=playername;
        this.playersubname=playersubname;
    }

    @Override
    public int getCount() {
        return playername.length;
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

        view = LayoutInflater.from(player_list_activity).inflate(R.layout.player_name_layout,parent,false);

        ImageView imageView = view.findViewById(R.id.player_pic);
        TextView textView = view.findViewById(R.id.player_name);
        TextView textView1 = view.findViewById(R.id.player_subname);

        imageView.setImageResource(playerpic[position]);
        textView.setText(playername[position]);
        textView1.setText(playersubname[position]);
        return view;
    }
}
