package com.werapun.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvHello;
    private ImageView ivLogo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.werapun.helloworld.R.layout.activity_main);

        tvHello = findViewById(com.werapun.helloworld.R.id.tvHello);
        ivLogo = findViewById(com.werapun.helloworld.R.id.ivLogo);
        ivLogo.setVisibility( View.INVISIBLE );



        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Enjoy with me", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                tvHello.setText("     HELLO\n EVERYONE ");
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(com.werapun.helloworld.R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == com.werapun.helloworld.R.id.action_settings) {
            ivLogo.setVisibility( View.VISIBLE );
            System.out.println( ivLogo.isEnabled() );
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void toDetail (View view){
        Intent intent = new Intent(this,DetailMain.class);
        startActivity(intent);
    }
    public void toGallery (View view){
        Intent intent2 = new Intent(this,Gallery.class);
        startActivity(intent2);
    }

}
