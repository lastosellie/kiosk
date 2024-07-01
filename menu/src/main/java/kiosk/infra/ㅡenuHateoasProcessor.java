package kiosk.infra;

import kiosk.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class ㅡenuHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<ㅡenu>> {

    @Override
    public EntityModel<ㅡenu> process(EntityModel<ㅡenu> model) {
        return model;
    }
}
