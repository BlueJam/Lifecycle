package uk.co.bimrose.android.lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends LifecycleLoggingActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	}

	public void start(View v) {
		Intent i = new Intent(this, Other.class);
		i.putExtra(Other.MAIN_DATA, getString(R.string.other));
		startActivity(i);
	}

}
