package com.example.calebnelson.hackingedu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.calebnelson.hackingedu.GEN";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startGame(View view) {
        int tag = (int) view.getTag();
        Intent intent = new Intent(this, GameActivity.class);
        switch (tag){
            case 1:
                intent.putExtra(EXTRA_MESSAGE, "Gen 1");
                break;
            case 2:
                intent.putExtra(EXTRA_MESSAGE, "Gen 2");
                break;
            case 3:
                intent.putExtra(EXTRA_MESSAGE, "Gen 3");
                break;
            case 4:
                intent.putExtra(EXTRA_MESSAGE, "Gen 4");
                break;
            case 5:
                intent.putExtra(EXTRA_MESSAGE, "Gen 5");
                break;
            case 6:
                intent.putExtra(EXTRA_MESSAGE, "Gen 6");
                break;
            default:
                intent.putExtra(EXTRA_MESSAGE, "All Gens");
                break;
        }
        startActivity(intent);
    }
}
