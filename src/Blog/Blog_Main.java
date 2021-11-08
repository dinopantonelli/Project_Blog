package Blog;
import javax.swing.*;


import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Blog_Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco_Blog mimarco=new Marco_Blog();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	
		
	}

}

class Marco_Blog extends JFrame{

    public Marco_Blog(){

      setTitle("Bloggin App");
      setBounds(400,200,400,200);
      LaminaBlog milamina=new LaminaBlog();
      add(milamina);
      //pack();//el contenedor se tiene que adaptar a lo que contiene, se adapta a los botones comentar setBounds

   }
 }


class LaminaBlog extends JPanel{  

    public LaminaBlog(){

     
      JPanel milamina2=new JPanel();                  //nueva lamina
      milamina2.setLayout(new GridLayout(2,2));
      tarea_1= new JButton("Tarea 1");
      tarea_2= new JButton("Tarea 2");
      milamina2.add(tarea_1);
      milamina2.add(tarea_2);
      tarea_3= new JButton("Tarea 3");
      tarea_4= new JButton("Tarea 4");
      milamina2.add(tarea_3);
      milamina2.add(tarea_4);
      
      tarea_1.addActionListener(new AccionMostrar());
      tarea_2.addActionListener(new AccionMostrar());
      tarea_3.addActionListener(new AccionMostrar());
      tarea_4.addActionListener(new AccionMostrar());
      
      setLayout(new BorderLayout());
      add(milamina2,BorderLayout.CENTER);
  } 
    
    
    private class AccionMostrar implements ActionListener{

        //tendria que fabricarme un constructor que tenga como parametro  lo que esta marcado
        
         
         public void actionPerformed(ActionEvent e){
        	 
        	opcion_tarea=e.getActionCommand();        	 
        	Marco_Tarea mimarco_tarea=new Marco_Tarea();
     		//mimarco_tarea.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     		mimarco_tarea.setVisible(true);
       	  
       	
         }
         
       
    } 
    
    private  class Marco_Tarea extends JFrame{

        public Marco_Tarea(){
       	 
          setTitle(opcion_tarea);
          setBounds(500,200,300,400);
          setLayout(new BorderLayout());
          
          resultado= new JTextArea(4,50);
  		  resultado.setEditable(false);
  		  add(resultado, BorderLayout.CENTER);
        
  		  //pack();//el contenedor se tiene que adaptar a lo que contiene, se adapta a los botones comentar setBounds
  		  //resultado.setText("Hola Puto");
  		 JButton botonagregatarea=new JButton("Agregar Tarea");	
         add(botonagregatarea, BorderLayout.SOUTH);
         botonagregatarea.addActionListener(new Accionagregartarea()); 
       }
        
    }
        
        private class Accionagregartarea implements ActionListener{

            
             public void actionPerformed(ActionEvent e){
            	 
            	 ArrayList_Dino mi_tarea1= new ArrayList_Dino(4);
            	 ArrayList_Dino mi_tarea2= new ArrayList_Dino(4);
            	 ArrayList_Dino mi_tarea3= new ArrayList_Dino(4);
            	 ArrayList_Dino mi_tarea4= new ArrayList_Dino(4);
            	 
            	 if(opcion_tarea.equals("Tarea 1")){
                  mi_tarea1.add(JOptionPane.showInputDialog("Ingrese el titulo de la tarea:"));
                  //try{ 
                     
                     // FileWriter escritura1=new FileWriter("src/Blog/tarea_1.txt",true);//con el true pone una frase a continuacion de otra
                     //    for(int i=0;i<frase.length();i++){
                          
                    //      escritura1.write(frase.charAt(i));
                          
                         //}
                      //escritura1.close();
                    //  }catch (IOException e1){
                   //     e1.printStackTrace(); 
                  // }
                  
                  mi_tarea1.add(JOptionPane.showInputDialog("Ingrese la tarea:"));	
                  mi_tarea1.add(JOptionPane.showInputDialog("Ingrese la fecha tope de la tarea (XX/XX/XXXX):"));
            		
                 } 
            	 
            	 if(opcion_tarea.equals("Tarea 2")){
                     
                 }
            	 
            	 if(opcion_tarea.equals("Tarea 3")){
                     
                 }
            	 
            	 if(opcion_tarea.equals("Tarea 4")){
                     
                 }
            	 
            	 
            	 
            	           	
             }
                        
     } 
        
  
    
   
    
    private JTextArea resultado;	
    String opcion_tarea;
    private JButton tarea_1;
    private JButton tarea_2;
    private JButton tarea_3;
    private JButton tarea_4;
  
}
