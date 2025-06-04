import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapMain {
    public static void main(String[] args) {
        
        Stream names = Stream.of("aBc", "d", "ef");
        //.toString() is used for converting object to string.
        //.toUpperCase() is used for converting string to uppercase.
        //.toList() is used to collect all objects as List. 
        System.out.println(names.map(name -> (name.toString()).toUpperCase()).collect(Collectors.toList()));
    }
}