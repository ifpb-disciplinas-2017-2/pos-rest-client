package ifpb.ads.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 12/12/2017, 14:11:12
 */
@Value.Immutable
@JsonDeserialize(as = ImmutableComment.class)
@JsonSerialize(as = ImmutableComment.class)
public interface Comment {

    public int postId();
    public int id();
    public String name();
    public String email();
    
    
    
    
//    {
//    "postId": 1,
//    "id": 1,
//    "name": "id labore ex et quam laborum",
//    "email": "Eliseo@gardner.biz",
//    "body": "laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium"
//  },
}
