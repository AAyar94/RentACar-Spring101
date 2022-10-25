package kodlama.io.RentACar.business.concretes;

import kodlama.io.RentACar.business.abstracts.BrandService;
import kodlama.io.RentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.RentACar.entities.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service //Bu sınıf bir business nesnesi
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;
    @Autowired
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAll() {
        //iş kuralları alanı
        return brandRepository.getAll();
    }
}
