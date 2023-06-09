package com.example.ipl_app.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ipl_app.Activity.MainActivity;
import com.example.ipl_app.R;

public class Team_Name_Adapter extends BaseAdapter {

    MainActivity mainActivity ;
    int[] team_logo;
    String[] team_name;
    public Team_Name_Adapter(MainActivity mainActivity, int[] team_logo, String[] team_name) {
        this.mainActivity=mainActivity;
        this.team_logo=team_logo;
        this.team_name=team_name;
    }

    @Override
    public int getCount() {
        return team_name.length;
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

        view = LayoutInflater.from(mainActivity).inflate(R.layout.team_name_layout,parent,false);

        ImageView imageView = view.findViewById(R.id.team_logo);
        TextView textView = view.findViewById(R.id.team_name);

        imageView.setImageResource(team_logo[position]);
        textView.setText(team_name[position]);
        return view;
    }
}
