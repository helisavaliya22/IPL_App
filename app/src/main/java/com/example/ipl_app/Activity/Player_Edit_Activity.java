package com.example.ipl_app.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ipl_app.Adapter.Color_Adapter;
import com.example.ipl_app.Adapter.Font_Adapter;
import com.example.ipl_app.Adapter.Gradient_Adapter1;
import com.example.ipl_app.Config;
import com.example.ipl_app.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class Player_Edit_Activity extends AppCompatActivity {

    ImageView plpicdisp,reload1,expand1;
    TextView plnamedisp,plsubnamedisp;
    Button background,text_color,share,font,emoji,text_size;
    private File downloadedFile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_edit);

        expand1 = findViewById(R.id.expand1);
        reload1 = findViewById(R.id.reload1);
        background = findViewById(R.id.background);
        text_color = findViewById(R.id.text_color);
        share = findViewById(R.id.share);
        font = findViewById(R.id.font);
        emoji = findViewById(R.id.emoji);
        text_size = findViewById(R.id.text_size);
        plpicdisp = findViewById(R.id.plpicdisp);
        plnamedisp = findViewById(R.id.plnamedisp);
        plsubnamedisp = findViewById(R.id.plsubnamedisp);

        int pic = getIntent().getIntExtra("plpic",0);
        String name = getIntent().getStringExtra("plname");
        String subname = getIntent().getStringExtra("plsubname");

        plpicdisp.setImageResource(pic);
        plnamedisp.setText(name);
        plsubnamedisp.setText(subname);

        reload1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int max= Config.gradArr.length,min=1;
                int r = new Random().nextInt(max-min)+min;
                plpicdisp.setBackgroundResource(Config.gradArr[r]);
            }
        });

        expand1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog dialog = new BottomSheetDialog(Player_Edit_Activity.this);
                dialog.setContentView(R.layout.gradient_dialog_layout1);

                GridView gridView = dialog.findViewById(R.id.grad_gridview1);
                Gradient_Adapter1 adapter1 = new Gradient_Adapter1(Player_Edit_Activity.this,Config.gradArr);
                gridView.setAdapter(adapter1);

                gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        plpicdisp.setBackgroundResource(Config.gradArr[position]);
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });

        background.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog dialog = new BottomSheetDialog(Player_Edit_Activity.this);
                dialog.setContentView(R.layout.color_dialog_layout);

                GridView gridView = dialog.findViewById(R.id.color_gridview);
                Color_Adapter adapter = new Color_Adapter(Player_Edit_Activity.this,Config.ColorArr);
                gridView.setAdapter(adapter);

                gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        plpicdisp.setBackgroundResource(Config.ColorArr[position]);
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });

        text_color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog dialog = new BottomSheetDialog(Player_Edit_Activity.this);
                dialog.setContentView(R.layout.color_dialog_layout);

                GridView gridView = dialog.findViewById(R.id.color_gridview);
                Color_Adapter adapter = new Color_Adapter(Player_Edit_Activity.this,Config.ColorArr);
                gridView.setAdapter(adapter);

                gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        plnamedisp.setTextColor(Config.ColorArr[position]);
                        plsubnamedisp.setTextColor(Config.ColorArr[position]);
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });

        font.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    BottomSheetDialog dialog = new BottomSheetDialog(Player_Edit_Activity.this);
                    dialog.setContentView(R.layout.font_dialog_layout);

                    GridView gridView = dialog.findViewById(R.id.font_gridview);
                Font_Adapter adapter = new Font_Adapter(Player_Edit_Activity.this,Config.fontArr);
                gridView.setAdapter(adapter);

                gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Typeface typeface= Typeface.createFromAsset(getAssets(),Config.fontArr[position]);

                        plnamedisp.setTypeface(typeface);
                        plsubnamedisp.setTypeface(typeface);
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });

        text_size.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog dialog = new BottomSheetDialog(Player_Edit_Activity.this);
                dialog.setContentView(R.layout.font_size_layout);

                SeekBar seekBar = dialog.findViewById(R.id.seekbar);
                seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        plnamedisp.setTextSize(2,10+progress);
                        plsubnamedisp.setTextSize(2,10+progress);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bitmap icon = getBitmapFromView(plpicdisp);
                //Intent share = new Intent(Intent.ACTION_SEND);
                Intent share =new Intent(Intent.ACTION_SEND);
                share.setType("image/jpeg");
                ByteArrayOutputStream bytes = new ByteArrayOutputStream();
                icon.compress(Bitmap.CompressFormat.JPEG, 100, bytes);

                SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault());
                String currentDateandTime = sdf.format(new Date());

                downloadedFile= new File(Config.file.getAbsolutePath() + "/IMG_"+currentDateandTime+".jpg");
                try
                {
                    downloadedFile.createNewFile();
                    FileOutputStream fo = new FileOutputStream(downloadedFile);
                    fo.write(bytes.toByteArray());
                    Toast.makeText(Player_Edit_Activity.this,"File Downloaded",Toast.LENGTH_SHORT).show();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }

                share.putExtra(Intent.EXTRA_STREAM, Uri.parse(downloadedFile.getAbsolutePath()));
                startActivity(Intent.createChooser(share, "Share Image"));
            }
        });
    }

    private Bitmap getBitmapFromView(ImageView plpicdisp)
    {
        //Define a bitmap with the same size as the view
        Bitmap returnedBitmap = Bitmap.createBitmap(plpicdisp.getWidth(), plpicdisp.getHeight(), Bitmap.Config.ARGB_8888);
        //Bind a canvas to it
        Canvas canvas = new Canvas(returnedBitmap);
        //Get the view's background
        Drawable bgDrawable = plpicdisp.getBackground();
        if (bgDrawable != null)
        {
            //has background drawable, then draw it on the canvas
            bgDrawable.draw(canvas);
        }
        else
        {
            //does not have background drawable, then draw white background on the canvas
            canvas.drawColor(Color.WHITE);
        }
        // draw the view on the canvas
        plpicdisp.draw(canvas);
        //return the bitmap
        return returnedBitmap;
    }
}