package com.projectfinal;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MapActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.map);

		buttonListener(R.id.go_home_bt, MainActivity.class);
	}

	public void buttonListener(int idActivity, final Class<?> classname) {
		Button buttonName = (Button) findViewById(idActivity);
		buttonName.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent(MapActivity.this,
						(Class<?>) classname));
				MapActivity.this.finish();
			}
		});
	}


}
