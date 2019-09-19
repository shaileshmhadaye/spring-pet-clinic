package com.neo.services;

import com.neo.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastname);
}
