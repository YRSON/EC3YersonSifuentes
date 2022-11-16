package EC3YersonSifuentes.idat.pe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import EC3YersonSifuentes.idat.pe.model.UsuarioCliente;
import EC3YersonSifuentes.idat.pe.repository.UsuarioRepository;

@Service
public class UsuarioServiceImp implements UsuarioService {
	
	@Autowired
	private UsuarioRepository repositorio;
	
	@Override
	public void guardar(UsuarioCliente usuario) {
		repositorio.save(usuario);
	}

	@Override
	public void actualizar(UsuarioCliente usuario) {
		repositorio.saveAndFlush(usuario);
	}

	@Override
	public void eliminar(Integer id) {
		repositorio.deleteById(id);
	}

	@Override
	public List<UsuarioCliente> listar() {
		return repositorio.findAll();
	}

	@Override	
	public UsuarioCliente obtener(Integer id) {
		return repositorio.findById(id).orElse(null);
	}

}
