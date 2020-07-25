
import org.python.util.PythonInterpreter;


public class Main
{
    public static void main(String[] args)
    {
        PythonInterpreter mkz = new PythonInterpreter();
        
        mkz.exec("print('Hello Python World!')");
        mkz.exec("print('MKZ')");
    }
 
    
}
