package com.pgw.opengldemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	private MySurfaceView mySurfaceView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		mySurfaceView = new MySurfaceView(this);
		setContentView(mySurfaceView);
	}


}
