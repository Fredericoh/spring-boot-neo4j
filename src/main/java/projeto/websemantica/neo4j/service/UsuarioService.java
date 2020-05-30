package projeto.websemantica.neo4j.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projeto.websemantica.neo4j.model.Usuario;
import projeto.websemantica.neo4j.repository.UsuarioRepository;

import java.util.Collection;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public Collection<Usuario> getAll() {
        return usuarioRepository.getTodosUsuarios();
    }
}
