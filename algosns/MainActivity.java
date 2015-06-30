package com.gdrdabarera.algosns;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {
	
	
	public Button algo, dataStructures, quiz, exitf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonClickfpg();
    }
    public void buttonClickfpg(){
    	
    	algo = (Button) findViewById(R.id.button_algo);
    	dataStructures = (Button) findViewById(R.id.button_ds);
    	quiz =(Button)findViewById(R.id.button_quiz);
    	exitf =(Button)findViewById(R.id.button_exitf);
    	
    	algo.setOnClickListener(new OnClickListener(){
    		 @Override
             public void onClick(View v) {
    			 	//setContentView(R.layout.algo);
    			 startActivity(new Intent(getApplicationContext(), Algo.class));
             }
    		
    		
    	});
    	dataStructures.setOnClickListener(new OnClickListener(){
   		 @Override
         public void onClick(View v) {
			 	//setContentView(R.layout.ds);
   			startActivity(new Intent(getApplicationContext(), Ds.class));
         }
		
		
	});
    	quiz.setOnClickListener(new OnClickListener(){
   		 @Override
            public void onClick(View v) {
   			startActivity(new Intent(getApplicationContext(), Quiz.class));
   			 	//setContentView(R.layout.quiz);
            }
   		
   		
   	});
 
    	
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
