import java.util.List;

public class Main {
    public static void main(String[] args) {
        Election e = new Election();
        List<Candidate> loaded = e.populateCandidates("kandydaci.txt");
        System.out.println("Wczytane:");
        for (Candidate c : loaded) {
            System.out.println(c);
        }
    }
}