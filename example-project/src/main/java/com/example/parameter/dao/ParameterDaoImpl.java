package com.example.parameter.dao;

import com.example.parameter.data.bean.Parameter;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class ParameterDaoImpl implements ParameterDao {

    @PersistenceContext(unitName = "parameter-pu")
    private EntityManager entityManager;

    public Parameter findParameter(String id) {
        return entityManager.find(Parameter.class, id);
    }

}
