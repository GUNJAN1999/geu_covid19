package com.example.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class third extends AppCompatActivity {
        TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        tv1=(TextView)findViewById(R.id.tv1);
        tv1.setText("Wash your hands frequently for at least 20 seconds at a time with warm water and soap. How long is 20 seconds? About as long as it takes to sing your “ABCs.”\n" +
                "Don’t touch your face, eyes, nose, or mouth when your hands are dirty.\n" +
                "Don’t go out if you’re feeling sick or have any cold or flu symptoms.\n" +
                "Stay at least 3 feetTrusted Source (1 meter) away from anyone who is coughing or sneezing.\n" +
                "Cover your mouth with the inside of your elbow whenever you sneeze or cough. Throw away any tissues you use right away.\n" +
                "Clean any objects you touch a lot. Use disinfectants on objects like phones, computers, utensils, dishware, and doorknobs.");



    }
}
