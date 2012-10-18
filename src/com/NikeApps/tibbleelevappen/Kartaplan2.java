package com.NikeApps.tibbleelevappen;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class Kartaplan2 extends Activity {
	
 /*   @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)  {
        if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
            // do something on back.
        	Intent meny1 = new Intent (Kartaplan2.this,Meny.class);
        	startActivity(meny1);
            return true;
        }

        return super.onKeyDown(keyCode, event);
       
    } */

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_kartaplan2);
        
        Button up1 = (Button)findViewById(R.id.up1);
        up1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent up2 = new Intent(Kartaplan2.this,Kartaplan3.class);
				startActivity(up2);
				
			}
		});
        
        Button down1 = (Button)findViewById(R.id.down2);
        down1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent down2 = new Intent(Kartaplan2.this,Karta.class);
				startActivity(down2);
				
			}
		});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_kartaplan2, menu);
        return true;
    }
}
