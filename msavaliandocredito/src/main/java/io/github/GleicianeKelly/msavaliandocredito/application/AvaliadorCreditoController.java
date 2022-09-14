package io.github.GleicianeKelly.msavaliandocredito.application;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/avaliacoes-credito")
public class AvaliadorCreditoController{


    public String ok(){
        return "ok";
    }
}
