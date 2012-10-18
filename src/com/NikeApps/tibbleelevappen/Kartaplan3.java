package com.NikeApps.tibbleelevappen;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class Kartaplan3 extends Activity {
	
  /*  @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)  {
        if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
            // do something on back.
        	Intent meny2 = new Intent (Kartaplan3.this,Meny.class);
        	startActivity(meny2);
            return true;
        }

        return super.onKeyDown(keyCode, event);
       
    } */
    

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_kartaplan3);
        
        Button up3 = (Button)findViewById(R.id.up3);
        up3.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "Du är på sista plan!", Toast.LENGTH_SHORT).show();
				
			}
		});
        
        Button down3 = (Button)findViewById(R.id.down3);
        down3.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent down3 = new Intent(Kartaplan3.this,Kartaplan2.class);
				startActivity(down3);
			}
		});
        
        Button more = (Button) findViewById(R.id.button1);
        more.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);


                AlertDialog alertDialog = new AlertDialog.Builder(Kartaplan3.this).create();
                alertDialog.setTitle("Flygel 1");
                alertDialog.setMessage("Salar: 130, 131, 132, 133, 134, 135, 136 och 137.");

                alertDialog.setButton("Tillbaka...", new DialogInterface.OnClickListener() {
                   public void onClick(DialogInterface dialog, int which) {
                      // here you can add functions
                   }
                });

                alertDialog.show();  //<-- See This!
            }

        });
        
    }
}
   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_kartaplan3, menu);
        return true;
    } */

