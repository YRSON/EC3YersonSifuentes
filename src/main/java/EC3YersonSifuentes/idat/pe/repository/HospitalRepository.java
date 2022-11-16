package EC3YersonSifuentes.idat.pe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EC3YersonSifuentes.idat.pe.model.Hospital;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Integer>{

}
