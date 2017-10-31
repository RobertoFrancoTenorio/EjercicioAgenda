import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Agenda {
    private LinkedList <Contacto> contactos;

    public Agenda()
    {
        contactos = new LinkedList<Contacto>();
    }

    public void agregaContacto(Contacto nuevo)
    {
        contactos.add(nuevo);
    }

    public void imprimeTodo()
    {
     /*   for(int i=0; i<contactos.size(); i++)
        {
            System.out.println(contactos.get(i));
        }*/
     //For-each
        //Sinraxis
        /*for(tipo var: coleccion)
        {
            acciones con la veriable var
        }
        */
        for (Contacto c : contactos)
        {
            System.out.println(c);
        }
    }

    public void guardar(String s) throws IOException
    {
        FileWriter archivo = new FileWriter(s);
        for(Contacto c : contactos)
        {
            archivo.write(c.toString());
            archivo.write("\n");
        }
        archivo.close();
    }

    public void cargar(String nomArch)throws FileNotFoundException
    {
        Scanner archivo= new Scanner(new File(nomArch));
        while(archivo.hasNextLine()) {
            String linea = archivo.nextLine();
            //System.out.println("Contacto: " + linea);
            String [] arreglo = linea.split(",");
            /*System.out.println("Nom: " +arreglo[0]);
            System.out.println("Dir: " + arreglo[1]);
            System.out.println("Tel: " + arreglo[2]);*/
            long tel = Long.parseLong(arreglo[2].trim());
            Contacto nuevo= new Contacto(arreglo[0],arreglo[1],tel);
            contactos.add(nuevo);
        }
    }
}
