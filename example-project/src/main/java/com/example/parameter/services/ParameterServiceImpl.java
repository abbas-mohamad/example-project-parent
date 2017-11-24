package com.example.parameter.services;

import com.example.parameter.dao.ParameterDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParameterServiceImpl implements ParameterService {

    @Autowired
    private ParameterDao parameterDao;

    @Override
    public String getParameterValue(final String id) {
        return parameterDao.findParameter(id).getValue();
    }

}
