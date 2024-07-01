package kiosk.domain;

import kiosk.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "sales", path = "sales")
public interface SalesRepository
    extends PagingAndSortingRepository<Sales, Long> {}
