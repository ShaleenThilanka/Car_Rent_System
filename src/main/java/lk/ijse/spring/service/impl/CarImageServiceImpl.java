package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.CarImageDTO;
import lk.ijse.spring.entity.CarImage;
import lk.ijse.spring.repo.CarImageRepo;
import lk.ijse.spring.service.CarImageService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CarImageServiceImpl implements CarImageService {

    @Autowired
    CarImageRepo repo;

    @Autowired
    ModelMapper mapper;

    @Override
    public void addCarImage(CarImageDTO dto) {
        if (!repo.existsById(dto.getImageId())){
            repo.save(mapper.map(dto, CarImage.class));
        }else {
            throw new RuntimeException("Car Image Id Alrady Exist !");
        }
    }

    @Override
    public void updateCarImage(CarImageDTO dto) {
        if (!repo.existsById(dto.getImageId())){
            repo.save(mapper.map(dto, CarImage.class));
        }else {
            throw new RuntimeException("This Image Id Doesn't Exist !");
        }
    }

    @Override
    public CarImageDTO searchCar(String imageId) {
        Optional<CarImage> carImage = repo.findById(imageId);
        if (carImage.isPresent()){
            return mapper.map(carImage.get(), CarImageDTO.class);
        }else {
            throw new RuntimeException("No Car Images for "+imageId);
        }
    }

    @Override
    public void deleteCarImage(String imageId) {
        if (repo.existsById(imageId)){
            repo.deleteById(imageId);
        }else {
            throw new RuntimeException("This Id is Doesn't Exixt "+imageId);
        }
    }

    @Override
    public List<CarImageDTO> getAllCarImages() {
        List<CarImage> all = repo.findAll();
        return mapper.map(all, new TypeToken<List<CarImageDTO>>(){}.getType());
    }
}
