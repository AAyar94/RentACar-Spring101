package kodlama.io.RentACar.entities.entities.concretes;

import lombok.*;

import javax.persistence.*;

@Table(name = "brands")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "name")
    private String name;

}
//National --> natId

//mapping
