package kodlama.io.RentACar.business.abstracts;

import kodlama.io.RentACar.entities.entities.concretes.Brand;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BrandService {
    List<Brand> getAll();
}
