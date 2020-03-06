package com.premjithsiddharth.lifecyclelab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    SharedPreferences sharedPref;
    SharedPreferences.Editor editor;
    Information info;
    TextView create;
    String create1;
    TextView start;
    String start1;
    TextView resume;
    String resume1;
    TextView pause;
    String pause1;
    TextView stop;
    String stop1;
    TextView restart;
    String restart1;
    TextView destroy;
    String destroy1;
    Button button;
    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sharedPref = getSharedPreferences("Settings", Context.MODE_PRIVATE);
        editor = sharedPref.edit();
        editor.apply();
        info = new Information();
        create = findViewById(R.id.string1_1);
        create1 = sharedPref.getInt("create", 0) + ", " + info.getCreate();
        create.setText(create1);
        start = findViewById(R.id.string2_1);
        start1 = sharedPref.getInt("start", 0) + ", " + info.getStart();
        start.setText(start1);
        resume = findViewById(R.id.string3_1);
        resume1 = sharedPref.getInt("resume", 0) + ", " + info.getResume();
        resume.setText(resume1);
        pause = findViewById(R.id.string4_1);
        pause1 = sharedPref.getInt("pause", 0) + ", " + info.getPause();
        pause.setText(pause1);
        stop = findViewById(R.id.string5_1);
        stop1 = sharedPref.getInt("stop", 0) + ", " + info.getStop();
        stop.setText(stop1);
        restart = findViewById(R.id.string6_1);
        restart1 = sharedPref.getInt("restart", 0) + ", " + info.getRestart();
        restart.setText(restart1);
        destroy = findViewById(R.id.string7_1);
        destroy1 = sharedPref.getInt("destroy", 0) + ", " + info.getDestroy();
        destroy.setText(destroy1);
        editor.putInt("create", sharedPref.getInt("create", 0) + 1);
        info.setCreate(info.getCreate() + 1);
        editor.apply();
        create1 = sharedPref.getInt("create", 0) + ", " + info.getCreate();
        create.setText(create1);
        button = findViewById(R.id.resetCount);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putInt("create", 0);
                editor.putInt("start", 0);
                editor.putInt("resume", 0);
                editor.putInt("pause", 0);
                editor.putInt("stop", 0);
                editor.putInt("restart", 0);
                editor.putInt("destroy", 0);
                editor.apply();
                info = new Information();
                create1 = sharedPref.getInt("create", 0) + ", " + info.getCreate();
                create.setText(create1);
                start1 = sharedPref.getInt("start", 0) + ", " + info.getStart();
                start.setText(start1);
                resume1 = sharedPref.getInt("resume", 0) + ", " + info.getResume();
                resume.setText(resume1);
                pause1 = sharedPref.getInt("pause", 0) + ", " + info.getPause();
                pause.setText(pause1);
                stop1 = sharedPref.getInt("stop", 0) + ", " + info.getStop();
                stop.setText(stop1);
                restart1 = sharedPref.getInt("restart", 0) + ", " + info.getRestart();
                restart.setText(restart1);
                destroy1 = sharedPref.getInt("destroy", 0) + ", " + info.getDestroy();
                destroy.setText(destroy1);
            }
        });
        button2 = findViewById(R.id.resetCount2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info = new Information();
                create1 = sharedPref.getInt("create", 0) + ", " + info.getCreate();
                create.setText(create1);
                start1 = sharedPref.getInt("start", 0) + ", " + info.getStart();
                start.setText(start1);
                resume1 = sharedPref.getInt("resume", 0) + ", " + info.getResume();
                resume.setText(resume1);
                pause1 = sharedPref.getInt("pause", 0) + ", " + info.getPause();
                pause.setText(pause1);
                stop1 = sharedPref.getInt("stop", 0) + ", " + info.getStop();
                stop.setText(stop1);
                restart1 = sharedPref.getInt("restart", 0) + ", " + info.getRestart();
                restart.setText(restart1);
                destroy1 = sharedPref.getInt("destroy", 0) + ", " + info.getDestroy();
                destroy.setText(destroy1);
            }
        });
    }
    protected void onStart(){
        super.onStart();
        editor.putInt("start", sharedPref.getInt("start", 0) + 1);
        info.setStart(info.getStart() + 1);
        editor.apply();
        start1 = sharedPref.getInt("start", 0) + ", " + info.getStart();
        start.setText(start1);
    }
    protected void onResume(){
        super.onResume();
        editor.putInt("resume", sharedPref.getInt("resume", 0) + 1);
        info.setResume(info.getResume() + 1);
        editor.apply();
        resume1 = sharedPref.getInt("resume", 0) + ", " + info.getResume();
        resume.setText(resume1);
    }
    protected void onPause(){
        super.onPause();
        editor.putInt("pause", sharedPref.getInt("pause", 0) + 1);
        info.setPause(info.getPause() + 1);
        editor.apply();
        pause1 = sharedPref.getInt("pause", 0) + ", " + info.getPause();
        pause.setText(pause1);
    }
    protected void onStop(){
        super.onStop();
        editor.putInt("stop", sharedPref.getInt("stop", 0) + 1);
        info.setStop(info.getStop() + 1);
        editor.apply();
        stop1 = sharedPref.getInt("stop", 0) + ", " + info.getStop();
        stop.setText(stop1);
    }
    protected void onRestart(){
        super.onRestart();
        editor.putInt("restart", sharedPref.getInt("restart", 0) + 1);
        info.setRestart(info.getRestart() + 1);
        editor.apply();
        restart1 = sharedPref.getInt("restart", 0) + ", " + info.getRestart();
        restart.setText(restart1);
    }
    protected void onDestroy(){
        super.onDestroy();
        editor.putInt("destroy", sharedPref.getInt("destroy", 0) + 1);
        info.setDestroy(info.getDestroy() + 1);
        editor.apply();
        destroy1 = sharedPref.getInt("destroy", 0) + ", " + info.getDestroy();
        destroy.setText(destroy1);
    }
    public class Information {
        int create;
        int start;
        int resume;
        int pause;
        int stop;
        int restart;
        int destroy;
        public Information(){
            create = 0;
            start = 0;
            resume = 0;
            pause = 0;
            stop = 0;
            restart = 0;
            destroy = 0;
        }
        public int getCreate(){
            return create;
        }
        public void setCreate(int x){
            create = x;
        }
        public int getStart(){
            return start;
        }
        public void setStart(int x){
            start = x;
        }
        public int getResume(){
            return resume;
        }
        public void setResume(int x){
            resume = x;
        }
        public int getPause(){
            return pause;
        }
        public void setPause(int x){
            pause = x;
        }
        public int getStop(){
            return stop;
        }
        public void setStop(int x){
            stop = x;
        }
        public int getRestart(){
            return restart;
        }
        public void setRestart(int x){
            restart = x;
        }
        public int getDestroy(){
            return destroy;
        }
        public void setDestroy(int x){
            destroy = x;
        }
    }
}
