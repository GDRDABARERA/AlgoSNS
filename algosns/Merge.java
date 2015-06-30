package com.gdrdabarera.algosns;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Merge extends ActionBarActivity{
	
	 public Button back;
		
		@Override
		
		protected void onCreate(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
			setContentView(R.layout.merge);
			 onSortClick();
		}
		 
		 
		 public void onSortClick(){
			 back = (Button)findViewById(R.id.button_back);
			 back.setOnClickListener(new OnClickListener(){
	    		 @Override
	             public void onClick(View v) {
	    			 	
	    			 startActivity(new Intent(getApplicationContext(), SortAlgo.class));
	             }
	    		
	    		
	    	});
			 
		 }



}
