/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package processo.fattoria.desafio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author usuario
 */
@Controller
public class ProdutoController {

    @RequestMapping(method = RequestMethod.GET, value = "produto")
    public String getAngularPage() {
        return "produto";
    }
}
