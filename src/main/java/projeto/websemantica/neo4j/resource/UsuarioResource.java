package projeto.websemantica.neo4j.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projeto.websemantica.neo4j.model.Usuario;
import projeto.websemantica.neo4j.service.UsuarioService;

import java.util.Collection;

@RestController
@RequestMapping("/rest/neo4j/usuarios")
public class UsuarioResource {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping
    public Collection<Usuario> getAll() {
        return usuarioService.getAll();
    }
}
