package EC3YersonSifuentes.idat.pe.service;

import java.util.List;

import EC3YersonSifuentes.idat.pe.model.Hospital;

public interface HospitalService {
	void guardar(Hospital hospital);
	void actualizar(Hospital hospital);
	void eliminar(Integer id);
	List<Hospital> listar();
	Hospital obtener(Integer id);
}
