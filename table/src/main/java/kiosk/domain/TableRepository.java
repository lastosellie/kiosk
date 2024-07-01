package kiosk.domain;

import kiosk.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "tables", path = "tables")
public interface TableRepository
    extends PagingAndSortingRepository<Table, Long> {}
