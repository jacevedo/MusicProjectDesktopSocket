package musicaproject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

public class VerySimpleChatServer 
{
	ArrayList clientOutputStrams;
	public class ClientHandler implements Runnable
	{
		BufferedReader reader;
		Socket sock;
		public ClientHandler(Socket clientSocket)
		{
			try
			{
				sock = clientSocket;
				InputStreamReader isReader = new InputStreamReader(sock.getInputStream());
				reader = new BufferedReader(isReader);
			}
			catch (Exception ex) 
			{
				ex.printStackTrace();
			}
		}
		@Override
		public void run() 
		{
			String mensaje;
			try
			{
				while ((mensaje = reader.readLine())!=null)
				{
					//System.out.println("Leido " + mensaje);
                                        ventanaMusica.stopAll();
					ventanaMusica.reproducir(Integer.parseInt(mensaje));
                                        //ventanaMusica.Votacion(mensaje);
       				}
			}
			catch (Exception ex) 
			{
				ex.printStackTrace();
			}
		}
	}
	public static void main (String [] args)
	{
		new VerySimpleChatServer().go();
	}
	public void go()
	{
		clientOutputStrams = new ArrayList();
		try
		{
			ServerSocket serverSock = new ServerSocket(5000);
			while(true)
			{
				Socket clientSocket = serverSock.accept();
                                System.out.println(clientSocket.getInetAddress());
                                
				PrintWriter writer = new PrintWriter(clientSocket.getOutputStream());
				clientOutputStrams.add(writer);
				Thread t = new Thread(new ClientHandler(clientSocket));
				t.start();
                                for(int i=0;i<ventanaMusica.reproductor.size();i++)
                                {
                                    tellEveryone(ventanaMusica.nomCanciones.get(i),writer);
                                }
				System.out.println("Obtuve una coneccion");
			}
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public void tellEveryone(String mensaje,PrintWriter writter)
	{
		/*Iterator it = clientOutputStrams.iterator();
		while(it.hasNext())
		{*/
			try
			{
				PrintWriter writer = writter;
				writer.println(mensaje);
				writer.flush();
			}
			catch (Exception ex) 
			{
				ex.printStackTrace();
			}
		//}
	}
}

