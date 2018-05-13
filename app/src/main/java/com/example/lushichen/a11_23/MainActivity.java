package com.example.lushichen.a11_23;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button btn_start,btn_stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        btn_start=(Button)findViewById(R.id.start);
        btn_stop=(Button)findViewById(R.id.stop);}
        public void start(View view){
            Intent intent=new Intent(this,MyService.class);
            startService(intent);
            Toast.makeText(MainActivity.this,"启动服务",Toast.LENGTH_SHORT);

        }
        public void stop(View view){
            Intent intent=new Intent(this,MyService.class);
            stopService(intent);
            Toast.makeText(MainActivity.this,"停止服务",Toast.LENGTH_SHORT);
        }

    }

//        btn_bind=(Button)findViewById(R.id.bind);
//        btn_nobind=(Button)findViewById(R.id.nobind);
