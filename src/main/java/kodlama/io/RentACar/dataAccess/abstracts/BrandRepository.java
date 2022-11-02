package kodlama.io.RentACar.dataAccess.abstracts;

import kodlama.io.RentACar.entities.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand,Integer>{

}
