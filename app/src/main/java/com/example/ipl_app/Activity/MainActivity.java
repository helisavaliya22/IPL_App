package com.example.ipl_app.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.ipl_app.Adapter.Team_Name_Adapter;
import com.example.ipl_app.Config;
import com.example.ipl_app.R;

public class MainActivity extends AppCompatActivity {

    ListView team_listview;
    Team_Name_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        team_listview=findViewById(R.id.team_listview);

        adapter = new Team_Name_Adapter(MainActivity.this, Config.team_logo,Config.team_name);
        team_listview.setAdapter(adapter);

        team_listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int poss, long id) {
                Intent intent = new Intent(MainActivity.this, Player_List_Activity.class);
                intent.putExtra("position",poss);
                startActivity(intent);
            }
        });
    }
}