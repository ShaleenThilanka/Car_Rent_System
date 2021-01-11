package lk.ijse.spring.service;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;
import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.entity.Customer;

import java.util.List;

public interface CustomerService {
     void saveCustomer(CustomerDTO dto);

     void updateCustomer(CustomerDTO dto);

     CustomerDTO searchCustomer(String customerId);

     void deleteCustomer(String customerId);

     List<CustomerDTO> getAllCustomers();
}
