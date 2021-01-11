package lk.ijse.spring.controller;

import lk.ijse.spring.dto.DriverDTO;
import lk.ijse.spring.service.DriverService;
import lk.ijse.spring.util.StandardResponse;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/driver")
@CrossOrigin
public class DriverController {

    @Autowired
    DriverService driverService;

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity addDriver(@RequestBody DriverDTO dto){
        driverService.saveDriver(dto);
        StandardResponse response = new StandardResponse(200,"Success",null);
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity updateDriver(@RequestBody DriverDTO dto){
        driverService.updateDriver(dto);
        StandardResponse response = new StandardResponse(200,"Updated",null);
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @DeleteMapping(params = {"id"})
    public ResponseEntity deleteDriver(@RequestParam String id){
        driverService.deleteDriver(id);
        StandardResponse response = new StandardResponse(200,"Deleted",null);
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity searchDriver(@PathVariable String id){
        DriverDTO driverDTO = driverService.searchDriver(id);
        return new ResponseEntity(new StandardResponse(200,"Success",driverDTO), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getAllDrivers(){
        List<DriverDTO> allDrivers = driverService.getAllDrivers();
        return new ResponseEntity(new StandardResponse(200,"Success",allDrivers), HttpStatus.OK);
    }
}
