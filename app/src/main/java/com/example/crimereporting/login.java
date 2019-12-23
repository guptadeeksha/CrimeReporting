package com.example.crimereporting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity {
TextView t1,t2;
EditText e1,e2;
Databasehelper ds;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        e1=findViewById(R.id.user);
        e2=findViewById(R.id.password);
        final Button Login = findViewById(R.id.login);
        ds=new Databasehelper(this);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                SharedPreferences pref = getSharedPreferences("personal", MODE_PRIVATE);
                String user=pref.getString("username","No name defined");
                String pass=pref.getString("password","No name");
                String z = ds.login(s1, s2);
                if (s2.equals(z)) {
                    Toast.makeText(getApplicationContext(), "Login succesful", Toast.LENGTH_LONG).show();
                    logging.onClick(Login);
                } else {
                    Toast.makeText(getApplicationContext(), "User not registered", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void logging(View view) {
    }

    private View.OnClickListener logging= new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent1;
            intent1 =new Intent(login.this, Middle.class);
            startActivity(intent1);
        }
    };


}
