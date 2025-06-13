package PrimeraAPI_Andree.DEV_Andree.Controller;

import PrimeraAPI_Andree.DEV_Andree.Models.DTO.DTOUsuario;
import PrimeraAPI_Andree.DEV_Andree.Models.Repository.InterfaceUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/apiUsers")

public class Usuarios {

    @Autowired
    private InterfaceUsuario acceso;

    @GetMapping("/getUsers")
    public List<DTOUsuario> dataUsers(){

        return acceso.obtenerDatos();
    }

}
