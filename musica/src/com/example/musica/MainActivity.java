package com.example.musica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Message;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends Activity implements OnClickListener {

	private BufferedReader reader;
	private PrintWriter writer;
	private Socket sock;
	private int contador=0;
	private LinearLayout layoutBotones;
	private String direccion;
	private AsynckConnection conection;
	
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarElementos();
        direccion = getIntent().getExtras().getString("direccionIp");
        conection = new AsynckConnection();
        conection.execute(direccion);
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
						try 
						{
							layoutBotones.removeAllViews();
							sock.close();
							conection.cancel(true);
							conection = null;
							conection = new AsynckConnection();
							conection.execute(direccion); 
						} 
						catch (IOException e) 
						{
							// TODO Auto-generated catch block
							e.printStackTrace();
						}				
				}
				else
				{
					setUpNetworking(direccion);
				}
				
							
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
	private void setUpNetworking(String direccion)
	{
		try
		{
			sock = new Socket(direccion,5000);
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
   
    	 
   class AsynckConnection extends AsyncTask<String, Message, Void>
   {

		@Override
		protected Void doInBackground(String... params)
		{
			 setUpNetworking(params[0]);
			String mensaje;
				try
				{
					while((mensaje = reader.readLine())!=null)
					{
						System.out.println("Leido " + mensaje);
						 Message msg = new Message();
					      msg.obj = mensaje;
					     publishProgress(msg);
					}	 
				}
				catch (Exception ex) 
				{
					ex.printStackTrace();
				}
			return null;
		}

		@Override
		protected void onProgressUpdate(Message... values)
		{
			Button boton = new Button(MainActivity.this);
    		boton.setId(contador);
    		boton.setOnClickListener(MainActivity.this);
    		boton.setText(values[0].obj+"");
    		layoutBotones.addView(boton);
    		contador++;
			super.onProgressUpdate(values);
		}
		
	   
   }

}
