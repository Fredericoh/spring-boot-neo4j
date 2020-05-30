package projeto.websemantica.neo4j.repository;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import projeto.websemantica.neo4j.model.Usuario;

import java.util.Collection;

public interface UsuarioRepository extends Neo4jRepository<Usuario, Long> {

    @Query("MATCH (u:Usuario)<-[r:RATED]-(f:Filme) RETURN u,r,f")
    Collection<Usuario> getTodosUsuarios();
}
