package lk.ijse.spring.repo;

import lk.ijse.spring.entity.CarModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarModelRepo extends JpaRepository<CarModel,String> {
}
