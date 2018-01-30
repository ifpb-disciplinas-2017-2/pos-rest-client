package ifpb.ads.main;

import java.io.IOException;
import java.util.Base64;
import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 30/01/2018, 14:53:20
 */
public class VendaAuthorization implements ClientRequestFilter {

    private final String usuario;
    private final String senha;

    public VendaAuthorization(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    @Override
    public void filter(ClientRequestContext requestContext) throws IOException {
        String header = new String(Base64.getEncoder()
                .encode((usuario + ":" + senha).getBytes()));
        requestContext.getHeaders().add("Authorization", "Basic " + header);
    }

}
