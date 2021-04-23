package com.e.helloworld;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

//import android.renderscript.Sampler;
//import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;
//import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public int add = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        EditText Numb = findViewById(R.id.EditText);


        String txt=Numb.getText().toString();
        if(txt.isEmpty() || txt == null){
            Toast.makeText(getApplicationContext(),"Hello",Toast.LENGTH_LONG).show();
        }else{
             add = Integer.parseInt(txt);
        }



        FloatingActionButton fab = findViewById(R.id.fab);
        
        fab.setOnClickListener(
                view -> {Snackbar.make(view, "Increased by 1", Snackbar.LENGTH_LONG)
                .setAction("Action",null).show();
                    add = add + 1;
                    String result = String.valueOf(add) ;
                    Numb.setText(result);
                }
        );


    }


}