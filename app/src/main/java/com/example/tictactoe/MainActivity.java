package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // Holds the states of the buttons
    private int[] ButtonStates;
    private Button[] Buttons;
    private int CurrentButtonIndex;
    private int[] Colors;
    private boolean PlayerOneTurn;
    private char PlayerChars[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButtonStates = new int[9];
        Buttons = new Button[9];
        Colors = new int[3];

        Buttons[0] = findViewById(R.id.btn00);
        Buttons[1] = findViewById(R.id.btn01);
        Buttons[2] = findViewById(R.id.btn02);
        Buttons[3] = findViewById(R.id.btn10);
        Buttons[4] = findViewById(R.id.btn11);
        Buttons[5] = findViewById(R.id.btn12);
        Buttons[6] = findViewById(R.id.btn20);
        Buttons[7] = findViewById(R.id.btn21);
        Buttons[8] = findViewById(R.id.btn22);

        Colors[0] = getResources().getColor(R.color.Idle);
        Colors[1] = getResources().getColor(R.color.PlayerOne);
        Colors[2] = getResources().getColor(R.color.PlayerTwo);

        PlayerOneTurn = true;

        // NOTE(l4v): Initializing values
        for(int i = 0; i < 9; ++i)
        {
            ButtonStates[i] = 0;
            Buttons[i].setBackgroundColor(Colors[0]);
            Buttons[i].setTextColor(getResources().getColor(R.color.PlayerTextColor));
            Buttons[i].setTextSize(32.0f);
        }
        // TODO(l4v): Add own onclick listener so it can be indexed through the for loop

        Buttons[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ButtonStates[0] == 0)
                {
                    Buttons[0].setBackgroundColor(
                            PlayerOneTurn ? getResources().getColor(R.color.PlayerOne)
                                    : getResources().getColor(R.color.PlayerTwo));
                    Buttons[0].setText(PlayerOneTurn ? getResources().getString(R.string.XField)
                            : getResources().getString(R.string.OField));
                    ButtonStates[0] = PlayerOneTurn ? 1 : 2;
                    PlayerOneTurn = !PlayerOneTurn;
                }
            }
        });
        Buttons[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ButtonStates[1] == 0)
                {
                    Buttons[1].setBackgroundColor(
                            PlayerOneTurn ? getResources().getColor(R.color.PlayerOne)
                                    : getResources().getColor(R.color.PlayerTwo));
                    Buttons[1].setText(PlayerOneTurn ? getResources().getString(R.string.XField)
                            : getResources().getString(R.string.OField));
                    ButtonStates[1] = PlayerOneTurn ? 1 : 2;
                    PlayerOneTurn = !PlayerOneTurn;
                }
            }
        });
        Buttons[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ButtonStates[2] == 0)
                {
                    Buttons[2].setBackgroundColor(
                            PlayerOneTurn ? getResources().getColor(R.color.PlayerOne)
                                    : getResources().getColor(R.color.PlayerTwo));
                    Buttons[2].setText(PlayerOneTurn ? getResources().getString(R.string.XField)
                            : getResources().getString(R.string.OField));
                    ButtonStates[2] = PlayerOneTurn ? 1 : 2;
                    PlayerOneTurn = !PlayerOneTurn;
                }
            }
        });
        Buttons[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ButtonStates[3] == 0)
                {
                    Buttons[3].setBackgroundColor(
                            PlayerOneTurn ? getResources().getColor(R.color.PlayerOne)
                                    : getResources().getColor(R.color.PlayerTwo));
                    Buttons[3].setText(PlayerOneTurn ? getResources().getString(R.string.XField)
                            : getResources().getString(R.string.OField));
                    ButtonStates[3] = PlayerOneTurn ? 1 : 2;
                    PlayerOneTurn = !PlayerOneTurn;
                }
            }
        });
        Buttons[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ButtonStates[4] == 0)
                {
                    Buttons[4].setBackgroundColor(
                            PlayerOneTurn ? getResources().getColor(R.color.PlayerOne)
                                    : getResources().getColor(R.color.PlayerTwo));
                    Buttons[4].setText(PlayerOneTurn ? getResources().getString(R.string.XField)
                            : getResources().getString(R.string.OField));
                    ButtonStates[4] = PlayerOneTurn ? 1 : 2;
                    PlayerOneTurn = !PlayerOneTurn;
                }
            }
        });
        Buttons[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ButtonStates[5] == 0)
                {
                    Buttons[5].setBackgroundColor(
                            PlayerOneTurn ? getResources().getColor(R.color.PlayerOne)
                                    : getResources().getColor(R.color.PlayerTwo));
                    Buttons[5].setText(PlayerOneTurn ? getResources().getString(R.string.XField)
                            : getResources().getString(R.string.OField));
                    ButtonStates[5] = PlayerOneTurn ? 1 : 2;
                    PlayerOneTurn = !PlayerOneTurn;
                }
            }
        });
        Buttons[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ButtonStates[6] == 0)
                {
                    Buttons[6].setBackgroundColor(
                            PlayerOneTurn ? getResources().getColor(R.color.PlayerOne)
                                    : getResources().getColor(R.color.PlayerTwo));
                    Buttons[6].setText(PlayerOneTurn ? getResources().getString(R.string.XField)
                            : getResources().getString(R.string.OField));
                    ButtonStates[6] = PlayerOneTurn ? 1 : 2;
                    PlayerOneTurn = !PlayerOneTurn;
                }
            }
        });
        Buttons[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ButtonStates[7] == 0)
                {
                    Buttons[7].setBackgroundColor(
                            PlayerOneTurn ? getResources().getColor(R.color.PlayerOne)
                                    : getResources().getColor(R.color.PlayerTwo));
                    Buttons[7].setText(PlayerOneTurn ? getResources().getString(R.string.XField)
                            : getResources().getString(R.string.OField));
                    ButtonStates[7] = PlayerOneTurn ? 1 : 2;
                    PlayerOneTurn = !PlayerOneTurn;
                }
            }
        });
        Buttons[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ButtonStates[8] == 0)
                {
                    Buttons[8].setBackgroundColor(
                            PlayerOneTurn ? getResources().getColor(R.color.PlayerOne)
                                    : getResources().getColor(R.color.PlayerTwo));
                    Buttons[8].setText(PlayerOneTurn ? getResources().getString(R.string.XField)
                            : getResources().getString(R.string.OField));
                    ButtonStates[8] = PlayerOneTurn ? 1 : 2;
                    PlayerOneTurn = !PlayerOneTurn;
                }
            }
        });

    }
}
