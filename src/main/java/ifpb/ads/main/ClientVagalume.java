package ifpb.ads.main;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 20/12/2017, 13:27:52
 */
public class ClientVagalume {

    public static void main(String[] args) {
        String uri = "https://api.vagalume.com.br";
        Client client = ClientBuilder.newClient();
        WebTarget root = client.target(uri).path("rank.php");

        WebTarget comments = root.queryParam("type", "alb")
                .queryParam("radio", "coca-cola-fm")
                .queryParam("apikey", "660a4395f992ff67786584e238f501aa");
        Response response = comments.request().get();
        String json = response.readEntity(String.class);
        System.out.println("json = " + json);
        
//        ObjectMapper mapper = new ObjectMapper()
//                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }
}
