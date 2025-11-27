package server;

import server.exceptions.HttpServerException;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServer {

    private final int port;

    public HttpServer(int port) {
        this.port = port;
    }

    public void start() throws HttpServerException {
        try{
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server iniciado na porta: " + port);

            while(true){
                Socket clientSocket = serverSocket.accept();
                System.out.println("Cliente conectado: " + clientSocket.getInetAddress().getHostAddress());
            }
        } catch (IOException e){
            throw new HttpServerException("Erro ao iniciar o servidor na porta:" + port, e);
        }
    }
}
