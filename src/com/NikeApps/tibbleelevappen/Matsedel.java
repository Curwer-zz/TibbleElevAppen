package com.NikeApps.tibbleelevappen;



import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;


public class Matsedel extends Activity {
	
	WebView browser;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
     // find the WebView by name in the main.xml of step 2
        browser=(WebView)findViewById(R.id.webView1);
        
        // Enable javascript
        browser.getSettings().setJavaScriptEnabled(true);  
        
        // load a webpage
        browser.loadUrl("http://news.google.com/");
  
        //("http://www.amica.se/m/tibblegymnasium");
        
       
    }
    

  /*  @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_matsedel, menu);
        return true;
    } */
}
