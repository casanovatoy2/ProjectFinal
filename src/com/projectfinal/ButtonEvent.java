package com.projectfinal;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ButtonEvent extends Activity{
	public void buttonListener(final Activity presentClass, int id, final Class<?> classname){		
		Button buttonName = (Button) findViewById(id); 
		buttonName.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(presentClass, (Class<?>) classname ));
				presentClass.finish();
			}
		});

	}
}