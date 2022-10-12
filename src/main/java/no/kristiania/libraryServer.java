
import no.kristiania.AddbookServerlet;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.util.resource.Resource;
import org.eclipse.jetty.webapp.WebAppContext;
import org.eclipse.jetty.server.Server;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class libraryServer {
private static Logger logger= LoggerFactory.getLogger(libraryServer.class);
    private  final Server server = new Server(9080);
    public void start() throws Exception {
      var webapp = new WebAppContext(
                Resource.newClassPathResource("/webapp"),"/"
        );
        webapp.addServlet(new ServletHolder(new AddbookServerlet()),"/api/addbook");
        server.setHandler(webapp);
        server.start();
        logger.info("started on {}", server.getURI());
    }
    public static void main(String[] args) throws Exception {
       new libraryServer().start();
    }
}
