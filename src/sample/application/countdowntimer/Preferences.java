package sample.application.countdowntimer;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class Preferences extends PreferenceActivity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		
		setContentView(R.id.preferences_screen);
		getPreferenceManager().setSharedPreferencesName("CountdownTimerPrefs");
		addPreferencesFromResource(R.xml.preference);
	}

}
