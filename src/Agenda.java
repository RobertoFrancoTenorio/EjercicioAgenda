import java.util.LinkedList;

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
}
