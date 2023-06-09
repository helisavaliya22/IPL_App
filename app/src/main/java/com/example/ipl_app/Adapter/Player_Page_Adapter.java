package com.example.ipl_app.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.ipl_app.Activity.Player_Display_Activity;
import com.example.ipl_app.R;

public class Player_Page_Adapter extends PagerAdapter {

    Player_Display_Activity player_display_activity;
    int[] pic;
    String[] name;
    String[] subname;
    ImageView plpic;
    TextView plname,plsubname;
    public Player_Page_Adapter(Player_Display_Activity player_display_activity, int[] pic, String[] name, String[] subname, ImageView plpic, TextView plname, TextView plsubname)
    {
        this.player_display_activity = player_display_activity;
        this.pic = pic;
        this.name = name;
        this.subname =subname;
        this.plpic = plpic;
        this.plname = plsubname;
        this.plsubname = plsubname;
    }

    @Override
    public int getCount() {
        return pic.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        View view = LayoutInflater.from(player_display_activity).inflate(R.layout.pager_item,container,false);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}
