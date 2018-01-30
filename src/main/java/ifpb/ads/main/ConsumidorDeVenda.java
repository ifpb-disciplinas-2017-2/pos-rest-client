package ifpb.ads.main;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 30/01/2018, 14:46:13
 */
public class ConsumidorDeVenda {

    public static void main(String[] args) {
        String uri = "http://localhost:8080/pos-vendas/api";
        Client client = ClientBuilder.newClient();
        WebTarget root = client.target(uri).register(new VendaAuthorization("admin", "mesmacoisa"));
        //http://localhost:8080/pos-vendas/api/venda/3

        WebTarget venda = root.path("venda/{id}").resolveTemplate("id", "3");
        Response get = venda.request()
                //                .header("Authorization", "Basic YWRtaW46bWVzbWFjb2lzYQ==")
                .get();
        System.out.println(get.readEntity(String.class));

        Response all = root.path("venda")
                .request()
                .get();
        System.out.println(all.readEntity(String.class));
    }
}
