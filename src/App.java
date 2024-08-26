import java.lang.reflect.*;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        Class<?> clazz= Class.forName("java.lang.String");
        Method[] methods =clazz.getClass().getMethods();
        System.out.println(Arrays.toString(methods));
    }
}
