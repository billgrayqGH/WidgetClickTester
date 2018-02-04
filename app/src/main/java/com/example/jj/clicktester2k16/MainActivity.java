package com.example.jj.clicktester2k16;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener, OnLongClickListener{

    View view;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set click and long-click listeners

        View redbox = findViewById(R.id.redbox);
        redbox.setOnClickListener(this);
        redbox.setOnLongClickListener(this);

        View greenbox = findViewById(R.id.greenbox);
        greenbox.setOnClickListener(this);
        greenbox.setOnLongClickListener(this);

        View yellowbox = findViewById(R.id.yellowbox);
        yellowbox.setOnClickListener(this);
        yellowbox.setOnLongClickListener(this);

        View bluebox = findViewById(R.id.bluebox);
        bluebox.setOnClickListener(this);
        bluebox.setOnLongClickListener(this);

        View button = findViewById(R.id.button);
        button.setOnClickListener(new OnClickListener() {
            @Override
                public void onClick(View v){
                    finish();
                    System.exit(0);
}});}

    // Handle short clicks

    public void onClick(View v) {
        String whichOne = whichWidget(v);
        Toast.makeText(this, getString(R.string.shortClick) + " "+whichOne,
                Toast.LENGTH_SHORT).show();
    }

    // Handle long clicks

    public boolean onLongClick(View v) {
        String whichOne = whichWidget(v);
        Toast.makeText(this, getString(R.string.longClick) +" "+ whichOne,
                Toast.LENGTH_SHORT).show();
        return true;
    }

    // Method to determine which widget was pressed
    private String whichWidget(View v){
        String whichOne = "";

        switch(v.getId()){
            case R.id.redbox:
                whichOne = getString(R.string.redStr);
                break;
            case R.id.greenbox:
                whichOne = getString(R.string.greenStr);
                break;
            case R.id.yellowbox:
                whichOne = getString(R.string.yellowStr);
                break;
            case R.id.bluebox:
                whichOne = getString(R.string.blueStr);
                break;
        }
        return whichOne;
    }
}
