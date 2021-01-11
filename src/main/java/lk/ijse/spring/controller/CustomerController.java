package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.service.CustomerService;
import lk.ijse.spring.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/customer")
@CrossOrigin
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity addCustomer(@RequestBody CustomerDTO dto){
        customerService.saveCustomer(dto);
        StandardResponse response = new StandardResponse(200, "Success", null);
        return new ResponseEntity(response, HttpStatus.OK);
       // return dto.toString();
    }

    @DeleteMapping(params = {"id"})
    public ResponseEntity deleteCustomer(@RequestParam String id){
        customerService.deleteCustomer(id);
        StandardResponse response = new StandardResponse(200,"Success",null);
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity updateCustomer(@RequestBody CustomerDTO dto){
        customerService.updateCustomer(dto);
        StandardResponse response = new StandardResponse(200,"Success",null);
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity searchCustomer(@PathVariable String id){
        CustomerDTO customerDTO = customerService.searchCustomer(id);
        return new ResponseEntity(new StandardResponse(200,"Success",customerDTO), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getAllCustomers(){
        List<CustomerDTO> allCustomers = customerService.getAllCustomers();
        return new ResponseEntity(new StandardResponse(200,"Success",allCustomers), HttpStatus.OK);
    }
}
