package kiosk.infra;

import java.util.List;
import kiosk.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "menuPages", path = "menuPages")
public interface MenuPageRepository
    extends PagingAndSortingRepository<MenuPage, Long> {
    List<MenuPage> findByMenuId(String menuId);
}
