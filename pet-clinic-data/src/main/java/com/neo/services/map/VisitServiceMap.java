package com.neo.services.map;

import com.neo.model.Visit;
import com.neo.services.VisitService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VisitServiceMap extends AbstractMapService<Visit, Long> implements VisitService {
    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }

    @Override
    public Visit save(Visit object) {
        if(object.getPet()==null || object.getPet().getOwner()==null || object.getPet().getId()==null ||
                object.getPet().getOwner().getId() == null) {
            throw new RuntimeException("Invalid visit entry");
        }
        return super.save(object.getId(), object);
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }
}