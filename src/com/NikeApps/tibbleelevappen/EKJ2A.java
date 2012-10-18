package com.NikeApps.tibbleelevappen;



import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class EKJ2A extends Activity {
	
	final Activity activity = this;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        getWindow().requestFeature(Window.FEATURE_PROGRESS);
        setContentView(R.layout.activity_ekj2);
    
        WebView webView = (WebView) findViewById(R.id.webviewEkj2a);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDefaultZoom(WebSettings.ZoomDensity.FAR);
        webView.getSettings().setBuiltInZoomControls(true);

  
        webView.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView view, int progress)
            {
                activity.setTitle("Loading...");
                activity.setProgress(progress * 100);
  
                if(progress == 100)
                    activity.setTitle(R.string.title_activity_ekj2);
            }
        });
  
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl)
            {
                // Handle the error
            }
  
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url)
            {
                view.loadUrl(url);
                return true;
            }
        });
         
        webView.loadUrl("http://www.novasoftware.se/ImgGen/schedulegenerator.aspx?format=png&schoolid=82790/sv-se&type=1&id={22F47E89-766F-4EE0-A746-C7D127C4E4A6}&period=&week=&mode=0&printer=0&colors=32&head=0&clock=0&foot=0&day=0&width=1080&height=1920&maxwidth=1080&maxheight=1920");
    }


  /*  @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_ekj2, menu);
        return true;
    }  */
}
