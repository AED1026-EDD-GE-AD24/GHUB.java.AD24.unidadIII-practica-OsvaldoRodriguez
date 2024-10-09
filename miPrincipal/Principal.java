package miPrincipal;
import java.util.Hashtable;
import hashtable.Persona;
import java.util.Enumeration;
import hashtable.Ciudades;
public class Principal {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        /*Persona p1 = new Persona("Pablo",33,"Argentino");
        Persona p2 = new Persona("Juan",24,"Mexicano");
        Persona p3 = new Persona("Pedro",18,"Español");

        //crear la tabla hash
        Hashtable<String,Persona> tabla = new Hashtable<String,Persona>();
        //agregamos las personas a la tabla 
        tabla.put(p1.getNombre(), p1);
        tabla.put(p2.getNombre(), p2);
        tabla.put(p3.getNombre(), p3);

        //acceder a los elementos de la tabla 
        System.out.println(tabla.get("Pablo"));
        System.out.println(tabla.get("Juan"));
        System.out.println(tabla.get("Pedro"));

        System.out.println(tabla.get("Luis")); //retorna null porque el key Luis no existe

        String aux;
        Enumeration<String> keys = tabla.keys();
        while(keys.hasMoreElements()){
            aux = keys.nextElement();
            System.out.println(aux+" = "+tabla.get(aux));*/
        Ciudades c1 = new Ciudades("Culiacan", "Sinaloa", "Mexico");
        Ciudades c2 = new Ciudades("Los Angeles", "California", "USA");
        Ciudades c3 = new Ciudades("La Plata", "Provincia de Buenos Aires", "Argentina");
    
        Hashtable<String,Ciudades> tabla = new Hashtable<String,Ciudades>();
    
        tabla.put(c1.getCiudad(), c1);
        tabla.put(c2.getCiudad(), c2);
        tabla.put(c3.getCiudad(), c3);
    
        System.out.println(tabla.get("Culiacan"));
        System.out.println(tabla.get("Los Angeles"));
        System.out.println(tabla.get("La Plata"));
    
        System.out.println(tabla.get("Washington"));
    
        String aux;
        Enumeration<String> keys = tabla.keys();
        while(keys.hasMoreElements()){
            aux = keys.nextElement();
            System.out.println(aux+" = "+tabla.get(aux));
       

        }
         

        

    }
}