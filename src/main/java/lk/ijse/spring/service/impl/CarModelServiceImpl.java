package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.CarModelDTO;
import lk.ijse.spring.entity.CarModel;
import lk.ijse.spring.repo.CarModelRepo;
import lk.ijse.spring.service.CarModelService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CarModelServiceImpl implements CarModelService {

    @Autowired
    CarModelRepo repo;

    @Autowired
    ModelMapper mapper;

    @Override
    public void addCarModel(CarModelDTO dto) {
        if (!repo.existsById(dto.getModelId())){
            repo.save(mapper.map(dto, CarModel.class));
        }else {
            throw new RuntimeException("Car Model Id Already Exist !");
        }
    }

    @Override
    public void updateCarModel(CarModelDTO dto) {
        if (!repo.existsById(dto.getModelId())){
            repo.save(mapper.map(dto, CarModel.class));
        }else {
            throw new RuntimeException("No Car Model for This Id !");
        }
    }

    @Override
    public void deleteCarModel(String modelId) {
        if (repo.existsById(modelId)){
            repo.deleteById(modelId);
        }else{
            throw new RuntimeException("No Car Model for "+modelId);
        }
    }

    @Override
    public CarModelDTO searchCarModel(String modelId) {
        Optional<CarModel> model = repo.findById(modelId);
        if (model.isPresent()){
            return mapper.map(model.get(), CarModelDTO.class);
        }else{
            throw new RuntimeException("No Car Model for "+modelId);
        }
    }

    @Override
    public List<CarModelDTO> getAllCarModels() {
        List<CarModel> all = repo.findAll();
        return mapper.map(all, new TypeToken<List<CarModelDTO>>(){}.getType());
    }
}
