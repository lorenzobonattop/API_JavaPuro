package server;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServer {

    private final int port;

    public HttpServer(int port) {
        this.port = port;
    }

    public void start() throws IOException {
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("Server iniciado na porta: " + port);

        while (true){
            Socket client  = serverSocket.accept();
            System.out.println("Acesso Conectado");
        }
    }
}
