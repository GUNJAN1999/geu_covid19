package com.example.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class fourth extends AppCompatActivity {
    TextView tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        tv2=(TextView)findViewById(R.id.tv1);
        ListView l1=(ListView)findViewById(R.id.lv1);

        ArrayList<String> name=new ArrayList<>();
        name.add("ALMORA : 9411757084");
        name.add("BAGESHWAR : 9412052145");
        name.add("CHAMOLI : 9411525278");
        name.add("DEHRADUN : 9997908733");
        name.add("HARIDWAR : 7895280323");
        name.add("NANITAL : 9412344733");
        name.add("POHRI GARWAL : 97583992151");
        name.add("PITHORAHGARH : 9837972600");
        name.add("TEHRI : 9411362810");
        name.add("RUDRAPRAYAG : 9412325798");

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,name);
        l1.setAdapter(arrayAdapter);



    }
}
