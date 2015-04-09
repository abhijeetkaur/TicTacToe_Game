package com.example.tictactoe1;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class T_Activity extends Activity {
   ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9;
   boolean go=false;
   TextView tv;
   int arr[];
   
   
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		overridePendingTransition(R.anim.in, R.anim.out);
		setContentView(R.layout.activity_t_);
		tv=(TextView)findViewById(R.id.tv1);
		img1=(ImageView)findViewById(R.id.i1);
		img2=(ImageView)findViewById(R.id.i2);
		img3=(ImageView)findViewById(R.id.i3);
		img4=(ImageView)findViewById(R.id.i4);
		img5=(ImageView)findViewById(R.id.i5);
		img6=(ImageView)findViewById(R.id.i6);
		img7=(ImageView)findViewById(R.id.i7);
		img8=(ImageView)findViewById(R.id.i8);
		img9=(ImageView)findViewById(R.id.i9);
		arr=new int[10];
		for(int i=0;i<10;i++)
		{
			arr[i]=0;
		}
		
		img1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				pass(img1,1);
			}
		});
       img2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				pass(img2,2);
			}
		});
        img3.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		pass(img3,3);
	}
});
      img4.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		pass(img4,4);
	}
});
img5.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		pass(img5,5);
	}
});
img6.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		pass(img6,6);
	}
});
img7.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		pass(img7,7);
	}
});
img8.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		pass(img8,8);
	}
});
img9.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		pass(img9,9);
	}
});
	}
	public void pass(ImageView img,int i)
	{   
		if(go==false)
		{   if(arr[i]==0)
			{img.setImageResource(R.drawable.cross);
			tv.setText("Player-2 plays now.....");
			arr[i]=5;
			go=true;
			check(i);}
			else{
				Toast.makeText(getApplicationContext(), "OOOPS...!!!Please choose an undone box",Toast.LENGTH_SHORT).show();
			}
			
		}
		else if(go==true)
		{   if(arr[i]==0)
			{img.setImageResource(R.drawable.circle);
			tv.setText("Player-1 plays now.....");
			go=false;
			arr[i]=10;
			check(i);
			}
		else{
			Toast.makeText(getApplicationContext(), "OOOPS...!!!Please choose an undone box",Toast.LENGTH_SHORT).show();
		}
		
		}
		
		
	}
	public void check(int num)
	{   AlertDialog.Builder alrtbldr=new AlertDialog.Builder(T_Activity.this);
	    int flag=0;
	 if((arr[1]==arr[2] && arr[2]==arr[3] && arr[1]!=0) || (arr[4]==arr[5] && arr[5]==arr[6] && arr[4]!=0) || (arr[7]==arr[8] &&arr[8]==arr[9] &&arr[8]!=0) || (arr[1]==arr[4] && arr[4]==arr[7] && arr[4]!=0) || (arr[2]==arr[5]&& arr[5]==arr[8] &&arr[5]!=0) || (arr[3]==arr[6]&& arr[6]==arr[9] && arr[6]!=0) ||
				(arr[1]==arr[5]&& arr[5]==arr[9]&& arr[5]!=0) || (arr[3]==arr[5] && arr[5]==arr[7] && arr[5]!=0))
		{
		    flag=1;
			
			if(arr[num]==5)
			{
				alrtbldr.setTitle("Player-1 wins....!!! \t Do you want to play another game..?? ");
			}
			else if(arr[num]==10)
			{
				alrtbldr.setTitle("Player-2 wins....!!! \t Do you want to play another game..?? ");
			}
		}
	 else if(arr[1]!=0 && arr[2]!=0 && arr[3]!=0 && arr[4]!=0 && arr[5]!=0 && arr[6]!=0 && arr[7]!=0 && arr[8]!=0 &&
			 arr[9]!=0  )
	 {flag=1;
		 alrtbldr.setTitle("The game draws....!!! \t Do you want to play another game..?? ");
	 }
	 if(flag==1)
	 {
          alrtbldr.setPositiveButton("YES",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface arg0, int arg1) {
					// TODO Auto-generated method stub
					
					
					Intent positive= new Intent(getApplicationContext(),T_Activity.class);
					startActivity(positive);
					finish();
					
				}
			} );
          alrtbldr.setNegativeButton("NO", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface arg0, int arg1) {
					// TODO Auto-generated method stub
				 finish();
				}
			});
          AlertDialog alrtdialog=alrtbldr.create();
			alrtdialog.show();
		}
	}		
			
	}
	


