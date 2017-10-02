package desafio.dribbble.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import desafio.dribbble.domain.Shot;
import desafio.dribbble.service.DribbbleService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class DribbbleController
{
    @Autowired
    private DribbbleService service;

    @RequestMapping("/popular-shots")
    @ResponseBody
    public List<Shot> getShots()
    {
        return service.getMostPopularShots();
    }
}
