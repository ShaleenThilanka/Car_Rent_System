package lk.ijse.spring.controller;

import lk.ijse.spring.dto.AdminDTO;
import lk.ijse.spring.service.AdminService;
import lk.ijse.spring.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/admin")
@CrossOrigin
public class AdminController {

    @Autowired
    AdminService adminService;

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity addAdmin(@RequestBody AdminDTO dto){
        adminService.saveAdmin(dto);
        StandardResponse response = new StandardResponse(200,"Saved",null);
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @DeleteMapping(params = {"id"})
    public ResponseEntity deleteAdmin(@RequestParam String id){
        adminService.deleteAdmin(id);
        StandardResponse response = new StandardResponse(200,"Deleted",null);
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity updateCustomer(@RequestBody AdminDTO dto){
        adminService.updateAdmin(dto);
        StandardResponse response = new StandardResponse(200,"Updated",null);
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity searchCustomer(@PathVariable String id){
        AdminDTO adminDTO = adminService.searchAdmin(id);
        return new ResponseEntity(new StandardResponse(200,"Success",adminDTO), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getAllAdmins(){
        List<AdminDTO> allAdmins = adminService.getAllAdmins();
        return new ResponseEntity(new StandardResponse(200,"Success",allAdmins), HttpStatus.OK);
    }
}
