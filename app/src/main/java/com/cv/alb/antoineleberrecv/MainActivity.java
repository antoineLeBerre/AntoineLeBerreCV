package com.cv.alb.antoineleberrecv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    Button competence;
    Button projet;
    Button cv;
    Button contact;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        competence = (Button)findViewById(R.id.competence);
        projet = (Button)findViewById(R.id.project);
        cv = (Button)findViewById(R.id.cv);
        contact = (Button)findViewById(R.id.contact);

        competence.setOnClickListener(this);
        projet.setOnClickListener(this);
        cv.setOnClickListener(this);
        contact.setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {
        Intent i1;
        switch (view.getId()){
            case R.id.competence:
                i1 = new Intent(this, Competence.class);
                startActivity(i1);
                break;
            case R.id.project:
                i1 = new Intent(this, Projet.class);
                startActivity(i1);
                break;
            case R.id.cv:
                i1 = new Intent(this, CV.class);
                startActivity(i1);
                break;
            case R.id.contact:
                i1 = new Intent(this, Contact.class);
                startActivity(i1);
                break;
        }
    }
}
