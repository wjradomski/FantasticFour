package com.example.fanfourproject;

import java.util.Random;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class ReceiveConfirmationActivity extends Activity {

	public String confirmationID = "";
	
	public ReceiveConfirmationActivity(){
		
	}
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_confirmation);
        setConfirmationID(generateConfID());
        
        TextView idTextView = (TextView) findViewById(R.id.actual_id);
        idTextView.setText(confirmationID);
        
        Intent intent = getIntent();
        String userEmail = intent.getStringExtra("UserEmail");
        TextView emailTextView = (TextView) findViewById(R.id.email_holder);
        emailTextView.setText(userEmail);
    }

    public String generateConfID(){
    	Random generator = new Random();
        String conf = "";
        //System.out.println((char) (22+55)); "M"
        //System.out.println((char) (23+55)); "N"
        //System.out.println((char) (24+55)); "O"
        //System.out.println((char) (25+55)); "P"
        //System.out.println((char) (26+55)); "Q"
        //System.out.println((char) (27+55)); "R"
        
        for(int j = 0; j < 10; j++){
            int i = generator.nextInt(36);
            while(i == 0 || i == 24){//removes O's and 0's 
                i = generator.nextInt(36);
            }
            if(i < 10){
                conf = conf + i;
            }
            else{
                conf = conf + ((char) (i+55));
            }
        }
    	
    	return conf;
    }
    
    public void closeAndRestart(View view){        
        Intent intent = new Intent(this, HomePageActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    	
    }

	/**
	 * @return the confirmationID
	 */
	public String getConfirmationID() {
		return confirmationID;
	}

	/**
	 * @param confirmationID the confirmationID to set
	 */
	public void setConfirmationID(String confirmationID) {
		this.confirmationID = confirmationID;
	}
	
	@Override
    public void onBackPressed() {//disable the back button
    }
}
