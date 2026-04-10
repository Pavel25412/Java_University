import java.util.List;

public class Main {
    public static void main(String[] args) {
        Election e = new Election();
        e.populate();
        Vote parsed = Vote.fromCsvLine(
                "gm. Łagiewniki,dzierżoniowski,dolnośląskie,49,205,1908,467,1,68,2,5,795,1,8",
                e);
        System.out.println(parsed);
    }
}