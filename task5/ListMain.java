import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListMain {
    public static void main(String[] args) {
        
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        //isEmpty() method is used for checking whether the string is empty or not.
        //.toList() method is used for collecting objects in a list. 
        //filter() method is used for filtering objects which satisfy the condition(!item.isEmpty()) 
        System.out.println(strings.stream().filter(item ->!item.isEmpty()).collect(Collectors.toList()));
   
    }
}