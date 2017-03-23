package com.zhoujian.task.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.zhoujian.task.R;
import com.zhoujian.task.service.MyService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(MainActivity.this, MyService.class);
        startService(intent);
        Toast.makeText(this, "提交代码", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "提交代码", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "提交代码", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "提交代码", Toast.LENGTH_SHORT).show();


    }
}
