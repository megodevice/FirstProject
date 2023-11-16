package com.geeks.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mainButton = findViewById(R.id.main_button);
        EditText editText = findViewById(R.id.edit_text);
        TextView textView = findViewById(R.id.text_view);
        //String message = new String();
        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = editText.getText().toString();
                if (!message.isEmpty()) textView.setText(message);
                else textView.setText("Текст пустой");
            }
        });
    }


}