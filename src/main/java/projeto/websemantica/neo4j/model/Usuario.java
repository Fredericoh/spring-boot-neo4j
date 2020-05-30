package projeto.websemantica.neo4j.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@NodeEntity
public class Usuario {

    @GraphId
    private Long id;

    private String nome;

    private Integer idade;

    @Relationship(type = "RATED", direction = Relationship.INCOMING)
    private List<Filme> filmes;
}
