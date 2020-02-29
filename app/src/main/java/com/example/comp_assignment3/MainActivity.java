package com.example.comp_assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;



public class MainActivity extends AppCompatActivity {
    public int lines = 0;
    Button save_button;
    EditText note_txt;
    LinearLayout saved, original;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        note_txt = findViewById(R.id.noteTxt);
        save_button = findViewById(R.id.Save);
        original = findViewById(R.id.linearLayout);
        saved = findViewById(R.id.linearLayout2);


        save_button.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                EditText et = new EditText(MainActivity.super.getBaseContext());

                LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                et.setLayoutParams(p);
                et.setText(note_txt.getText());
                et.setId(lines + 1);
                et.setImeOptions(EditorInfo.IME_ACTION_DONE);
                saved.addView(et);
                lines++;
            }
        });

    }
}