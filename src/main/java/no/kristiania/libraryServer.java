package no.kristiania;

import org.mortbay.jetty.Server;

public class libraryServer {

    private  final Server server = new Server(9080);
    public void start() throws Exception {
        server.start();
    }
    public static void main(String[] args) throws Exception {
       new libraryServer().start();
    }
}
