package com.projectfinal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Eve2Activity extends Activity {

	private static final String DEBUG_TAG = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.eve2);
		
		buttonListener(R.id.go_home_bt, MainActivity.class);
		buttonListener(R.id.previous_bt, EveActivity.class);
		buttonListener(R.id.next_bt, IeActivity.class);
		Typeface THSarabunNew = Typeface.createFromAsset(
	    		getAssets(), "fonts/THSarabunNew.ttf"); 

	    // Read raw file into string and populate TextView
	    InputStream iFile = getResources().openRawResource(R.raw.eve2);
	    try {
	        TextView helpText = (TextView) findViewById(R.id.text_eve2);
	        String strFile = inputStreamToString(iFile);
	        helpText.setTypeface(THSarabunNew);
	        helpText.setText(strFile);
	        helpText.setTextSize(20);
	    } catch (Exception e) {
	        Log.e(DEBUG_TAG, "InputStreamToString failure", e);
	    }
	}
		
public String inputStreamToString(InputStream is) throws IOException 
{
    StringBuffer sBuffer = new StringBuffer();
    //DataInputStream dataIO = new DataInputStream(is);
    BufferedReader reader = new BufferedReader(new InputStreamReader(is));
    String strLine = null;
   
    while ((strLine = reader.readLine()) != null) 
    {
        sBuffer.append(strLine + "\n");
    }

    reader.close();
    is.close();

    return sBuffer.toString();
}

	public void buttonListener(int idActivity , final Class<?> classname){
		Button buttonName = (Button) findViewById(idActivity);
		buttonName.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(Eve2Activity.this, (Class<?>) classname ));
				Eve2Activity.this.finish();
			}
		});
	}


}
