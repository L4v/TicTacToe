package com.l4v.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class GameOverActivity extends AppCompatActivity {

    private TextView SplashScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);
        int Player = getIntent().getIntExtra("WINNER", 0);

        Log.d("GameOver", "Entered GameOverActivity");

        SplashScreen = findViewById(R.id.SplashScreen);

        SplashScreen.setTextColor(getResources().getColor(R.color.PlayerTextColor));
        SplashScreen.setTextSize(64.0f);

        if(Player > 0)
        {
            SplashScreen.setBackgroundColor(getResources().getColor(
                    Player == 1 ? R.color.PlayerOne : R.color.PlayerTwo
            ));
            SplashScreen.setText(getResources().getString(
                    Player == 1 ? R.string.PlayerOneWon : R.string.PlayerTwoWon));
        }
        else if(Player == 0)
        {
            SplashScreen.setBackgroundColor(getResources().getColor(R.color.Draw));
            SplashScreen.setText(getResources().getString(R.string.Draw));
        }
        else if(Player == -1)
        {
            SplashScreen.setBackgroundColor(getResources().getColor(R.color.Reset));
            SplashScreen.setText(getResources().getString(R.string.Reset));
        }

        Thread PauseThread = new Thread()
        {
            @Override
            public void run()
            {
                try
                {
                    sleep(2000);
                    Intent intent = new Intent(GameOverActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
                catch(Exception E)
                {
                    E.printStackTrace();
                }
            }
        };

        PauseThread.start();

    }
}
