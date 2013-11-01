package uk.co.bimrose.android.lifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Log.d(getClass().getSimpleName(), "onCreate()");
	}

	public void start(View v) {
		Intent i = new Intent(this, Other.class);
		i.putExtra(Other.MAIN_DATA, getString(R.string.other));
		startActivity(i);
	}

	@Override
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
