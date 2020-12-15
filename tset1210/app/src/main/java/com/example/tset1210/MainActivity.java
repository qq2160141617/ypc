package com.example.tset1210;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView ypc;
    String[] A={"A","B","C"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ypc=findViewById(R.id.ypc);
        ArrayAdapter arrayAdapter=new ArrayAdapter(MainActivity.this,R.layout.yp,A);
        ypc.setAdapter(arrayAdapter);
        ypc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"你点了字母"+A[position],Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.y1:
                Toast.makeText(this, "你点了扫一扫", Toast.LENGTH_SHORT).show();
                break;
            case R.id.y2:
                Toast.makeText(this, "你点了扫一扫", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;

    }
}