package Blog;
// video 164


   public class ArrayList_Dino{
       
       public ArrayList_Dino(int z){
           
           datosElemento=new Object[z];
       }
       
       public Object get(int i){
           
           return datosElemento[i];
           
       }
       
       public void add(Object o){  // le paso por argumento un objeto
           
           datosElemento[i]=o;
           i++;
           
       }
       
       
       
       
       private Object[] datosElemento;// es un array normal
       
       private int i=0;
       
   }
   