package com.tonyn.youqiu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    private EditText createUsername;
    private EditText createPassword;
    private EditText createEmail;
    private EditText createPhoneNumber;
    private Button create;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        create = (Button) findViewById(R.id.create_username_button);
        createUsername = (EditText) findViewById(R.id.create_username);
        createPassword = (EditText) findViewById(R.id.create_password);
        createEmail = (EditText) findViewById(R.id.create_mail);
        createPhoneNumber = (EditText) findViewById(R.id.create_phonenumber);
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //注册逻辑
                Intent intent = new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
