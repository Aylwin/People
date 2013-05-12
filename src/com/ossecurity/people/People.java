package com.ossecurity.people;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class People extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_people);
		//exportContacts();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_people, menu);
		return true;
	}

//	private void exportContacts() {
//		new DumpContactsTask().execute();
//	}
//	
//	private class DumpContactsTask extends AsyncTask<Void, Void, Void> {
//		/**
//	     * Starts spinner while task is running.
//	     */
//	    @Override
//	    protected void onPreExecute() {
//	        setProgressBarIndeterminateVisibility(true);
//	    }
//	
//	    @Override
//	    protected Void doInBackground(Void... params) {
//	    	try {
//				DataExporter.exportData(getApplicationContext());
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//	    	return null;
//	    }
//	}
}
