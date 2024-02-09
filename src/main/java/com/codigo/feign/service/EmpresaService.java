package com.codigo.feign.service;


import com.codigo.feign.aggregates.request.EmpresaResquest;
import com.codigo.feign.aggregates.response.BaseResponse;
import org.springframework.stereotype.Service;



@Service
public interface EmpresaService {

    BaseResponse crearEmpresa(EmpresaResquest empresaRequest);

    BaseResponse getInfoSunat(String numero);

}
