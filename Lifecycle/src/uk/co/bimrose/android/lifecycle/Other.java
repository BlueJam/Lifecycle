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
	}

}