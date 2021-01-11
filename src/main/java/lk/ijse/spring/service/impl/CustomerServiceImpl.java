package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepo repo;

    @Autowired
    ModelMapper mapper;

    @Override
    public void saveCustomer(CustomerDTO dto){
        if (!repo.existsById(dto.getCustomerId())){
            Customer c = mapper.map(dto, Customer.class);
            repo.save(c);
        }else{
            throw new RuntimeException("Customer Already exist");
        }
//        Customer c = mapper.map(dto, Customer.class);
//        //Customer c = new Customer(dto.getId(),dto.getName(),dto.getAddress(),dto.getSalary());
//        repo.save(c);
    }

    @Override
    public void updateCustomer(CustomerDTO dto) {
        if (!repo.existsById(dto.getCustomerId())){
            Customer c = mapper.map(dto, Customer.class);
            repo.save(c);
        }else{
            throw new RuntimeException("No Such Customer For Update");
        }

    }

    @Override
    public CustomerDTO searchCustomer(String customerId) {
        Optional<Customer> customer = repo.findById(customerId);
        if(customer.isPresent()){
            return mapper.map(customer.get(), CustomerDTO.class);
        }else{
            throw new RuntimeException("No Customer For " +customerId);
        }
    }

    @Override
    public void deleteCustomer(String customerId) {
        if (repo.existsById(customerId)){
            repo.deleteById(customerId);
        }else{
            throw new RuntimeException("No Customer For Delete Id" +customerId);
        }
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        List<Customer> all = repo.findAll();
        return mapper.map(all, new TypeToken<List<CustomerDTO>>(){
        }.getType());
    }
}
