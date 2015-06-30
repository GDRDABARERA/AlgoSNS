package com.gdrdabarera.algosns;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SortAlgo extends ActionBarActivity{
	 
	   
	   public Button bubble,insertion,selection,heap,quick,merge,back;
	   @Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sort);
		
		onClickSortAlgoButton();
		
		
	}
	   
	   public void onClickSortAlgoButton(){
		   bubble = (Button)findViewById(R.id.button_bubble);
		   insertion = (Button)findViewById(R.id.button_insertion);
		   selection = (Button)findViewById(R.id.button_selection);
		   merge = (Button)findViewById(R.id.button_merge);
		   quick = (Button)findViewById(R.id.button_quick);
		   heap = (Button)findViewById(R.id.button_heap);
		  back = (Button)findViewById(R.id.button_back);
		   
		   
		   	bubble.setOnClickListener(new OnClickListener(){
	    		 @Override
	             public void onClick(View v) {
	    			 startActivity(new Intent(getApplicationContext(), Bubble.class));
	    			
	             }
	    		
	    		
	    	});
		   	
		   insertion.setOnClickListener(new OnClickListener(){
	    		 @Override
	             public void onClick(View v) {
	    			 startActivity(new Intent(getApplicationContext(), Insertion.class));
	    			
	             }
	    		
	    		
	    	});
		   
			selection.setOnClickListener(new OnClickListener(){
	    		 @Override
	             public void onClick(View v) {
	    			 startActivity(new Intent(getApplicationContext(), Selection.class));
	    			
	             }
	    		
	    		
	    	});
		   	
		   merge.setOnClickListener(new OnClickListener(){
	    		 @Override
	             public void onClick(View v) {
	    			 startActivity(new Intent(getApplicationContext(), Merge.class));
	    			
	             }
	    		
	    		
	    	});
		   
			heap.setOnClickListener(new OnClickListener(){
	    		 @Override
	             public void onClick(View v) {
	    			 startActivity(new Intent(getApplicationContext(), Heap.class));
	    			
	             }
	    		
	    		
	    	});
		   	
		   quick.setOnClickListener(new OnClickListener(){
	    		 @Override
	             public void onClick(View v) {
	    			 startActivity(new Intent(getApplicationContext(), Quick.class));
	    			
	             }
	    		
	    		
	    	});
		   
		   back.setOnClickListener(new OnClickListener(){
	    		 @Override
	             public void onClick(View v) {
	    			 startActivity(new Intent(getApplicationContext(), Algo.class));
	    			
	             }
	    		
	    		
	    	});
		   
		   
	   }
}
