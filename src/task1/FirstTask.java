package task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


//The method takes a list of names.
// Returns a string of the form "1. Ivan, 3. Peter ...",
// only with names on odd indices, respectively.
public class FirstTask {
    public String prepareAndExecute() {
        List<String> listOfNames = new ArrayList<>();

        listOfNames.add("Sergiy");
        listOfNames.add("Maria");
        listOfNames.add("Volodymyr");
        listOfNames.add("Ivan");
        listOfNames.add("Petro");
        listOfNames.add("Kim");
        listOfNames.add("Winston");
        listOfNames.add("Jong");
        listOfNames.add("Teodor");
        listOfNames.add("Un");

        return execute(listOfNames);
    }

    private String execute(List<String> listOfNames) {
        return IntStream.range(0, listOfNames.size()).filter(i -> i % 2 != 0)
                .mapToObj(i -> i + ". " + listOfNames.get(i)).collect(Collectors.joining(", "));
    }
}
