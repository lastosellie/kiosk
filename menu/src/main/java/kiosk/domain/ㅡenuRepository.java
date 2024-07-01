package kiosk.domain;

import java.util.Date;
import java.util.List;
import kiosk.domain.*;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "ㅡenus", path = "ㅡenus")
public interface ㅡenuRepository
    extends PagingAndSortingRepository<ㅡenu, Long> {}
