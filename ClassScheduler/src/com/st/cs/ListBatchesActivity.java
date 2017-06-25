package com.st.cs;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

public class ListBatchesActivity  extends Activity { 

	ListView listBatches;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.listbatches);
	}
	
	@Override 
	public void onStart() {
		super.onStart();
		listBatches  = (ListView) this.findViewById(R.id.listBatches);
		BatchesAdapter adapter  = new BatchesAdapter(this);
		listBatches.setAdapter(adapter);
	}
	
	public void addBatch(View v) {
		Intent intent = new Intent(this, AddBatchActivity.class);
		startActivity(intent);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		   
		MenuInflater menuInflater = getMenuInflater();
	        menuInflater.inflate(R.layout.menu, menu);
		return true;
	}
	
	   @Override
	    public boolean onOptionsItemSelected(MenuItem item)
	    {
	        
	        switch (item.getItemId())
	        {
	        case R.id.message:
	        	msg();
	        	return true;
	        case R.id.leave:
	        	sleave();
	        	return true;
	        	
	   
	        default:
	            return super.onOptionsItemSelected(item);	
	        }
	        
     }
	   private void sleave()
	   {
		   Intent i=new Intent(this,LeaveFormActivity.class);
		   startActivity(i);
	   }

	private void msg() {
		Intent intent=new Intent(this,MsgActivity.class);
		startActivity(intent);
		
		// TODO Auto-generated method stub
		
	}
	
	
}
