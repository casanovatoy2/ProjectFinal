package com.projectfinal;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		buttonListener(R.id.major, MajorActivity.class);
		buttonListener(R.id.text_admission, AdmissionActivity.class);
		buttonListener(R.id.map, MapActivity.class);
		buttonListener(R.id.contact_us, ContactUsActivity.class);
		buttonListener(R.id.about_us, AboutUsActivity.class);
		
	}
	
	public void buttonListener(int idActivity , final Class<?> classname){
		Button buttonName = (Button) findViewById(idActivity);
		buttonName.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent(MainActivity.this, (Class<?>) classname ));
				MainActivity.this.finish();
			}
		});
	}

}
