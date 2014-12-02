/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package musicaproject;

import java.io.File;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jlgui.basicplayer.BasicController;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerEvent;
import javazoom.jlgui.basicplayer.BasicPlayerException;
import javazoom.jlgui.basicplayer.BasicPlayerListener;
/**
 *
 * @author Jaime
 */
public class Reproductor implements BasicPlayerListener
{
    private BasicPlayer basicPlayer;
    public Reproductor() 
    {
         basicPlayer = new BasicPlayer();
         basicPlayer.addBasicPlayerListener(this);
    }
     public void play()
     {
        try 
        {
             basicPlayer.play();
        } 
        catch (Exception e) 
        {
         // TODO Auto-generated catch block  e.printStackTrace();
        }
    }
     public void loadFile(File file) throws BasicPlayerException 
     {
        basicPlayer.open(file);
      }
     public void resumen()
     {
        try 
        {
            basicPlayer.resume();
        } 
        catch (BasicPlayerException ex) 
        {
            Logger.getLogger(Reproductor.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     public void stop()
     {
        try {
            basicPlayer.stop();
        } catch (BasicPlayerException ex) {
            Logger.getLogger(Reproductor.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     public void pause()
     {
        try 
        {
            basicPlayer.pause();
        } 
        catch (BasicPlayerException ex) 
        {
            Logger.getLogger(Reproductor.class.getName()).log(Level.SEVERE, null, ex);
        }
     }

    @Override
    public void opened(Object o, Map map) 
    {
        
    }

    @Override
    public void progress(int i, long l, byte[] bytes, Map map) 
    {
     
    }

    @Override
    public void stateUpdated(BasicPlayerEvent bpe) 
    {
        if(bpe.getCode()==bpe.STOPPED&&ventanaMusica.parar==true)
        {
            ventanaMusica.reproducirSiguiente();
        }       
    }

    @Override
    public void setController(BasicController bc) 
    {
        
    }
}
