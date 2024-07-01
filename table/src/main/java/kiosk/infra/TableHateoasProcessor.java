package kiosk.infra;

import kiosk.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class TableHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Table>> {

    @Override
    public EntityModel<Table> process(EntityModel<Table> model) {
        return model;
    }
}
