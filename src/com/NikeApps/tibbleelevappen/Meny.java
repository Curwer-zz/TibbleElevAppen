package com.NikeApps.tibbleelevappen;

import java.util.Calendar;



import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Meny extends Activity {
	
   @Override
   public boolean onKeyDown(int keyCode, KeyEvent event)  {
       if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
           // do something on back.
    	   finish();
           return true;
       }

       return super.onKeyDown(keyCode, event);
      
   }
	

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        //new GregorianCalendar().get(Calendar.WEEK_OF_YEAR);
        
        final MediaPlayer buttonschema = MediaPlayer.create (this, R.raw.buttonclick);
        
        Calendar calendar = Calendar.getInstance();
        int week = calendar.get(Calendar.WEEK_OF_YEAR);

        TextView footer = (TextView) findViewById(R.id.Week);
        footer.setText("Vecka " + week);
        
        Button schema = (Button) findViewById(R.id.schema);
        schema.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				buttonschema.start();
				Intent schema = new Intent(Meny.this,Schema.class);
				startActivity(schema);
				
				
			}
		});
        
        /*Button news = (Button) findViewById(R.id.news);
        news.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				buttonschema.start();
				Intent news = new Intent(Meny.this,RSS_nyheter.class);
				startActivity(news);
			}
        });*/
        
        Button karta = (Button) findViewById(R.id.karta);
        karta.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				buttonschema.start();
				Intent karta = new Intent(Meny.this,Karta.class);
				startActivity(karta);
				
			}
        });
       
        
        Button matsedel = (Button) findViewById(R.id.matsedel);
        matsedel.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				buttonschema.start();
				Intent amica = new Intent(Meny.this,Amica.class);
				startActivity(amica);
			
				
			}
			
        });
        
        Button school = (Button) findViewById(R.id.SchoolSoft);
        school.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				buttonschema.start();
				Intent Schoolsoft = new Intent(Meny.this,SchoolSoft.class);
				startActivity(Schoolsoft);
				/*Uri uriUrl1 = Uri.parse("https://sms3.schoolsoft.se/tibble/jsp/pda/Login.jsp");
		        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl1);
		        startActivity(launchBrowser);*/

				
			}
		});
        	
        
			}   	
    
		
        

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_om, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
    	switch (item.getItemId()) {
        case R.id.menu_settings:
        startActivity(new Intent(this, Om.class));
        return true;
        default:
        return super.onOptionsItemSelected(item);
    }
        
    }
}


//Sounds for buttons found here: 