package mision.agro.mision_agro.model.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Usuario")
public class User {
    @Id
    @Getter @Setter @Column(name = "usuarioId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter @Setter @Column(name = "nombre")
    private String nombre;
    
    @Getter @Setter @Column(name = "emailUsuario", unique = true)
    private String email;

    @Getter @Setter @Column(name = "passwordUsuario")
    private String password;

    @Getter @Setter @Column(name = "telefono")
    private String telefono;

    @ManyToMany(fetch = FetchType.LAZY,
                mappedBy = "usuario")
    private List<Product> producto;

}
