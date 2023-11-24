import java.io.IOException;
// import org.jsoup.*;
// import org.jsoup.nodes.*;

public class App {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");

        String[] data = FileReader.scanData("../data.txt");
        String url = data[0];
        String user = data[1];
        String pw = data[2];

        System.out.println(url);
        System.out.println(user);
        System.out.println(pw);

        // Document pageToScrape = Jsoup.connect(url).get();
        // System.out.println(pageToScrape);
    }
}