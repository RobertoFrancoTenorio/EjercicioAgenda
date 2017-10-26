
import java.util.Scanner;

public class AplicacionTerminal
{
    private Agenda agenda;

    public AplicacionTerminal()
    {
        agenda = new Agenda();
    }

    public void demo()
    {
        Contacto c1= new Contacto("Roberto", ""  +   " uaslp", 1234567890);
        Contacto c2= new Contacto("Carlos", ""   +   " UASLP", 1234567880);
        Contacto c3= new Contacto("Franco", "" + " U.A.S.L.P", 1234566890);

        //Agenda agenda = new Agenda();

        agenda.agregaContacto(c1);
        agenda.agregaContacto(c2);
        agenda.agregaContacto(c3);
        agenda.imprimeTodo();
    }

    public void entradaUsuario()
    {
        Scanner entrada = new Scanner(System.in);
        String opcion= "";
        do{
            try{
                System.out.println("Opciones: agregar - imprimir - terminar");
                opcion= entrada.nextLine();
                switch(opcion) {
                    case "agregar":
                        agregar(entrada);
                        break;
                    case "imprimir":
                        agenda.imprimeTodo();
                        break;
                }
            }
            catch (IllegalArgumentException ex)
            {
                System.out.println(ex.getMessage());
                opcion= "";
            }
        }while(opcion!="terminar");
    }


    public void agregar(Scanner entrada)
    {
        System.out.println("Agregar un contacto: ");
        System.out.println("Nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("Direccion: ");
        String direccion= entrada.nextLine();
        System.out.println("Tel: ");
        long tel =  entrada.nextLong();
        Contacto contacto= new Contacto(nombre,direccion,tel);
        agenda.agregaContacto(contacto);
    }

    public static void main(String args[])
    {
        AplicacionTerminal aplicacion =  new AplicacionTerminal();
        //aplicacion.demo();
        aplicacion.entradaUsuario();
    }
}

