package com.example.ms.rules;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;



public class Home extends AppCompatActivity
{

    Button Button3;
    Button Button9;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        addListenerOnButton3();
        addListenerOnButton9();
    }




    public void addListenerOnButton3()
    {

        final Context context = this;

        Button3 = findViewById(R.id.button3);

        Button3.setOnClickListener(new OnClickListener()
        {

            @Override
            public void onClick(View arg0)
            {
                Intent intent = new Intent(context, page2.class);
                startActivity(intent);

            }

        });

    }

    public void addListenerOnButton9()
    {

        final Context context = this;

        Button9 = findViewById(R.id.button9);

        Button9.setOnClickListener(new OnClickListener()
        {

            @Override
            public void onClick(View arg0)
            {
                Intent intent = new Intent(context, prohibitory.class);
                startActivity(intent);

            }

        });

    }
}

