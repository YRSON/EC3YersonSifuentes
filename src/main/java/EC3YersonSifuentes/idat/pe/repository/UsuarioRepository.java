package EC3YersonSifuentes.idat.pe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EC3YersonSifuentes.idat.pe.model.UsuarioCliente;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioCliente, Integer>{
	UsuarioCliente findByUsuario(String usuario);
}
