package com.example.musica;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class InicioActivity extends Activity implements OnClickListener {

	private EditText edtIp;
	private Button btnEntrar;
	private LinearLayout layoutButtonsConnection;
	private ScanPort scan;
	
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio_main);
        inicializarElementos();
       // scan = new ScanPort();
        //scan.execute();
       
    }
    
    
    @Override
	protected void onPause()
    {
    	//scan.cancel(true);
    	//scan = null;
		super.onPause();
	}


	private void inicializarElementos() 
    {
    	edtIp = (EditText)findViewById(R.id.edtIp);
    	btnEntrar = (Button)findViewById(R.id.btnEntrar);
    	layoutButtonsConnection = (LinearLayout)findViewById(R.id.layoutButtonsConnection);
    	btnEntrar.setOnClickListener(this);
	}
    
	@Override
	public void onClick(View v) 
	{
		String ip;
		Intent i;
		switch (v.getId()) 
		{
			case R.id.btnEntrar:
				ip = edtIp.getText().toString();
				i = new Intent(this,MainActivity.class);
				i.putExtra("direccionIp", ip);
				startActivity(i);
			break;
			default:
				ip = ((Button)v).getText().toString();
				i = new Intent(this,MainActivity.class);
				i.putExtra("direccionIp", ip);
				startActivity(i);
				break;
		}
	}
	class ScanPort extends AsyncTask<Void, String, Void>
	{

		@Override
		protected Void doInBackground(Void... params) 
		{
			String ip = "";
			ip = get_ip();
			String[] ipBase = ip.split("\\.");
			Log.e("ipBase", ipBase[0]+"."+ipBase[1]+"."+ipBase[2]);
			String ipBaseString =ipBase[0]+"."+ipBase[1]+"."+ipBase[2]+"."; 
			
			getport(ipBaseString);
			
			Log.e("Ip de destino", ip);
			return null;
		}

		private void getport(String ipBaseString)
		{
			for (int ip = 2; ip <= 255; ip++) 
			   {
			        try 
			        {
			        	String host = ipBaseString + ip;
			        	boolean isAvailable = Inet4Address.getByName("192.168.2.240").isReachable(5000);
			        	if(isAvailable)
			        	{
			        		publishProgress(host); 
			        	}
			        	Log.e("host", host);
			        	/*
			        	
			            // Try to create the Socket on the given port.
			        	 Socket socket = new Socket(host, 5000);

			             publishProgress(host);
			            // Don't forget to close it
			            socket.close();*/
			        } 
			        catch (UnknownHostException e) 
			        {
			            //WRONG ADDRESS  
			        } catch (SocketTimeoutException e) 
			        {
			            //TIMEOUT
			        } catch (IOException e) 
			        {
			            //CLOSED
			        }
			    }
		}

		@Override
		protected void onProgressUpdate(String... values) 
		{
			Log.e("Update",values[0]);
			Button button = new Button(InicioActivity.this);
			button.setText(values[0]);
			button.setOnClickListener(InicioActivity.this);
			layoutButtonsConnection.addView(button);
			super.onProgressUpdate(values);
		}
		
		private String get_ip()
		{
			java.net.Socket conn = null;
			String ipAddress;

			try 
			{
				conn = new java.net.Socket("www.google.com", 80);
			} 
			catch (UnknownHostException unknownhostexception) 
			{
				unknownhostexception.printStackTrace();
			} 
			catch (IOException ioexception) 
			{
				ioexception.printStackTrace();
			} 
			ipAddress = conn.getLocalAddress().toString().substring(1);
			
			try 
			{
				conn.close();
			} 
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return ipAddress;
		}
	}
}
