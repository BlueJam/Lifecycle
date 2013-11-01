package uk.co.bimrose.android.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Other extends Activity {

	public static final String MAIN_DATA = "msg";

	public void onCreate(Bundle b) {
		super.onCreate(b);
		setContentView(R.layout.other);
		TextView tv = (TextView) findViewById(R.id.textView);
		tv.setText(getIntent().getStringExtra(MAIN_DATA));

		Log.d(getClass().getSimpleName(), "onCreate()");
	}

	public void onRestart() {
		super.onRestart();
		Log.d(getClass().getSimpleName(), "onRestart()");
	}

	@Override
	public void onStart() {
		super.onStart();
		Log.d(getClass().getSimpleName(), "onStart()");
	}

	@Override
	public void onResume() {
		super.onResume();
		Log.d(getClass().getSimpleName(), "onResume()");
	}

	@Override
	public void onPause() {
		Log.d(getClass().getSimpleName(), "onPause()");
		super.onPause();
	}

	@Override
	public void onStop() {
		Log.d(getClass().getSimpleName(), "onStop()");
		super.onStop();
	}

	@Override
	public void onDestroy() {
		Log.d(getClass().getSimpleName(), "onDestroy()");
		super.onDestroy();
	}

}