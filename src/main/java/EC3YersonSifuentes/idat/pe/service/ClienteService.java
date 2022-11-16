package EC3YersonSifuentes.idat.pe.service;

import java.util.List;

import EC3YersonSifuentes.idat.pe.model.Cliente;

public interface ClienteService {
	void guardar(Cliente cliente);
	void actualizar(Cliente cliente);
	void eliminar(Integer id);
	List<Cliente> listar();
	Cliente obtener(Integer id);
}
