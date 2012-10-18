package com.NikeApps.tibbleelevappen;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class Karta extends Activity {
	
	

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_karta);
        
        Button down = (Button)findViewById(R.id.button_bown);
        down.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Toast.makeText(getApplicationContext(), "Du är redan på första plan!", Toast.LENGTH_SHORT).show();
				
			}
		});
        
        Button up = (Button)findViewById(R.id.button_up);
        up.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent karta2 = new Intent(Karta.this,Kartaplan2.class);
				startActivity(karta2);
				
			}
		});
    }

  /*  @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_karta, menu);
        return true;
    } */
}
