package kiosk.infra;

import kiosk.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class RestaurantTableHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<RestaurantTable>> {

    @Override
    public EntityModel<RestaurantTable> process(
        EntityModel<RestaurantTable> model
    ) {
        return model;
    }
}
