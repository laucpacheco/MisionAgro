package mision.agro.mision_agro.model.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
// JPA
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Producto")
public class Product {

    @Id
    @Getter @Setter @Column(name = "productoId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Getter @Setter @Column(name = "nombre")
    private String nombre;

    @Getter @Setter @Column(name = "descripcion")
    private String descripcion;

    @Getter @Setter @Column(name = "imagenUrl")
    private String imagen;

    @ManyToMany(fetch = FetchType.LAZY, 
                cascade = CascadeType.ALL)
    @JoinTable(name = "producto_user", 
        joinColumns=@JoinColumn(name="usuario_Id"), 
        inverseJoinColumns=@JoinColumn(name="producto_Id"))
        private List<User> usuario;

    @ManyToOne(fetch = FetchType.LAZY,
    cascade = CascadeType.ALL)
    @JoinColumn(name = "categoria_id")
    private Category categoria ;

}