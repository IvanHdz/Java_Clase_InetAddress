
/**
 *
 * @author Jesus Ivan
 */
import java.net.InetAddress;
import java.net.UnknownHostException;

public class DireccionIP {

    public static void main(String[] args) {
        try {
            InetAddress host = InetAddress.getByName("www.google.com.mx");
            System.out.println("Host: " + host);
            //Da la direccion IP
            System.out.println("IP: " + host.getHostAddress());
            //Da el Nombre
            System.out.println("Nombre: " + host.getHostName());
            //Da el local Host y la IP de donde se esta jalando. 
            System.out.println("Localhost: " + InetAddress.getLocalHost());
        } catch (UnknownHostException ex) {
            System.err.println("Host desconocido");
            System.exit(0);
        }
    }
}
