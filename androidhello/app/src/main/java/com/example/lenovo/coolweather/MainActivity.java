package com.example.lenovo.coolweather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {

    private  String[] data ={ "北京","浙江","orange","watermelon","pear","grap",
            "pineapple", "strawberry","cherry","Mengo"};
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> adapter =new ArrayAdapter<String>(
                MainActivity.this,android.R.layout.simple_list_item_1, data
        );
        ListView listView =(ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}