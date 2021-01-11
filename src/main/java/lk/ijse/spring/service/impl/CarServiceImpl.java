package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.CarDTO;
import lk.ijse.spring.entity.Car;
import lk.ijse.spring.repo.CarRepo;
import lk.ijse.spring.service.CarService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.smartcardio.Card;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CarServiceImpl implements CarService {

    @Autowired
    CarRepo repo;

    @Autowired
    ModelMapper mapper;

    @Override
    public void addCar(CarDTO dto) {
        if (!repo.existsById(dto.getCarId())){
            repo.save(mapper.map(dto, Car.class));
        }else {
            throw new RuntimeException("Car Id Already Exist !");
        }
    }

    @Override
    public void updateCar(CarDTO dto) {
        if (!repo.existsById(dto.getCarId())){
            repo.save(mapper.map(dto, Car.class));
        }else {
            throw new RuntimeException("Car Id Doesn't Exist !");
        }
    }

    @Override
    public void deleteCar(String carId) {
        if (repo.existsById(carId)){
            repo.deleteById(carId);
        }else {
            throw new RuntimeException("No Car for "+carId);
        }
    }

    @Override
    public CarDTO searchCar(String carId) {
        Optional<Car> car = repo.findById(carId);
        if (car.isPresent()){
            return mapper.map(car.get(), CarDTO.class);
        }else {
            throw new RuntimeException("No Car for "+carId);
        }
    }

    @Override
    public List<CarDTO> getAllCars() {
        List<Car> all = repo.findAll();
        return mapper.map(all, new TypeToken<List<CarDTO>>(){}.getType());
    }
}
