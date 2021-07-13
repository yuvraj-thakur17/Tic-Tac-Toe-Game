package com.example.tictactoegame;

//import android.app.Dialog;
//import android.content.Context;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//
//public class WinDialog extends Dialog {
//
//    private final String message;
//    private final MainActivity mainActivity;
//
//
//    public WinDialog(@NonNull Context context,String message, MainActivity mainActivity) {
//        super(context);
//
//        this.message = message;
//        this.mainActivity = mainActivity;
//    }
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState){
//        super.onCreate(savedInstanceState);
//
//        setContentView(R.layout.win_dialog_layout);
//
//        final TextView messageText = findViewById(R.id.messageText);
//        final Button startAgainBtn = findViewById(R.id.startAgainBtn);
//
//        messageText.setText(message);
//
//        startAgainBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                mainActivity.restartMatch();
//                dismiss();
//            }
//        });
//
//    }
//}

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;

public class WinDialog extends Dialog {

    private final String message;
    private final MainActivity mainActivity;

    public WinDialog(@NonNull Context context, String message) {
        super(context);
        this.message = message;
        this.mainActivity = (MainActivity) context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.win_dialog_layout);

        final TextView msgTextView = findViewById(R.id.msgTextView);
        final AppCompatButton startAgainBtn = findViewById(R.id.startAgainBtn);

        msgTextView.setText(message);

        startAgainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.startMatchAgain();
                dismiss();
            }
        });
    }
}
