package com.premjithsiddharth.lifecyclelab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    SharedPreferences sharedPref;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sharedPref = getSharedPreferences("Settings", Context.MODE_PRIVATE);
        editor = sharedPref.edit();
        Information info = new Information();
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
