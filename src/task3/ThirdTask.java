package task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


//Given  and collection = Arrays.asList ("1, 2, 0", "4, 5")
//From the collection get all the numbers listed, separated by commas from all the elements
public class ThirdTask {
    public String prepareAndExecute() {
        List<String> list = Arrays.asList("1, 2, 0", "4, 5");

        return execute(list);
    }

    private String execute(List<String> listToProcess) {
        return listToProcess.stream()
                .map(elem -> elem.split(",\\s"))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList())
                .stream()
                .collect(Collectors.joining(", "));
    }
}
