package com.mycompany.webservices.rest;

import com.mycompany.webservices.model.Programa;
import java.util.List;

public interface ProgramaService {
    
    List<Programa> listPrograma();
    
    Programa get(Long id);
    
    void save(Programa programa);
    
    void delete(Programa programa);
    
}
