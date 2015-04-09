package com.example.tictactoe1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;

public class Splash extends Activity {
	RelativeLayout rl;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		  requestWindowFeature(Window.FEATURE_NO_TITLE);
	        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_splash);
		
		setContentView(R.layout.activity_splash);
        rl=(RelativeLayout)findViewById(R.id.relat);
        
        
        //Thread for holding splash screen
        Thread th=new Thread(){
        	public void run(){
        		try{
        	        sleep(3000);
        	        
        		}catch(InterruptedException e){
        			e.printStackTrace();
        		}
        		finally{
        			Intent in=new Intent(Splash.this,T_Activity.class);
        			startActivity(in);
        			finish();
        		}
        	}
        };
        th.start();
        
        
    }


	}

