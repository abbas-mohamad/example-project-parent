package com.example.parameter.boot.services;

import com.example.parameter.services.ParameterService;
import org.springframework.stereotype.Service;

@Service
public class ParameterClientServiceImpl implements ParameterClientService {

    private final ParameterService parameterService;

    public ParameterClientServiceImpl(ParameterService parameterService) {
        this.parameterService = parameterService;
    }

    @Override
    public String getValue(String id) {
        return parameterService.getParameterValue(id);
    }

}
