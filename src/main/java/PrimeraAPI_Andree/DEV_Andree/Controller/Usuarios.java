package PrimeraAPI_Andree.DEV_Andree.Controller;

import PrimeraAPI_Andree.DEV_Andree.Models.DTO.DTOUsuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/apiUsers")

public class Usuarios {

    @GetMapping("/getUsers")
    public List<DTOUsuario> dataUsers(){

        return null;
    }

}
