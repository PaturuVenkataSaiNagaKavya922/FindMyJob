package com.example.findmyjob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;

public class RegAct1 extends AppCompatActivity {
    EditText un,mail,phno,pwd,cpwd,hd;
    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        un=findViewById(R.id.uname);
        mail = findViewById(R.id.email);
        phno=findViewById(R.id.num);
        pwd = findViewById(R.id.pwd);
        cpwd=findViewById(R.id.cpwd);
        hd=findViewById(R.id.highdeg);
        auth = FirebaseAuth.getInstance();
        if(auth.getCurrentUser()!=null)
        {
            startActivity(new Intent(this, RegAct1.class));
        }
    }

    public void Continue(View view)
    {
        Intent i = new Intent(this, RegAct1.class);
        startActivity(i);
    }
}
//RegAct1 -->RegAct2-->if once clicked registered it should navigate to the Home page.
//RegAct2 Contains Subfiles which again navigate to the RegAct2 layout once all details filled in them and saved,  where final registration occurs.