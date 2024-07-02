package kiosk.infra;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/kitchens")
@Transactional
public class MenuPageController {

    @Autowired
    MenuPageRepository menuPageRepository;
    
}
//>>> Clean Arch / Inbound Adaptor
