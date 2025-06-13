package PrimeraAPI_Andree.DEV_Andree.Models.Repository;

import PrimeraAPI_Andree.DEV_Andree.Models.DTO.DTOUsuario;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import java.util.List;

@Transactional //Libreria depende de jakarta-transaction-api

public class RepositoryUsuario implements  InterfaceUsuario{

    @PersistenceContext
    private EntityManager entityManager;

    @Override @Transactional
    public List<DTOUsuario> obtenerDatos(){
        String query = "FROM DTOUsuario";
        return entityManager.createQuery(query).getResultList();
    }

}
