package kiosk.domain;

import kiosk.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "restaurantTables",
    path = "restaurantTables"
)
public interface RestaurantTableRepository
    extends PagingAndSortingRepository<RestaurantTable, Long> {}
