/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package musicaproject;

import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.ListModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javazoom.jlgui.basicplayer.BasicPlayerException;

/**
 *
 * @author Jaime
 */
public class ventanaMusica extends javax.swing.JFrame {

    /**
     * Creates new form ventanaMusica
     */
    public ventanaMusica()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBuscarMusica = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        btnIniciar = new javax.swing.JButton();
        btnParar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        btnAdelante = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaCanciones = new javax.swing.JList();
        btnPlayLista = new javax.swing.JButton();
        btnSubir = new javax.swing.JButton();
        btnBajar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBuscarMusica.setText("Seleccionar Musica");
        btnBuscarMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarMusicaActionPerformed(evt);
            }
        });

        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        btnParar.setText("Parar");
        btnParar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPararActionPerformed(evt);
            }
        });

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnAdelante.setText("Adelante");
        btnAdelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdelanteActionPerformed(evt);
            }
        });

        jScrollPane4.setViewportView(listaCanciones);

        btnPlayLista.setText("Play Lista");
        btnPlayLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayListaActionPerformed(evt);
            }
        });

        btnSubir.setText("Subir");
        btnSubir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubirActionPerformed(evt);
            }
        });

        btnBajar.setText("Bajar");
        btnBajar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarMusica, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSubir, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBajar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAtras, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                                    .addComponent(btnPlayLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnParar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAdelante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBuscarMusica)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnParar)
                    .addComponent(btnPlayLista))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtras)
                    .addComponent(btnAdelante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubir)
                    .addComponent(btnBajar)
                    .addComponent(btnIniciar))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarMusicaActionPerformed
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Selecciona las Canciones a entrar Hoy");
            fileChooser.setFileFilter(new FileNameExtensionFilter("Archivo de Musica Mp3","mp3"));
            fileChooser.setAutoscrolls(true);
            StringBuffer textoUrl = new StringBuffer();
            StringBuffer textoNombreCanciones = new StringBuffer();
            DefaultListModel modelo = new DefaultListModel();
            if (!fileChooser.isMultiSelectionEnabled()) 
            {
                fileChooser.setMultiSelectionEnabled(true);
            }
            int seleccion = fileChooser.showOpenDialog(btnBuscarMusica);
            if (seleccion == JFileChooser.APPROVE_OPTION)
            {
                File[] files = fileChooser.getSelectedFiles();
                for (int i=0; i<files.length; i++) 
                {
                    try 
                    {
                        reproductor.add(new Reproductor());
                        votaciones.add(0);
                        reproductor.get(reproductor.size()-1).loadFile(files[i]);
                        nomCanciones.add(files[i].getName());
                        modelo.addElement(files[i].getName());
                    } 
                    catch (BasicPlayerException ex) 
                    {
                        Logger.getLogger(ventanaMusica.class.getName()).log(Level.SEVERE, null, ex);
                    }
                   textoUrl.append("\n"+files[i].getPath());
                   textoNombreCanciones.append("\n"+files[i].getName());
                }
                 listaCanciones.setModel(modelo);
               
               // Aquí debemos abrir y leer el fichero.
            }
    }//GEN-LAST:event_btnBuscarMusicaActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        reproducir(ordenCanciones);        // TODO add your handling code here:
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnPararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPararActionPerformed
        stopAll();
    }//GEN-LAST:event_btnPararActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        if(ordenCanciones!=0)
        {
            stopAll();
            ordenCanciones--;
            reproducir(ordenCanciones);
        }
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnAdelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdelanteActionPerformed
        if(ordenCanciones!=reproductor.size()-1)
        {
            stopAll();
            ordenCanciones++;
            reproducir(ordenCanciones);
        }
    }//GEN-LAST:event_btnAdelanteActionPerformed

    private void btnPlayListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayListaActionPerformed
        stopAll();
        reproducir(listaCanciones.getSelectedIndex());
    }//GEN-LAST:event_btnPlayListaActionPerformed

    private void btnSubirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubirActionPerformed
        moverItemArriba(listaCanciones.getSelectedIndex());
    }//GEN-LAST:event_btnSubirActionPerformed

    private void btnBajarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajarActionPerformed
        moverItemAbajo(listaCanciones.getSelectedIndex());
    }//GEN-LAST:event_btnBajarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventanaMusica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaMusica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaMusica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaMusica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaMusica().setVisible(true);
            }
        });
        new VerySimpleChatServer().go();
    }
    public static ArrayList<Reproductor> reproductor = new ArrayList<Reproductor>();
    public static ArrayList<String> nomCanciones = new ArrayList<String>();
    public static ArrayList<Integer> votaciones = new ArrayList<Integer>();
    private static int cancionAnterior=0;
    ArrayList clientOutputStrams;
    public static int ordenCanciones=0;
    public static boolean parar=true;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdelante;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBajar;
    private javax.swing.JButton btnBuscarMusica;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnParar;
    private javax.swing.JButton btnPlayLista;
    private javax.swing.JButton btnSubir;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JScrollPane jScrollPane4;
    private static javax.swing.JList listaCanciones;
    // End of variables declaration//GEN-END:variables
    
    public static void reproducir(int i) 
    {  
       if(i<reproductor.size() && i>=0)
        {
             reproductor.get(i).play();
             ventanaMusica.parar=true;
        }
    }
    public static void stopAll()
    {   
        ventanaMusica.parar=false;
        for(int i=0;i<reproductor.size();i++)
        {
            reproductor.get(i).stop();
        }
    }

    public static void stop(int i) 
    {
       if(i<reproductor.size() && i>=0)
        {
            parar=false;
            reproductor.get(i).stop();
            
        }
    }
    public static void reproducirSiguiente()
    {
        int x=0;
        for(int i=0;i<votaciones.size();i++)
        {
            if(votaciones.get(i)>x&&cancionAnterior!=i)
            {
                x=i;
            }
        }
        reproducir(x);
    }
    private static void moverItemAbajo(int indice) 
    {  
        DefaultListModel arreglo =(DefaultListModel) listaCanciones.getModel(); 
        if(indice+1 <= listaCanciones.getLastVisibleIndex())
        {  
            Object obj1 = listaCanciones.getModel().getElementAt(indice);   
            Object obj2 = listaCanciones.getModel().getElementAt(indice+1);  
            Reproductor reproductorMusica = reproductor.get(indice);
            Reproductor reproductorMusica2 = reproductor.get(indice+1);
            String nombre1 = nomCanciones.get(indice);
            String nombre2 = nomCanciones.get(indice+1);
            int i = votaciones.get(indice);
            int j = votaciones.get(indice+1);
            arreglo.set(indice, obj2);
            arreglo.set(indice+1,obj1);
            reproductor.set(indice, reproductorMusica2);
            reproductor.set(indice+1, reproductorMusica);
            votaciones.set(indice, j);
            votaciones.set(indice+1, i);
            nomCanciones.set(indice, nombre2);
            nomCanciones.set(indice+1, nombre1);
            listaCanciones.setModel(arreglo);
            listaCanciones.setSelectedIndex(indice+1);
        }   
        
    }
    private static void moverItemArriba(int indice) 
    {  
        DefaultListModel arreglo =(DefaultListModel) listaCanciones.getModel(); 
        if(indice-1>= 0 )
        {  
            Object obj1 = listaCanciones.getModel().getElementAt(indice);   
            Object obj2 = listaCanciones.getModel().getElementAt(indice-1);  
            Reproductor reproductorMusica = reproductor.get(indice);
            Reproductor reproductorMusica2 = reproductor.get(indice-1);
            arreglo.set(indice, obj2);
            arreglo.set(indice-1,obj1);
            String nombre1 = nomCanciones.get(indice);
            String nombre2 = nomCanciones.get(indice+1);
            reproductor.set(indice, reproductorMusica2);
            reproductor.set(indice-1, reproductorMusica);
             int i = votaciones.get(indice);
            int j = votaciones.get(indice+1);
            votaciones.set(indice, j);
            votaciones.set(indice-1, i);
            nomCanciones.set(indice, nombre2);
            nomCanciones.set(indice-1, nombre1);
            listaCanciones.setModel(arreglo);    
            listaCanciones.setSelectedIndex(indice-1);
        }           
        
    }
    public static void Votacion(String seleccion)
    {
        int seleccionIndice=0;
        for(int i=0;i<votaciones.size();i++)
        {
            if(nomCanciones.get(i).compareToIgnoreCase(seleccion)==0)
            {
                seleccionIndice=i;
                break;
            }
        }
        int valor = ventanaMusica.votaciones.get(seleccionIndice)+1;
        ventanaMusica.votaciones.set(seleccionIndice,valor);
        for(int i=0;i<votaciones.size();i++)
        {
           for(int j=1; j<votaciones.size()-i;j++)
           {
               if(votaciones.get(j-1)>votaciones.get(j))
               {
                   moverItemAbajo(j);
               }
           }
        }
    }
}
