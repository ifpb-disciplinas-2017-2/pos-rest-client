package ifpb.ads.main;

import java.io.IOException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 12/12/2017, 13:36:10
 */
public class Main {

    public static void main(String[] args) throws IOException {
        String uri = "https://jsonplaceholder.typicode.com";
        Client client = ClientBuilder.newClient();
        WebTarget root = client.target(uri);
        // https://jsonplaceholder.typicode.com/posts
//        Response response = root.path("posts").request().get();
//        String body = response.readEntity(String.class);
//        System.out.println("body = " + body);

        //https://jsonplaceholder.typicode.com/posts/idPost
//        int idPost = 1;
//        WebTarget webPost = root.path("posts").path("{idPost}")
//                .resolveTemplate("idPost", idPost);
//
//        Response response = webPost.request().get();
//        String body = response.readEntity(String.class);
//        System.out.println(body);
        //https://jsonplaceholder.typicode.com/posts/1/comments
//        int idPost = 2;
//        WebTarget comments = root.path("posts/{idPost}/comments")
//                .resolveTemplate("idPost", idPost);
//        Response response = comments.request().get();
//        String body = response.readEntity(String.class);
//        System.out.println(body);
        //https://jsonplaceholder.typicode.com/comments/1
//        int idComment = 1;
//        WebTarget comments = root.path("comments").path("{idComment}")
//                .resolveTemplate("idComment", idComment);
//        Response response = comments.request().get();
//        String json = response.readEntity(String.class);
//        System.out.println(json);
//        ObjectMapper mapper = new ObjectMapper()
//            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//        
//        Comment comment = mapper.readValue(json, Comment.class);
//        System.out.println(comment.email());
        //https://jsonplaceholder.typicode.com/comments
//        WebTarget comments = root.path("comments");
//        Response response = comments.request().get();
//        String json = response.readEntity(String.class);
//        ObjectMapper mapper = new ObjectMapper()
//                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//        List<Comment> lista = mapper.readValue(json, new TypeReference<List<Comment>>() {
//        });
//
//        lista.forEach(c -> System.out.println(c.email() + " - " + c.id()));
    }
}
