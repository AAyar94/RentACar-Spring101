package kodlama.io.RentACar.dataAccess.abstracts;

import kodlama.io.RentACar.entities.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface BrandRepository {
    List<Brand> getAll();


}