import server.HttpServer;
import server.exceptions.HttpServerException;

public class Application {
    public static void main(String[] args){
        try {
            HttpServer server = new HttpServer(8080);
            server.start();
        } catch (HttpServerException e) {
            e.printStackTrace();
        }
    }
}