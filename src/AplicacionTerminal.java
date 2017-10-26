public class AplicacionTerminal {
    public static void main(String args[])
    {
        Contacto c1= new Contacto("Roberto", "" +" uaslp", 1234567890);
        Contacto c2= new Contacto("Carlos", "" +" UASLP", 1234567880);
        Contacto c3= new Contacto("Franco", "" +" U.A.S.L.P", 1234566890);

        Agenda agenda = new Agenda();

        agenda.agregaContacto(c1);
        agenda.agregaContacto(c2);
        agenda.agregaContacto(c3);
        agenda.imprimeTodo();
    }
}
