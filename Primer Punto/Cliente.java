import java.util.List;

public class Cliente {

    List<Compras> compras;

    public void imprimirInformacionPersonalCliente() {
        System.out.println("Nombre: " + "Antonio");
        System.out.println("Apellido 1: " + "Zapata");
        System.out.println("Apellido 2: " + "Restrepo");
        System.out.println("Apellido 2: " + "Restrepo");        
    }

    
    public void imprimirTodaInformacionCliente() {
        System.out.println("Nombre: " + "Antonio");
        System.out.println("Apellido 1: " + "Zapata");
        System.out.println("Apellido 2: " + "Restrepo");
        System.out.println("Número de documento : " + "123456789");    
        
        for(Compras comprasLocal : compras) {
            System.out.println(comprasLocal);
        }
    }
    
    
}
