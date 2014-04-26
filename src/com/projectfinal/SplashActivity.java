package com.projectfinal;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;

public class SplashActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		new Thread(){
			public void run(){
				try{
					sleep(2500);
				}catch(InterruptedException e){
					e.printStackTrace();
				}finally{
					startActivity(new Intent(SplashActivity.this, MainActivity.class));
					SplashActivity.this.finish();
				}
			};
		}.start();
	}	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.splash, menu);
		return true;
	}

}