import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> dellFeatures = new ArrayList<>();
        dellFeatures.add("Camera");
        dellFeatures.add("Intel i7")

        Computer dellXps = new Computer("Dell XPS", 18995.95, dellFeatures);

        System.out.println(dellXps);


    }
}
