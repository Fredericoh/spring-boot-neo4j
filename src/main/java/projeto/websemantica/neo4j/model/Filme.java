package projeto.websemantica.neo4j.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

@NoArgsConstructor
@AllArgsConstructor
@Data
@NodeEntity
public class Filme {

    @GraphId
    private Long id;

    private String titulo;

    private String diretor;
}
