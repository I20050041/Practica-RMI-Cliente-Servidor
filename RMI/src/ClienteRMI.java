
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ClienteRMI extends Remote
{
    public String helloTo(String name) throws RemoteException;
    }