package com.example.login;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().setTitle("Login Form");
        TextView reg = (TextView)findViewById(R.id.registerPage);
        String text = "Don't have a account? REGISTER";
        SpannableString ss = new SpannableString(text);

        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View view) {
                startActivity(new Intent(getApplicationContext(),Signup.class));
            }
        };
        ss.setSpan(clickableSpan,22,30, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        reg.setText(ss);
        reg.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void btn_mainActivity(View view) {
        startActivity(new Intent(getApplicationContext(),MainActivity.class));
    }


}
