package kiosk.external;

import java.util.Date;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "menu", url = "${api.url.menu}")
public interface ㅡenuService {
    @GetMapping(path = "/ㅡenus/search/findByGetMenu")
    public ㅡenu getMenu(@PathVariable("id") Long id);
}
