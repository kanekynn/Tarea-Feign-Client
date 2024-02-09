package com.codigo.feign.service;

import com.codigo.feign.aggregates.request.PersonaRequest;
import com.codigo.feign.aggregates.response.BaseResponse;
import org.springframework.stereotype.Service;

@Service
public interface PersonaService {
    BaseResponse crearPersona(PersonaRequest personaRequest);

    BaseResponse getInfoReniec(String numero);
}
