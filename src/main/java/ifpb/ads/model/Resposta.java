package ifpb.ads.model;

import java.util.List;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 23/01/2018, 13:23:50
 */
public class Resposta {
    public Album alb;
}

class Album {
    public Mes month;
}

class Mes{
    public List<Musica> all;
}

class Musica {
    public int id;
}