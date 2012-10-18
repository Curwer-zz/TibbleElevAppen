package com.NikeApps.tibbleelevappen;




import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;




public class Schema extends Activity {
		
	

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schema); {
        	
        	//Spinner spinner = (Spinner) findViewById(R.id.spinner);
            android.widget.Spinner spinner = (android.widget.Spinner) findViewById(R.id.spinner);
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                    this, R.array.Klasser, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
             
            
            spinner.setOnItemSelectedListener(new OnItemSelectedListener()
            {
            	

				public void onItemSelected(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {
					// TODO Auto-generated method stub
					
					switch (arg2) {
		            case 0:                 
		                //Intent intent1 = new Intent(Schema.this, EKE1A.class);
		                //startActivity(intent1);                        
		                break;

		            case 1:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		                Intent eke1a = new Intent(Schema.this, EKE1A.class);
		                startActivity(eke1a);                       
		                break;
		                
		            case 2:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent eke1b = new Intent(Schema.this, EKE1B.class);
		            	startActivity(eke1b);
		            	break;
		            	
		            case 3:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent eki1a = new Intent(Schema.this, EKI1A.class);
		            	startActivity(eki1a);
		            	break;
		            	
		            case 4:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent ekj1a = new Intent(Schema.this, EKJ1A.class);
		            	startActivity(ekj1a);
		            	break;
		            	
		            case 5:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent es1a = new Intent(Schema.this, ES1A.class);
		            	startActivity(es1a);
		            	break;
		            	
		            case 6:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent es1b = new Intent(Schema.this, ES1B.class);
		            	startActivity(es1b);
		            	break;
		            	
		            case 7:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent ha1a = new Intent(Schema.this, HA1A.class);
		            	startActivity(ha1a);
		            	break;
		            	
		            case 8:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent hum1a = new Intent(Schema.this, HUM1A.class);
		            	startActivity(hum1a);
		            	break;
		            	
		            case 9:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent ihl1a = new Intent(Schema.this, IHL1A.class);
		            	startActivity(ihl1a);
		            	break;
		            	
		            case 10:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent na1a = new Intent(Schema.this, NA1A.class);
		            	startActivity(na1a);
		            	break;
		            	
		            case 11:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent sab1a = new Intent(Schema.this, SAB1A.class);
		            	startActivity(sab1a);
		            	break;
		            	
		            case 12:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent sab1b = new Intent(Schema.this, SAB1B.class);
		            	startActivity(sab1b);
		            	break;
		            	
		            case 13:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent sab1c = new Intent(Schema.this, SAB1C.class);
		            	startActivity(sab1c);
		            	break;
		            	
		            case 14:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent sam1a = new Intent(Schema.this, SAM1A.class);
		            	startActivity(sam1a);
		            	break;
		            	
		            case 15:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent sas1a = new Intent(Schema.this, SAS1A.class);
		            	startActivity(sas1a);
		            	break;
		            	
		            case 16:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent te1a = new Intent(Schema.this, TE1A.class);
		            	startActivity(te1a);
		            	break;

		            default :                       
		                break;
					
				}


				}

				public void onNothingSelected(AdapterView<?> arg0) {
					// TODO Auto-generated method stub
					
				}
             
            });  
        
        android.widget.Spinner spinner1 = (android.widget.Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(
                this, R.array.Klasser1, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);
        
        spinner1.setOnItemSelectedListener(new OnItemSelectedListener()
        {

        	public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				switch (arg2) {
	            case 0:                 
	                //Intent intent1 = new Intent(Schema.this, EKE1A.class);
	                //startActivity(intent1);                        
	                break;

	            case 1:
	            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
	                Intent eke2a = new Intent(Schema.this, EKE2A.class);
	                startActivity(eke2a);                       
	                break;
	                
	            case 2:
	            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
	            	Intent eke2b = new Intent(Schema.this, EKE2B.class);
	            	startActivity(eke2b);
	            	break;
	            	
	            case 3:
	            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
	            	Intent eki2a = new Intent(Schema.this, EKI2A.class);
	            	startActivity(eki2a);
	            	break;
	            	
	            case 4:
	            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
	            	Intent ekj2a = new Intent(Schema.this, EKJ2A.class);
	            	startActivity(ekj2a);
	            	break;
	            	
	            case 5:
	            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
	            	Intent ekj2b = new Intent (Schema.this, EKJ2B.class);
	            	startActivity(ekj2b);
	            	break;
	            	
	            case 6:
	            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
	            	Intent es2a = new Intent(Schema.this, ES2A.class);
	            	startActivity(es2a);
	            	break;
	            	
	            case 7:
	            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
	            	Intent es2b = new Intent(Schema.this, ES2B.class);
	            	startActivity(es2b);
	            	break;
	            	
	            case 8:
	            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
	            	Intent ha2a = new Intent(Schema.this, HA2A.class);
	            	startActivity(ha2a);
	            	break;
	            	
	            case 9:
	            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
	            	Intent hum2a = new Intent(Schema.this, HUM2A.class);
	            	startActivity(hum2a);
	            	break;
	            	
	            case 10:
	            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
	            	Intent na2a = new Intent(Schema.this, NA2A.class);
	            	startActivity(na2a);
	            	break;
	            	
	            case 11:
	            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
	            	Intent sab2a = new Intent(Schema.this, SAB2A.class);
	            	startActivity(sab2a);
	            	break;
	            	
	            case 12:
	            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
	            	Intent sab1b = new Intent(Schema.this, SAB1B.class);
	            	startActivity(sab1b);
	            	break;
	            	
	            case 13:
	            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
	            	Intent sam2a = new Intent(Schema.this, SAM2A.class);
	            	startActivity(sam2a);
	            	break;
	            	
	            case 14:
	            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
	            	Intent sa2a = new Intent(Schema.this, SAS2A.class);
	            	startActivity(sa2a);
	            	break;
	            	
	            case 15:
	            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
	            	Intent te2a = new Intent(Schema.this, TE2A.class);
	            	startActivity(te2a);
	            	break;
	            	
	            case 16:
	            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
	            	Intent sas1a = new Intent(Schema.this, SAS1A.class);
	            	startActivity(sas1a);
	            	break;
	            	
	            case 17:
	            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
	            	Intent te1a = new Intent(Schema.this, TE1A.class);
	            	startActivity(te1a);
	            	break;

	            default :                       
	                break;
	                
				}
        	}

			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
				
			}); }
        	
	    android.widget.Spinner spinner2 = (android.widget.Spinner) findViewById(R.id.spinner2);
	    ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(
	            this, R.array.Klasser2, android.R.layout.simple_spinner_item);
	    adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	    spinner2.setAdapter(adapter3);
	            
	            spinner2.setOnItemSelectedListener(new OnItemSelectedListener()
	            {

					public void onItemSelected(AdapterView<?> arg0, View arg1,
							int arg2, long arg3) {
						// TODO Auto-generated method stub
						switch (arg2) {
			            case 0:                 
			                //Intent intent1 = new Intent(Schema.this, EKE1A.class);
			                //startActivity(intent1);                        
			                break;

			            case 1: 
			            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
			                Intent ek3a = new Intent(Schema.this, EK3A.class);
			                startActivity(ek3a);                       
			                break;
			                
			            case 2:
			            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
			            	Intent ek3b = new Intent(Schema.this, EK3B.class);
			            	startActivity(ek3b);
			            	break;
			            	
			            case 3:
			            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
			            	Intent es3a = new Intent(Schema.this, ES3A.class);
			            	startActivity(es3a);
			            	break;
			            	
			            case 4:
			            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
			            	Intent hp3a = new Intent(Schema.this, HP3A.class);
			            	startActivity(hp3a);
			            	break;
			            	
			            case 5:
			            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
			            	Intent ihl3a = new Intent(Schema.this, IHL3A.class);
			            	startActivity(ihl3a);
			            	break;
			            	
			            case 6:
			            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
			            	Intent itek3a = new Intent(Schema.this, ITEK3A.class);
			            	startActivity(itek3a);
			            	break;
			            	
			            case 7:
			            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
			            	Intent juek3a = new Intent(Schema.this, JUEK3A.class);
			            	startActivity(juek3a);
			            	break;
			            	
			            case 8:
			            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
			            	Intent juek3b = new Intent(Schema.this, JUEK3B.class);
			            	startActivity(juek3b);
			            	break;
			            	
			            case 9:
			            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
			            	Intent ku3a = new Intent(Schema.this, KU3A.class);
			            	startActivity(ku3a);
			            	break;
			            	
			            case 10:
			            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
			            	Intent nv3a = new Intent(Schema.this, NV3A.class);
			            	startActivity(nv3a);
			            	break;
			            	
			            case 11:
			            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
			            	Intent ps3a = new Intent(Schema.this, PS3A.class);
			            	startActivity(ps3a);
			            	break;
			            	
			            case 12:
			            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
			            	Intent sa3a = new Intent(Schema.this, SA3A.class);
			            	startActivity(sa3a);
			            	break;
			            	
			            case 13:
			            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
			            	Intent sk3a = new Intent(Schema.this, SK3A.class);
			            	startActivity(sk3a);
			            	break;
			            	
			            case 14:
			            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
			            	Intent wwb3a = new Intent(Schema.this, WWB3A.class);
			            	startActivity(wwb3a);
			            	break;
			            	
			            case 15:
			            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
			            	Intent wwi3a = new Intent(Schema.this, WWI3A.class);
			            	startActivity(wwi3a);
			            	break;
			            	
			            case 16:
			            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
			            	Intent wwl3a = new Intent(Schema.this, WWL3A.class);
			            	startActivity(wwl3a);
			            	break;

			            default :                       
			                break;
						
					}


					}

					public void onNothingSelected(AdapterView<?> arg0) {
						// TODO Auto-generated method stub
						
					}
	             
	            });
    
  /*  android.widget.Spinner spinner3 = (android.widget.Spinner) findViewById(R.id.spinner3);
    ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(
            this, R.array.dinklass, android.R.layout.simple_spinner_item);
    adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    spinner3.setAdapter(adapter4);
        		        
            spinner3.setOnItemSelectedListener(new OnItemSelectedListener()
            {

				public void onItemSelected(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {
					// TODO Auto-generated method stub
					
					
					
					switch (arg2) {
		            case 0:                 
		                //Intent intent1 = new Intent(Schema.this, EKE1A.class);
		                //startActivity(intent1);                        
		                break;
		            
		            case 1:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		                Intent eke1a = new Intent(Schema.this, EKE1A.class);
		                startActivity(eke1a);  
		                break;
		                
		            case 2:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent eke1b = new Intent(Schema.this, EKE1B.class);
		            	startActivity(eke1b);
		            	break;
		            	
		            case 3:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent eki1a = new Intent(Schema.this, EKI1A.class);
		            	startActivity(eki1a);
		            	break;
		            	
		            case 4:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent ekj1a = new Intent(Schema.this, EKJ1A.class);
		            	startActivity(ekj1a);
		            	break;
		            	
		            case 5:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent es1a = new Intent(Schema.this, ES1A.class);
		            	startActivity(es1a);
		            	break;
		            	
		            case 6:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent es1b = new Intent(Schema.this, ES1B.class);
		            	startActivity(es1b);
		            	break;
		            	
		            case 7:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent ha1a = new Intent(Schema.this, HA1A.class);
		            	startActivity(ha1a);
		            	break;
		            	
		            case 8:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent hum1a = new Intent(Schema.this, HUM1A.class);
		            	startActivity(hum1a);
		            	break;
		            	
		            case 9:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent ihl1a = new Intent(Schema.this, IHL1A.class);
		            	startActivity(ihl1a);
		            	break;
		            	
		            case 10:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent na1a = new Intent(Schema.this, NA1A.class);
		            	startActivity(na1a);
		            	break;
		            	
		            case 11:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent sab1a = new Intent(Schema.this, SAB1A.class);
		            	startActivity(sab1a);
		            	break;
		            	
		            case 12:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent sab1b = new Intent(Schema.this, SAB1B.class);
		            	startActivity(sab1b);
		            	break;
		            	
		            case 13:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent sab1c = new Intent(Schema.this, SAB1C.class);
		            	startActivity(sab1c);
		            	break;
		            	
		            case 14:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent sam1a = new Intent(Schema.this, SAM1A.class);
		            	startActivity(sam1a);
		            	break;
		            	
		            case 15:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent sas1a = new Intent(Schema.this, SAS1A.class);
		            	startActivity(sas1a);
		            	break;
		            	
		            case 16:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent te1a = new Intent(Schema.this, TE1A.class);
		            	startActivity(te1a);
		            	break;
		                
		            case 17:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		                Intent eke2a = new Intent(Schema.this, EKE2A.class);
		                startActivity(eke2a);                       
		                break;
		                
		            case 18:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent eke2b = new Intent(Schema.this, EKE2B.class);
		            	startActivity(eke2b);
		            	break;
		            	
		            case 19:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent eki2a = new Intent(Schema.this, EKI2A.class);
		            	startActivity(eki2a);
		            	break;
		            	
		            case 20:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent ekj2a = new Intent(Schema.this, EKJ2A.class);
		            	startActivity(ekj2a);
		            	break;
		            	
		            case 21:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent ekj2b = new Intent (Schema.this, EKJ2B.class);
		            	startActivity(ekj2b);
		            	break;
		            	
		            case 22:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent es2a = new Intent(Schema.this, ES2A.class);
		            	startActivity(es2a);
		            	break;
		            	
		            case 23:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent es2b = new Intent(Schema.this, ES2B.class);
		            	startActivity(es2b);
		            	break;
		            	
		            case 24:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent ha2a = new Intent(Schema.this, HA2A.class);
		            	startActivity(ha2a);
		            	break;
		            	
		            case 25:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent hum2a = new Intent(Schema.this, HUM2A.class);
		            	startActivity(hum2a);
		            	break;
		            	
		            case 26:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent na2a = new Intent(Schema.this, NA2A.class);
		            	startActivity(na2a);
		            	break;
		            	
		            case 27:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent sab2a = new Intent(Schema.this, SAB2A.class);
		            	startActivity(sab2a);
		            	break;
		            	
		            case 28:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		           	    Intent sab2b = new Intent(Schema.this, SAB2B.class);
		           	    startActivity(sab2b);
		           	    break;
		           	    
		            case 29:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent sam2a = new Intent(Schema.this, SAM2A.class);
		            	startActivity(sam2a);
		            	break;
		            	
		            case 30:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent sa2a = new Intent(Schema.this, SAS2A.class);
		            	startActivity(sa2a);
		            	break;
		            	
		            case 31:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent te2a = new Intent(Schema.this, TE2A.class);
		            	startActivity(te2a);
		            	break;
		            			            	
		            case 32: 
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		                Intent ek3a = new Intent(Schema.this, EK3A.class);
		                startActivity(ek3a);                       
		                break;
		                
		            case 33:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent ek3b = new Intent(Schema.this, EK3B.class);
		            	startActivity(ek3b);
		            	break;
		            	
		            case 34:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent es3a = new Intent(Schema.this, ES3A.class);
		            	startActivity(es3a);
		            	break;
		            	
		            case 35:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent hp3a = new Intent(Schema.this, HP3A.class);
		            	startActivity(hp3a);
		            	break;
		            	
		            case 36:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent ihl3a = new Intent(Schema.this, IHL3A.class);
		            	startActivity(ihl3a);
		            	break;
		            	
		            case 37:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent itek3a = new Intent(Schema.this, ITEK3A.class);
		            	startActivity(itek3a);
		            	break;
		            	
		            case 38:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent juek3a = new Intent(Schema.this, JUEK3A.class);
		            	startActivity(juek3a);
		            	break;
		            	
		            case 39:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent juek3b = new Intent(Schema.this, JUEK3B.class);
		            	startActivity(juek3b);
		            	break;
		            	
		            case 40:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent ku3a = new Intent(Schema.this, KU3A.class);
		            	startActivity(ku3a);
		            	break;
		            	
		            case 41:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent nv3a = new Intent(Schema.this, NV3A.class);
		            	startActivity(nv3a);
		            	break;
		            	
		            case 42:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent ps3a = new Intent(Schema.this, PS3A.class);
		            	startActivity(ps3a);
		            	break;
		            	
		            case 43:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent sa3a = new Intent(Schema.this, SA3A.class);
		            	startActivity(sa3a);
		            	break;
		            	
		            case 44:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent sk3a = new Intent(Schema.this, SK3A.class);
		            	startActivity(sk3a);
		            	break;
		            	
		            case 45:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent wwb3a = new Intent(Schema.this, WWB3A.class);
		            	startActivity(wwb3a);
		            	break;
		            	
		            case 46:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent wwi3a = new Intent(Schema.this, WWI3A.class);
		            	startActivity(wwi3a);
		            	break;
		            	
		            case 47:
		            	Toast.makeText(getApplicationContext(), "Schema laddas...", Toast.LENGTH_SHORT).show();
		            	Intent wwl3a = new Intent(Schema.this, WWL3A.class);
		            	startActivity(wwl3a);
		            	break;

		            default :                       
		                break;
					
				}


				}

				public void onNothingSelected(AdapterView<?> arg0) {
					// TODO Auto-generated method stub
					
				}
             
            }); */
            
            final Spinner spinner = (Spinner) findViewById(R.id.spinner3);
            ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(
                this, R.array.dinklass, android.R.layout.simple_spinner_item);
            adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            spinner.setAdapter(adapter4);
            String savedValue=PreferenceManager
                    .getDefaultSharedPreferences(getBaseContext())
                    .getString("savedValue","");




            spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {           
                  public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                      SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences( getBaseContext());
                      SharedPreferences.Editor prefEditor = prefs.edit();
                      prefEditor.putString("savedValue",spinner.getSelectedItem().toString());
                      

                      String savedValue=spinner.getSelectedItem().toString();

                      for(int i=0;i<6;i++)
                      if(savedValue.equals(spinner.getItemAtPosition(i).toString()))
                      {
                          spinner.setSelection(i);
                          break;
                      }
                  }
                  public void onNothingSelected(AdapterView<?> parent){}
           });
            
            
            
    }
    
    
    
        		
			
  /*  @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_schema, menu);
        return true;
    }  */
}
