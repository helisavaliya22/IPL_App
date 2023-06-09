package com.example.ipl_app.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ipl_app.Adapter.Gradient_Adapter;
import com.example.ipl_app.Adapter.Player_Page_Adapter;
import com.example.ipl_app.Config;
import com.example.ipl_app.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.Random;

public class Player_Display_Activity extends AppCompatActivity {

    ImageView expand,reload,plpic,copy,previous,pencil,next,share;
    TextView plname,plsubname,player_number;
    int position;
    ViewPager viewpager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_display);

        expand = findViewById(R.id.expand);
        reload = findViewById(R.id.reload);
        copy = findViewById(R.id.copy);
        previous = findViewById(R.id.previous);
        pencil = findViewById(R.id.pencil);
        next = findViewById(R.id.next);
        share = findViewById(R.id.share);
        plpic = findViewById(R.id.plpic);
        plname = findViewById(R.id.plname);
        plsubname = findViewById(R.id.plsubname);
        player_number = findViewById(R.id.player_number);

        position = getIntent().getIntExtra("position1",0);
        int[] pic = getIntent().getIntArrayExtra("Playerpic");
        String[] name = getIntent().getStringArrayExtra("playername");
        String[] subname = getIntent().getStringArrayExtra("playersubname");

        plpic.setImageResource(pic[position]);
        plname.setText(name[position]);
        plsubname.setText(subname[position]);

        expand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog dialog = new BottomSheetDialog(Player_Display_Activity.this);
                dialog.setContentView(R.layout.gradient_dialog_layout);

                GridView gridView = dialog.findViewById(R.id.grad_gridview);
                Gradient_Adapter adapter = new Gradient_Adapter(Player_Display_Activity.this, Config.gradArr);
                gridView.setAdapter(adapter);
                gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        plpic.setBackgroundResource(Config.gradArr[position]);
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });

        reload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int max = Config.gradArr.length;
                int min = 1;
                int r =  new Random().nextInt(max-min)+min;
                plpic.setBackgroundResource(Config.gradArr[r]);
            }
        });

        player_number.setText((position+1)+"/11");

        copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager cm = (ClipboardManager)getSystemService(CLIPBOARD_SERVICE);
                cm.setText(plname.getText());
                cm.setText(plsubname.getText());
                Toast.makeText(Player_Display_Activity.this,"Copied to clipboard", Toast.LENGTH_SHORT).show();

            }
        });

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position > 0)
                {
                    position--;
                    plpic.setImageResource(pic[position]);
                    plname.setText(name[position]);
                    plsubname.setText(subname[position]);
                    player_number.setText((position+1)+"/11");
                }
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position < plname.length())
                {
                    position++;
                    plpic.setImageResource(pic[position]);
                    plname.setText(name[position]);
                    plsubname.setText(subname[position]);
                    player_number.setText((position+1)+"/11");
                }
            }
        });

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentt = new Intent(Intent.ACTION_SEND);

                intentt.setType("text/plain");
                intentt.putExtra(Intent.EXTRA_SUBJECT,"Subject Here");

                intentt.putExtra(Intent.EXTRA_TEXT,plname.getText().toString());
                intentt.putExtra(Intent.EXTRA_TEXT,plsubname.getText().toString());
                startActivity(Intent.createChooser(intentt,"Share Via"));
            }
        });

        pencil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Player_Display_Activity.this, Player_Edit_Activity.class);
                intent.putExtra("plpic",pic[position]);
                intent.putExtra("plname",name[position]);
                intent.putExtra("plsubname",subname[position]);
                startActivity(intent);
            }
        });

        Player_Page_Adapter page_adapter = new Player_Page_Adapter(Player_Display_Activity.this,pic,name,subname,plpic,plname,plsubname);

        viewpager = findViewById(R.id.viewpager);
        viewpager.setAdapter(page_adapter);
        viewpager.setCurrentItem(position);
        viewpager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                plpic.setImageResource(pic[position]);
                plname.setText(name[position]);
                plsubname.setText(subname[position]);
                player_number.setText((position+1)+"/11");
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}