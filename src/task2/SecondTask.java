package task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


//The method map list of string to uppercase and then sort descending.
public class SecondTask {
    public List<String> prepareAndExecute() {
        List<String> listToProcess = new ArrayList<>();

        listToProcess.add("lOweЯCa5E");
        listToProcess.add("UppeЯCaЖe");
        listToProcess.add("PoWER");
        listToProcess.add("uNliMITed");
        listToProcess.add("PoWEЯ");
        listToProcess.add(" proPeRty,");
        listToProcess.add("applicationINCase");
        listToProcess.add(".ofView");

        return execute(listToProcess);
    }

    private List<String> execute(List<String> listToProcess) {
        return listToProcess.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
