package EC3YersonSifuentes.idat.pe.service;

import java.util.List;

import EC3YersonSifuentes.idat.pe.model.UsuarioCliente;

public interface UsuarioService {
	void guardar(UsuarioCliente usuario);
	void actualizar(UsuarioCliente usuario);
	void eliminar(Integer id);
	List<UsuarioCliente> listar();
	UsuarioCliente obtener(Integer id);
}
