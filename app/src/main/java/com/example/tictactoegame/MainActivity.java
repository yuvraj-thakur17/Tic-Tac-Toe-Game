package com.example.tictactoegame;

//import androidx.appcompat.app.AppCompatActivity;
//
//import android.app.Dialog;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.ImageView;
//import android.widget.LinearLayout;
//import android.widget.TextView;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class MainActivity extends AppCompatActivity {
//
//    private final List<int[]> combinationsList = new ArrayList<>();
//
//    private int[] boxPosition = {0, 0, 0, 0, 0, 0, 0, 0, 0};
//
//    private int playerTurn = 1;
//
//    private int totalSelectedBoxes = 1;
//
//    private LinearLayout playerOneLayout, playerTwoLayout;
//
//    private TextView playerOneName, playerTwoName;
//
//    private ImageView Image1, Image2, Image3, Image4, Image5, Image6, Image7, Image8, Image9;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        playerOneName = findViewById(R.id.playerOneNameMainActivity);
//        playerTwoName = findViewById(R.id.playerTwoNameMainActivity);
//
//        playerOneLayout = findViewById(R.id.playerOneLayout);
//        playerTwoLayout = findViewById(R.id.playerTwoLayout);
//
//        Image1 = findViewById(R.id.image1);
//        Image2 = findViewById(R.id.image2);
//        Image3 = findViewById(R.id.image3);
//        Image4 = findViewById(R.id.image4);
//        Image5 = findViewById(R.id.image5);
//        Image6 = findViewById(R.id.image6);
//        Image7 = findViewById(R.id.image7);
//        Image8 = findViewById(R.id.image8);
//        Image9 = findViewById(R.id.image9);
//
//        combinationsList.add(new int[]{0, 1, 2});
//        combinationsList.add(new int[]{3, 4, 5});
//        combinationsList.add(new int[]{6, 7, 8});
//        combinationsList.add(new int[]{0, 3, 6});
//        combinationsList.add(new int[]{1, 4, 7});
//        combinationsList.add(new int[]{2, 5, 8});
//        combinationsList.add(new int[]{2, 4, 6});
//        combinationsList.add(new int[]{0, 4, 8});
//
//        final String getPlayerOneName = getIntent().getStringExtra("playerOne");
//        final String getPlayerTwoName = getIntent().getStringExtra("playerTwo");
//
//        playerOneName.setText(getPlayerOneName);
//        playerOneName.setText(getPlayerTwoName);
//
//        Image1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (isBlockSelectable(0)) {
//                    performAction((ImageView) view, 0);
//                }
//            }
//        });
//
//        Image2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (isBlockSelectable(1)) {
//                    performAction((ImageView) view, 1);
//                }
//            }
//        });
//
//        Image3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (isBlockSelectable(2)) {
//                    performAction((ImageView) view, 2);
//                }
//
//            }
//        });
//
//        Image4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (isBlockSelectable(3)) {
//                    performAction((ImageView) view, 3);
//                }
//
//            }
//        });
//
//        Image5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (isBlockSelectable(4)) {
//                    performAction((ImageView) view, 4);
//                }
//
//            }
//        });
//
//        Image6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (isBlockSelectable(5)) {
//                    performAction((ImageView) view, 5);
//                }
//
//            }
//        });
//
//        Image7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (isBlockSelectable(6)) {
//                    performAction((ImageView) view, 6);
//                }
//
//            }
//        });
//
//        Image8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (isBlockSelectable(7)) {
//                    performAction((ImageView) view, 7);
//                }
//
//            }
//        });
//
//        Image9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (isBlockSelectable(8)) {
//                    performAction((ImageView) view, 8);
//                }
//
//            }
//        });
//
////        playerOneLayout.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////
////            }
////        });
////
////        playerTwoLayout.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////
////            }
////        });
//
//
//    }
//
//    private void performAction(ImageView imageView, int selectedBoxPosition) {
//
//        boxPosition[selectedBoxPosition] = playerTurn;
//
//        if (playerTurn == 1) {
//            imageView.setImageResource(R.drawable.close);
//
//            if (checkPlayerWin()) {
//                WinDialog winDialog = new WinDialog(MainActivity.this, playerOneName.getText().toString() + "has won the match", MainActivity.this);
//                winDialog.setCancelable(false);
//                winDialog.show();
//            } else if (totalSelectedBoxes == 9) {
//                WinDialog winDialog = new WinDialog(MainActivity.this, "It's a draw", MainActivity.this);
//                winDialog.setCancelable(false);
//                winDialog.show();
//            } else {
//                changePlayerTurn(2);
//                totalSelectedBoxes++;
//            }
//        } else {
//            imageView.setImageResource(R.drawable.circle);
//
//            if (checkPlayerWin()) {
//                WinDialog winDialog = new WinDialog(MainActivity.this, playerTwoName.getText().toString() + "has won the match", MainActivity.this);
//                winDialog.setCancelable(false);
//                winDialog.show();
//            } else if (selectedBoxPosition == 9) {
//                WinDialog winDialog = new WinDialog(MainActivity.this, "It's a draw", MainActivity.this);
//                winDialog.setCancelable(false);
//                winDialog.show();
//            } else {
//                changePlayerTurn(1);
//                totalSelectedBoxes++;
//            }
//        }
//
//    }
//
//    private void changePlayerTurn(int currentPlayerTurn) {
//        playerTurn = currentPlayerTurn;
//        if (playerTurn == 1) {
//            playerOneLayout.setBackgroundResource(R.drawable.round_back_blue_border);
//            playerTwoLayout.setBackgroundResource(R.drawable.round_back_blue_border);
//        } else {
//            playerTwoLayout.setBackgroundResource(R.drawable.round_back_blue_border);
//            playerOneLayout.setBackgroundResource(R.drawable.round_back_blue_border);
//        }
//    }
//
//    private boolean checkPlayerWin() {
//        boolean response = false;
//
//        for (int i = 0; i < combinationsList.size(); i++) {
//            final int[] combination = combinationsList.get(i);
//            if (boxPosition[combination[0]] == playerTurn && boxPosition[combination[1]] == playerTurn && boxPosition[combination[2]] == playerTurn) {
//                response = true;
//            }
//        }
//
//        return response;
//    }
//
//    private boolean isBlockSelectable(int boxposition) {
//
//        boolean response = false;
//
//        if (boxPosition[boxposition] == 0) {
//            response = true;
//        }
//
//        return response;
//
//    }
//
//    public void restartMatch() {
//        boxPosition = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
//        playerTurn = 1;
//        totalSelectedBoxes = 1;
//        Image1.setImageResource(R.drawable.transparent_back);
//        Image2.setImageResource(R.drawable.transparent_back);
//        Image3.setImageResource(R.drawable.transparent_back);
//        Image4.setImageResource(R.drawable.transparent_back);
//        Image5.setImageResource(R.drawable.transparent_back);
//        Image6.setImageResource(R.drawable.transparent_back);
//        Image7.setImageResource(R.drawable.transparent_back);
//        Image8.setImageResource(R.drawable.transparent_back);
//        Image9.setImageResource(R.drawable.transparent_back);
//    }
//
//}

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // Initialize combinations to check user win
    private final List<int[]> combinationsList = new ArrayList<>();

    // every box position will be acquired by either Player One or Player Two
    private int[] boxPositions = {0, 0, 0, 0, 0, 0, 0, 0, 0};

    // playerTurn = 1 means Player One is turn and playerTurn = 2 means Player Two is turn
    private int playerTurn = 1;

    // total selected boxes either by Player One or Player Two
    private int totalSelectedBoxes = 1;

    private LinearLayout player1Layout, player2Layout;
    private ImageView image1, image2, image3, image4, image5, image6, image7, image8, image9;
    private TextView player1Name, player2Name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize widgets from activity_main.xml file
        player1Layout = findViewById(R.id.player1Layout);
        player2Layout = findViewById(R.id.player2Layout);
        player1Name = findViewById(R.id.player1TV);
        player2Name = findViewById(R.id.player2TV);
        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        image3 = findViewById(R.id.image3);
        image4 = findViewById(R.id.image4);
        image5 = findViewById(R.id.image5);
        image6 = findViewById(R.id.image6);
        image7 = findViewById(R.id.image7);
        image8 = findViewById(R.id.image8);
        image9 = findViewById(R.id.image9);

        // add all possible winning combinations to List
        combinationsList.add(new int[]{0, 1, 2});
        combinationsList.add(new int[]{3, 4, 5});
        combinationsList.add(new int[]{6, 7, 8});
        combinationsList.add(new int[]{0, 3, 6});
        combinationsList.add(new int[]{1, 4, 7});
        combinationsList.add(new int[]{2, 5, 8});
        combinationsList.add(new int[]{2, 4, 6});
        combinationsList.add(new int[]{0, 4, 8});

        // Get Player Names from AddPlayers.java activity via intent
        final String playerOneName = getIntent().getStringExtra("playerOne");
        final String playerTwoName = getIntent().getStringExtra("playerTwo");

        // Set Player Names to TextViews
        player1Name.setText(playerOneName);
        player2Name.setText(playerTwoName);

        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // check if this box is not selected before neither Player One or player Two
                if (isBoxSelectable(0)) {

                    // convert View To ImageView
                    performAction((ImageView) v, 0);
                }
            }
        });
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // check if this box is not selected before neither Player One or player Two
                if (isBoxSelectable(1)) {

                    // convert View To ImageView
                    performAction((ImageView) v, 1);
                }
            }
        });
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // check if this box is not selected before neither Player One or player Two
                if (isBoxSelectable(2)) {

                    // convert View To ImageView
                    performAction((ImageView) v, 2);
                }
            }
        });
        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // check if this box is not selected before neither Player One or player Two
                if (isBoxSelectable(3)) {

                    // convert View To ImageView
                    performAction((ImageView) v, 3);
                }
            }
        });
        image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // check if this box is not selected before neither Player One or player Two
                if (isBoxSelectable(4)) {

                    // convert View To ImageView
                    performAction((ImageView) v, 4);
                }
            }
        });
        image6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // check if this box is not selected before neither Player One or player Two
                if (isBoxSelectable(5)) {

                    // convert View To ImageView
                    performAction((ImageView) v, 5);
                }
            }
        });
        image7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // check if this box is not selected before neither Player One or player Two
                if (isBoxSelectable(6)) {

                    // convert View To ImageView
                    performAction((ImageView) v, 6);
                }
            }
        });
        image8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // check if this box is not selected before neither Player One or player Two
                if (isBoxSelectable(7)) {

                    // convert View To ImageView
                    performAction((ImageView) v, 7);
                }
            }
        });
        image9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // check if this box is not selected before neither Player One or player Two
                if (isBoxSelectable(8)) {

                    // convert View To ImageView
                    performAction((ImageView) v, 8);
                }
            }
        });
    }

    /**
     * @param imageView           image box on which we are going to set cross or zero image according to player turn
     * @param selectedBoxPosition user selected box position to make this box non selectable again
     */
    private void performAction(ImageView imageView, int selectedBoxPosition) {

        // acquire box position by player who's turn (either 1 or 2)
        boxPositions[selectedBoxPosition] = playerTurn;

        // Check if its Player One is turn then set cross image to ImageView else set zero to ImageView
        if (playerTurn == 1) {
            imageView.setImageResource(R.drawable.cross_icon);

            // checkPlayerWin function will return true if Player One win
            if (checkPlayerWin()) {

                // show win dialog with a message along with winner name
                final WinDialog winDialog = new WinDialog(MainActivity.this, player1Name.getText().toString() + " has won the game");
                winDialog.show();
            } else if (totalSelectedBoxes == 9) { // over this game if there is no box left to be select

                // show win dialog with 'draw' message
                final WinDialog winDialog = new WinDialog(MainActivity.this, "It is a Draw!");
                winDialog.show();

            } else {

                // set Player Two as next turn
                changePlayerTurn(2);
                totalSelectedBoxes++;
            }

        } else {
            imageView.setImageResource(R.drawable.zero_icon);

            // checkPlayerWin function will return true if Player Two win
            if (checkPlayerWin()) {

                // show win dialog with a message
                final WinDialog winDialog = new WinDialog(MainActivity.this, player2Name.getText().toString() + " has won the game");
                winDialog.setCancelable(false);
                winDialog.show();
            } else if (totalSelectedBoxes == 9) { // over this game if there is no box left to be select

                // show win dialog with 'draw' message
                final WinDialog winDialog = new WinDialog(MainActivity.this, "It is a Draw!");
                winDialog.setCancelable(false);
                winDialog.show();

            } else {
                // set Player One as next turn
                changePlayerTurn(1);
                totalSelectedBoxes++;
            }

        }
    }

    /**
     * @param currentPlayerTurn new player's turn either 1 or 2
     */
    private void changePlayerTurn(int currentPlayerTurn) {

        // select other player.
        playerTurn = currentPlayerTurn;

        //Change Layout Design according to selected player
        if (playerTurn == 1) {
            player1Layout.setBackgroundResource(R.drawable.round_back_dark_blue_stroke20); // select Player One
            player2Layout.setBackgroundResource(R.drawable.round_back_dark_blue20); // deSelect Player Two
        } else {
            player2Layout.setBackgroundResource(R.drawable.round_back_dark_blue_stroke20); // select Player Two
            player1Layout.setBackgroundResource(R.drawable.round_back_dark_blue20); // deSelect Player One
        }
    }

    /**
     * @param boxPosition current selected box position
     */
    private boolean isBoxSelectable(int boxPosition) {
        boolean response = false;

        if (boxPositions[boxPosition] == 0) {
            response = true;
        }

        return response;
    }

    private boolean checkPlayerWin() {

        boolean response = false;
        for (int i = 0; i < combinationsList.size(); i++) {

            final int[] combination = combinationsList.get(i);

            if (boxPositions[combination[0]] == playerTurn && boxPositions[combination[1]] == playerTurn && boxPositions[combination[2]] == playerTurn) {
                response = true;
            }
        }
        return response;
    }

    public void startMatchAgain() {

        // reset all boxes positions which acquired by players in previous match
        boxPositions = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};

        // set Player One as first turn
        playerTurn = 1;

        totalSelectedBoxes = 1;

        // set empty transparent image to Every Box
        image1.setImageResource(R.drawable.transparent_back);
        image2.setImageResource(R.drawable.transparent_back);
        image3.setImageResource(R.drawable.transparent_back);
        image4.setImageResource(R.drawable.transparent_back);
        image5.setImageResource(R.drawable.transparent_back);
        image6.setImageResource(R.drawable.transparent_back);
        image7.setImageResource(R.drawable.transparent_back);
        image8.setImageResource(R.drawable.transparent_back);
        image9.setImageResource(R.drawable.transparent_back);

    }
}