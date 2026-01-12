package URILesson;

import java.net.URI;
import java.net.URISyntaxException;

public class Main {
    public static void main(String args[]) throws URISyntaxException {
        String url = "https://google.com/adf///&adf=adfadfdadfadf";
        URI uri = new URI(url);
        System.out.println("uri: " + uri.normalize());
    }
}
