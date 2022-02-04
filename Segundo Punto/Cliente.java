import java.util.List;

public class Cliente {

     
    
    public Cliente(){
        imprimirInformacionPersonal();

        System.out.println("Informacion familiar");
        System.out.println("Estado civil: " + "Casado");
        System.out.println("Cabtidad de hijos: " + "3");
        System.out.println("Cantidad de hermanos: " + "4");
        System.out.println("Nombre del padre: " + "Jesús Zapata");
        System.out.println("Nombre de la madre: " + "Patricia Restrepo");

    }
  
        
}

public class InformacionPersonalCliente {

    public void imprimirInformacionPersonal() {

        Persona persona;
        persona = new Persona();
        String nombrePersona = persona.getNombre();
        String apellido1Persona = persona.getPrimerApellido();
        String apellido2Persona = persona.getSegundoApellido();
        String numeroDocumento = Integer.toString(persona.getNumeroDocumento());

        System.out.println("Información Personal");
        System.out.println("Nombre: " + nombrePersona);
        System.out.println("Apellido 1: " + apellido1Persona);
        System.out.println("Apellido 2: " + apellido2Persona);
        System.out.println("Número de documento: " + numeroDocumento);
                
    }

}


public class TodaInformacionCliente {

    List<Compras> cmp;

    public void imprimirTodaInformacionCliente() {
        System.out.println("Nombre: " + "Antonio");
        System.out.println("Apellido 1: " + "Zapata");
        System.out.println("Apellido 2: " + "Restrepo");
        System.out.println("Número de documento : " + "123456789");    
        
        for(Compras cmpLocal : cmp) {
            System.out.println(cmpLocal);
        }
    }

}

