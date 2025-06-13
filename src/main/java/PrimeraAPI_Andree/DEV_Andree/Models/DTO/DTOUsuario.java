package PrimeraAPI_Andree.DEV_Andree.Models.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "USUARIO")
public class DTOUsuario {

    @Id
    @Getter @Setter @Column(name = "ID")
    private  Long id;

    @Getter @Setter @Column(name = "NOMBRE")
    private String nombre;

    @Getter @Setter @Column(name = "APELLIDOS")
    private String apellido;

}
