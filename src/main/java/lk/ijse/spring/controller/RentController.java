package lk.ijse.spring.controller;

import lk.ijse.spring.dto.RentDTO;
import lk.ijse.spring.service.RentService;
import lk.ijse.spring.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/rent")
@CrossOrigin
public class RentController {

    @Autowired
    RentService rentService;

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity addRent(@RequestBody RentDTO dto){
        rentService.addRent(dto);
        StandardResponse response = new StandardResponse(200,"Success",null);
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity updateRent(@RequestBody RentDTO dto){
        rentService.updateRent(dto);
        StandardResponse response = new StandardResponse(200,"Updated",null);
        return new ResponseEntity(response,HttpStatus.OK);
    }

    @DeleteMapping(params = {"id"})
    public ResponseEntity deleteRent(@RequestParam String id){
        rentService.deleteRent(id);
        StandardResponse response = new StandardResponse(200,"Deleted",null);
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity searchRent(@PathVariable String id){
        RentDTO rentDTO = rentService.searchRent(id);
        return new ResponseEntity(new StandardResponse(200,"Success",rentDTO), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getAllRents(){
        List<RentDTO> allRents = rentService.getAllRents();
        return new ResponseEntity(new StandardResponse(200,"Success",allRents), HttpStatus.OK);
    }
}
