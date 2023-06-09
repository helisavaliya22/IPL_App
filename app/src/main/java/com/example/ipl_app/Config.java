package com.example.ipl_app;

import android.os.Environment;

import java.io.File;

public class Config {

    public static String[] team_name={"Gujarat Titans","Chennai Super Kings","Mumbai Indians","Delhi Capitals","Rajasthan Royals",
                "Sunrisers Hyderabad","Royal Challengers Bangalore","Kolkata Knight Riders","Lucknow Super Giants","Punjab Kings"};

    public static int[] team_logo={R.drawable.gt_logo,R.drawable.csk_logo,R.drawable.mi_logo,R.drawable.dc_logo,R.drawable.rr_logo,
                        R.drawable.srh_logo,R.drawable.rcb_logo,R.drawable.kkr_logo,R.drawable.lsg_logo,R.drawable.pbks_logo};

    public static String[] gt_playername={"Hardik Pandya","Shubman Gill","Wriddhiman Saha","Williomson","Rashid Khan",
                                "Rahul Tewatiya","Noor Ahmed","Alzari joseph","Mohammad Shami","Vijay Shankar","Yash Dayal"};

    public static int[] gt_playerpic={R.drawable.hardik,R.drawable.gill,R.drawable.saha,R.drawable.williamson,R.drawable.rashid,
                    R.drawable.rahul_tewatiya,R.drawable.noor,R.drawable.alzari,R.drawable.shami,R.drawable.vijay,R.drawable.yash};

    public static String[] gt_titans_subname = {"Allrounder", "Batter", "Batter", "Allrounder", "Batter", "Allrounder", "Allrounder", "Bowler", "Bowler", "Bowler", "Bowler"};

    public static String[] csk_playername={"MS Dhoni","Ravindra Jadeja","Deepak Chahar","Ruturaj Gaikwad","Moeen Ali",
                        "Tushar Deshpande","Mukesh Kumar","Michell Santner","N Jagdeeshan","C Hari","Shivam Dubey"};

    public static  int[] csk_playerpic={R.drawable.ms_dhoni,R.drawable.ravindra_jadeja,R.drawable.deepak_chahar,R.drawable.ruturaj,R.drawable.moeen,
                    R.drawable.tushar,R.drawable.mukesh1,R.drawable.santner,R.drawable.n_jagadeesan,R.drawable.c_hari,R.drawable.shivam};

    public static String[] csk_subname = {"Allrounder", "Batter", "Batter", "Allrounder", "Batter", "Allrounder", "Allrounder", "Bowler", "Bowler", "Bowler", "Bowler"};

    public  static String[] mi_playername={"Rohit Sharma","SuryaKumar Yadav","Ishaan Kishan","Jaydev Unadkat","Arjun Tendulkar",
                    "Tilak Verma","Ramandeep Singh","AnmolPreet Singh","Pollard","Bumrah","Aryan Juyel"};

    public static String[] mi_subname = {"Allrounder", "Batter", "Batter", "Allrounder", "Batter", "Allrounder", "Allrounder", "Bowler", "Bowler", "Bowler", "Bowler"};
    public  static int[] mi_playerpic={R.drawable.rohit,R.drawable.surya,R.drawable.ishan,R.drawable.jaydev,R.drawable.arjun,
                    R.drawable.tilak,R.drawable.ramandeep,R.drawable.anmolpreet,R.drawable.pollard,R.drawable.bumrah,R.drawable.aryan};

    public static String[] rcb_playername={"Virat Kohli","Du Plesis","Maxwell","M Bracewell","Lomror","Anuj Rawat","Dinesh Kartik",
                        "Harshal Patel","Mohhamad Siraj","Finn Allen","Hararanga"};

    public static int[] rcb_playerpic={R.drawable.kohli,R.drawable.duplesis,R.drawable.maxwell,R.drawable.bracewell,R.drawable.lomror,
                        R.drawable.anuj,R.drawable.dinesh,R.drawable.harshal,R.drawable.siraj,R.drawable.finn,R.drawable.hasaranga};

    public static String[] rcb_subname = {"Allrounder", "Batter", "Batter", "Allrounder", "Batter", "Allrounder", "Allrounder", "Bowler", "Bowler", "Bowler", "Bowler"};

    public static String[] lsg_playername={"KL Rahul","K Mayers","Deepak Hooda","Stoinis","Krunal Pandya","Nicholas Pooran",
                            "Ayush Badoni","Naveen-ul_Haq","Amit Mishra","Avesh Khan","Ravi Bisnoy"};

    public static int[] lsg_playerpic={R.drawable.kl_rahul,R.drawable.k_mayers,R.drawable.deepak,R.drawable.stoinis,R.drawable.krunal,R.drawable.pooran,
                    R.drawable.ayush,R.drawable.naveen,R.drawable.amit,R.drawable.avesh,R.drawable.ravi};

    public static String[] lsg_subname = {"Allrounder", "Batter", "Batter", "Allrounder", "Batter", "Allrounder", "Allrounder", "Bowler", "Bowler", "Bowler", "Bowler"};

    public static String[] pbks_playername={"Prabhsimran Singh","Shikhar Dhawan","Matthew Short","B Rajapaksa","Jitesh Sharma",
                        "Sam Curren","Shahrukh Khan","Harpreet Brar","Rabada","Rishi Dhawan","Arshdeep Singh"};

    public static int[] pbks_playerpic={R.drawable.prabhsimran,R.drawable.dhawan,R.drawable.matthew,R.drawable.rajapaksa,
                 R.drawable.jitesh,R.drawable.sam_curran,R.drawable.shahrukh,R.drawable.harpreet,R.drawable.rabada,R.drawable.rishi,R.drawable.arshdeep};

    public static String[] pbks_subname = {"Allrounder", "Batter", "Batter", "Allrounder", "Batter", "Allrounder", "Allrounder", "Bowler", "Bowler", "Bowler", "Bowler"};

    public static String[] srh_playername={"Abhishek Sharma","Rahul Tripathi","Markram","Klaasen","Abdul Samad",
                        "Sanvir Singh","Markande","Marco Jansen","Bhuvneshwar Kumar","Fazalhaq Farooqi","T Natarajan"};

    public static int[] srh_playerpic={R.drawable.abhishek_sharma,R.drawable.tripathi,R.drawable.markram,R.drawable.klaasen,R.drawable.abdul,
                R.drawable.sanvir,R.drawable.markande,R.drawable.marco,R.drawable.bhuvneshwar,R.drawable.fazalhaq,R.drawable.natrajan};

    public static String[] srh_subname = {"Allrounder", "Batter", "Batter", "Allrounder", "Batter", "Allrounder", "Allrounder", "Bowler", "Bowler", "Bowler", "Bowler"};

    public static String[] dc_playername={"Prithvi Shaw","Warner","Mitchell Marsh","Rossouw","Sarfaraz Khan","Axar",
                    "Abhishek Porel","Manish Pandey","Kuldeep Yadav","Nortje","Mukesh Kumar"};

    public static int[] dc_playerpic={R.drawable.prithvi,R.drawable.warner,R.drawable.mitchell,R.drawable.rossouw,R.drawable.sarfaraz,
                    R.drawable.axar,R.drawable.abhishek_porel,R.drawable.manish,R.drawable.kuldeep,R.drawable.nortje,R.drawable.mukesh};

    public static String[] dc_subname = {"Allrounder", "Batter", "Batter", "Allrounder", "Batter", "Allrounder", "Allrounder", "Bowler", "Bowler", "Bowler", "Bowler"};

    public static String[] kkr_playername={"Gurbaz","N Jagadeesan","Nitish Rana","Rinku Singh","Russell","Narine",
                    "Shardul Thakur","Suyash Sharma","Lockie Ferguson","Umesh Yadav","Chakaravarthy"};

    public static int[] kkr_playerpic={R.drawable.gurbaz,R.drawable.n_jagdeesan,R.drawable.nitish,R.drawable.rinku,R.drawable.russell,
                R.drawable.narine,R.drawable.shardul,R.drawable.suyash,R.drawable.lockie,R.drawable.umesh,R.drawable.chakaravarthy};

    public static String[] kkr_subname = {"Allrounder", "Batter", "Batter", "Allrounder", "Batter", "Allrounder", "Allrounder", "Bowler", "Bowler", "Bowler", "Bowler"};

    public static String[] rr_playername={"Jos Buttler","Yashasvi Jaiswal","Samson","Riyan Parag","Hetmayer","Dhruv Jurel",
                    "Ravichandran Ashwin","Boult","Adam Zampa","Sandeep Sharma","Yuzvendra Chahal"};

    public static int[] rr_playerpic={R.drawable.buttler,R.drawable.yashasvi,R.drawable.samson,R.drawable.riyan,R.drawable.hetmayer,
                    R.drawable.dhruv_jurel,R.drawable.ashwin,R.drawable.boult,R.drawable.zampa,R.drawable.sandeep,R.drawable.chahal};

    public static String[] rr_subname = {"Allrounder", "Batter", "Batter", "Allrounder", "Batter", "Allrounder", "Allrounder", "Bowler", "Bowler", "Bowler", "Bowler"};

    public static int[] gradArr={R.drawable.bg_gradient1,R.drawable.bg_gradient2,R.drawable.bg_gradient3,R.drawable.bg_gradient4,
            R.drawable.bg_gradient5,R.drawable.bg_gradient6,R.drawable.bg_gradient7,R.drawable.bg_gradient8};

    public static int[] ColorArr={R.color.black,R.color.lemon_color,R.color.blue,R.color.light_blue,R.color.light_pink,
                            R.color.pink,R.color.nevy_blue,R.color.peach,R.color.teal1,R.color.water_color};

    public static String[] fontArr={"AGENCYB.TTF",
           "AGENCYR.TTF",
            "ALGER.TTF",
            "BASKVILL.TTF",
            "BAUHS93.TTF",
            "BELL.TTF",
            "BELLB.TTF",
            "BELLI.TTF",
            "BOD_B.TTF",
            "BOD_BI.TTF",
            "BOD_BLAI.TTF",
            "BOD_BLAR.TTF",
            "BOD_CB.TTF",
            "BOD_CBI.TTF",
            "BOD_CI.TTF",
            "BOD_CR.TTF",
            "BOD_I.TTF"};

    public static File file = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
}

