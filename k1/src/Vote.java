import java.util.*;

public class Vote {
    private Map<Candidate, Integer> votesForCandidate;
    private List<String> location;

    public static Vote fromCsvLine(String line, Election e){
        List<String> parsedLocation = new ArrayList<>();
        Map<Candidate, Integer> parsedValues = new HashMap<>();
        System.out.println("line: " + line);
        String[] elements = line.split(",", -1);
        System.out.println("elements: "+ Arrays.toString(elements));
        parsedLocation.add(elements[2]);
        parsedLocation.add(elements[1]);
        parsedLocation.add(elements[0]);
        List<Candidate> candidates = e.getCandidates();
        for (int i = 0; i < candidates.size(); i++){
            parsedValues.put(candidates.get(i), Integer.parseInt(elements[i+3]));
        }
        return new Vote(parsedValues, parsedLocation);
    }

    public Vote(Map<Candidate, Integer> votesForCandidate, List<String> location) {
        this.votesForCandidate = votesForCandidate;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Vote{" +
                "votesForCandidate=" + votesForCandidate +
                ", location=" + location +
                '}';
    }
}
