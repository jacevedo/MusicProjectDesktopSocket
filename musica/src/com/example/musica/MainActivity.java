package com.example.musica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {

	BufferedReader reader;
	PrintWriter writer;
	Socket sock;
	int contador=0;
	LinearLayout layoutBotones;
	
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarElementos();
        setUpNetworking();
        Thread hilo = new Thread(new Runnable() {
 	       @Override
 	       public void run() {
 	    	   String mensaje;
 				try
 				{
 					while((mensaje = reader.readLine())!=null)
 					{
 						System.out.println("Leido " + mensaje);
 						 Message msg = new Message();
 					      msg.obj = mensaje;
 					      puente.sendMessage(msg);
 					}	 
 				}
 				catch (Exception ex) 
 				{
 					ex.printStackTrace();
 				}
 	        }
 	       
 	      });
 	hilo.start();
    }
    private void inicializarElementos() 
    {
		layoutBotones = (LinearLayout)findViewById(R.id.layoutSeleccionCanciones);
	}


	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
	
	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) 
	{
		switch (item.getItemId())
		{
			case R.id.actualizar:
		
				if(sock.isConnected())
				{
										
				}
				setUpNetworking();
			
			
				return true;
			default:
				return super.onMenuItemSelected(featureId, item);
		}
	}
	@Override
	public void onClick(View v) 
	{
		switch (v.getId())
		{
			default:
				try
				{
					Button boton = (Button)findViewById(v.getId());
					writer.println(boton.getId());
					writer.flush();
				}
				catch (Exception ex) 
				{
					ex.printStackTrace();
				}
			break;
		}
		
	}
	private void setUpNetworking()
	{
		try
		{
			sock = new Socket("186.34.2.255",5000);
			InputStreamReader streamReader = new InputStreamReader(sock.getInputStream());
			reader = new BufferedReader(streamReader);
			writer = new PrintWriter(sock.getOutputStream());
			System.out.println("Coneccion Establecida");
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
    private Handler puente = new Handler() {
    	  @Override
    	  public void handleMessage(Message msg) 
    	  {
    		
    		Button boton = new Button(MainActivity.this);
    		boton.setId(contador);
    		boton.setOnClickListener(MainActivity.this);
    		boton.setText(msg.obj+"");
    		layoutBotones.addView(boton);
    		contador++;
    	  }
    	 };

}
