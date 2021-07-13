package com.example.tictactoegame;

//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.Toast;
//
//public class AddPlayer extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_add_player);
//
//        final EditText playerOne = findViewById(R.id.playerOneName);
//        final EditText playerTwo = findViewById(R.id.playerTwoName);
//        final Button startButton = findViewById(R.id.startGameButton);
//
//
//        startButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                final String getPlayerOneName = playerOne.getText().toString();
//                final String getPlayerTwoName = playerTwo.getText().toString();
//
//                if (getPlayerOneName.isEmpty() || getPlayerTwoName.isEmpty()){
//                    Toast.makeText(AddPlayer.this, "Please enter player name", Toast.LENGTH_SHORT).show();
//                }else {
//                    Intent intent = new Intent(AddPlayer.this,MainActivity.class);
//                    intent.putExtra("playerOne",getPlayerOneName);
//                    intent.putExtra("playerTwo",getPlayerTwoName);
//                    startActivity(intent);
//                }
//            }
//        });
//
//
//    }
//}

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class AddPlayers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_players);

        // Initialize widgets from activity_add_players
        final EditText playerOne = findViewById(R.id.playerOne);
        final EditText playerTwo = findViewById(R.id.playerTwo);
        final AppCompatButton startBtn = findViewById(R.id.startGameBtn);

        // Click listener when user press Start Game Button
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Get Values of players from EditText to a String Variables
                final String playerOneName = playerOne.getText().toString();
                final String playerTwoName = playerTwo.getText().toString();

                // Check if user not entered Player Names
                if (playerOneName.isEmpty() || playerTwoName.isEmpty()) {
                    Toast.makeText(AddPlayers.this, "Please enter player name", Toast.LENGTH_SHORT).show();
                } else {

                    // Create Object of Intent class to Open GameView Screen (MainActivity.java)
                    Intent intent = new Intent(AddPlayers.this, MainActivity.class);

                    // put both players names along with intent
                    intent.putExtra("playerOne", playerOneName);
                    intent.putExtra("playerTwo", playerTwoName);

                    // open MainActivity.java Activity
                    startActivity(intent);
                }
            }
        });
    }
}