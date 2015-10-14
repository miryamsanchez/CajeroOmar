package com.example.alumfial8.cajeroOmar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity {
    private EditText txtuser, txtclave;
    private Button button;
    String a, b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtuser = (EditText) findViewById(R.id.edtuser);
        txtclave = (EditText) findViewById(R.id.edtpass);
        button = (Button) findViewById(R.id.btnenviar);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),PrincipalActivity.class);
                startActivity(intent);


            }
        });
    }
}