package com.gdrdabarera.algosns;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Algo extends ActionBarActivity {
	public Button search,sort,graph,back;
 @Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.algo);
		onClickAlgoButtons();
	}
 
 
 	public void onClickAlgoButtons(){
 		sort =(Button)findViewById(R.id.button_sort);
 		search =(Button)findViewById(R.id.button_search);
 		graph =(Button)findViewById(R.id.button_graph);
 		back =(Button)findViewById(R.id.button1);
    	
    	sort.setOnClickListener(new OnClickListener(){
    		 @Override
             public void onClick(View v) {
    			 	
    			 startActivity(new Intent(getApplicationContext(), SortAlgo.class));
             }
    		
    		
    	});
 		
    	back.setOnClickListener(new OnClickListener(){
   		 @Override
            public void onClick(View v) {
   			 	
   			 startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
   		
   		
    	});
 		
 		
 		
 		
 		
 	}
}
