package lk.ijse.spring.repo;

import lk.ijse.spring.entity.CarImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarImageRepo extends JpaRepository<CarImage,String> {
}
