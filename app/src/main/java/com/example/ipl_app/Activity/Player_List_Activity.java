package com.example.ipl_app.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.ipl_app.Adapter.Player_Name_Adapter;
import com.example.ipl_app.Config;
import com.example.ipl_app.R;

public class Player_List_Activity extends AppCompatActivity {

    ListView player_listview;
    Player_Name_Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_list);

        player_listview = findViewById(R.id.player_listview);

        int poss = getIntent().getIntExtra("position",0);

        if (poss == 0)
        {
            adapter = new Player_Name_Adapter(Player_List_Activity.this, Config.gt_playerpic,Config.gt_playername,Config.gt_titans_subname);
        }
        else if (poss == 1)
        {
            adapter = new Player_Name_Adapter(Player_List_Activity.this,Config.csk_playerpic,Config.csk_playername,Config.csk_subname);
        }
        else if (poss == 2)
        {
            adapter = new Player_Name_Adapter(Player_List_Activity.this,Config.mi_playerpic,Config.mi_playername,Config.mi_subname);
        }
        else if (poss == 3)
        {
            adapter = new Player_Name_Adapter(Player_List_Activity.this,Config.dc_playerpic,Config.dc_playername,Config.dc_subname);
        }
        else if (poss == 4)
        {
            adapter = new Player_Name_Adapter(Player_List_Activity.this,Config.rr_playerpic,Config.rr_playername,Config.rr_subname);
        }
        else if (poss == 5)
        {
            adapter = new Player_Name_Adapter(Player_List_Activity.this,Config.srh_playerpic,Config.srh_playername,Config.srh_subname);
        }
        else if (poss == 6)
        {
            adapter = new Player_Name_Adapter(Player_List_Activity.this,Config.rcb_playerpic,Config.rcb_playername,Config.rcb_subname);
        }
        else if (poss == 7)
        {
            adapter = new Player_Name_Adapter(Player_List_Activity.this,Config.kkr_playerpic,Config.kkr_playername,Config.kkr_subname);
        }
        else if (poss == 8)
        {
            adapter = new Player_Name_Adapter(Player_List_Activity.this,Config.lsg_playerpic,Config.lsg_playername,Config.lsg_subname);
        }
        else if (poss == 9)
        {
            adapter = new Player_Name_Adapter(Player_List_Activity.this,Config.pbks_playerpic,Config.pbks_playername,Config.pbks_subname);
        }
        player_listview.setAdapter(adapter);

        player_listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Player_List_Activity.this, Player_Display_Activity.class);
                if(poss == 0)
                {
                    intent.putExtra("position1",position);
                    intent.putExtra("Playerpic",Config.gt_playerpic);
                    intent.putExtra("playername",Config.gt_playername);
                    intent.putExtra("playersubname",Config.gt_titans_subname);
                }
                else if(poss == 1)
                {
                    intent.putExtra("position1",position);
                    intent.putExtra("Playerpic",Config.csk_playerpic);
                    intent.putExtra("playername",Config.csk_playername);
                    intent.putExtra("playersubname",Config.csk_subname);
                }
                else if(poss == 2)
                {
                    intent.putExtra("position1",position);
                    intent.putExtra("Playerpic",Config.mi_playerpic);
                    intent.putExtra("playername",Config.mi_playername);
                    intent.putExtra("playersubname",Config.mi_subname);
                }
                else if(poss == 3)
                {
                    intent.putExtra("position1",position);
                    intent.putExtra("Playerpic",Config.dc_playerpic);
                    intent.putExtra("playername",Config.dc_playername);
                    intent.putExtra("playersubname",Config.dc_subname);
                }
                else if(poss == 4)
                {
                    intent.putExtra("position1",position);
                    intent.putExtra("Playerpic",Config.rr_playerpic);
                    intent.putExtra("playername",Config.rr_playername);
                    intent.putExtra("playersubname",Config.rr_subname);
                }
                else if(poss == 5)
                {
                    intent.putExtra("position1",position);
                    intent.putExtra("Playerpic",Config.srh_playerpic);
                    intent.putExtra("playername",Config.srh_playername);
                    intent.putExtra("playersubname",Config.srh_subname);
                }
                else if(poss == 6)
                {
                    intent.putExtra("position1",position);
                    intent.putExtra("Playerpic",Config.rcb_playerpic);
                    intent.putExtra("playername",Config.rcb_playername);
                    intent.putExtra("playersubname",Config.rcb_subname);
                }
                else if(poss == 7)
                {
                    intent.putExtra("position1",position);
                    intent.putExtra("Playerpic",Config.kkr_playerpic);
                    intent.putExtra("playername",Config.kkr_playername);
                    intent.putExtra("playersubname",Config.kkr_subname);
                }
                else if(poss == 8)
                {
                    intent.putExtra("position1",position);
                    intent.putExtra("Playerpic",Config.lsg_playerpic);
                    intent.putExtra("playername",Config.lsg_playername);
                    intent.putExtra("playersubname",Config.lsg_subname);
                }
                else if(poss == 9)
                {
                    intent.putExtra("position1",position);
                    intent.putExtra("Playerpic",Config.pbks_playerpic);
                    intent.putExtra("playername",Config.pbks_playername);
                    intent.putExtra("playersubname",Config.pbks_subname);
                }
                startActivity(intent);
            }
        });
    }
}