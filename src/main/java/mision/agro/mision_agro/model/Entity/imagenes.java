package mision.agro.mision_agro.model.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "imagenes")
public class imagenes {

    @Id
    @Getter @Setter @Column(name = "imagenId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

}