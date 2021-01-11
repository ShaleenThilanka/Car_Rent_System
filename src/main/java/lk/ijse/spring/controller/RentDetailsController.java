package lk.ijse.spring.controller;

import lk.ijse.spring.dto.RentDetailsDTO;
import lk.ijse.spring.service.RentDetailsService;
import lk.ijse.spring.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sun.security.timestamp.HttpTimestamper;

import java.util.List;

@RestController
@RequestMapping("/api/v1/rentDetails")
@CrossOrigin
public class RentDetailsController {

    @Autowired
    RentDetailsService rentDetailsService;

    @DeleteMapping(params = {"id"})
    public ResponseEntity deleteRentDetail(@RequestParam String id){
        rentDetailsService.deleteRentDetails(id);
        StandardResponse response = new StandardResponse(200,"Deleted",null);
        return new ResponseEntity(response,HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity updateRentDetails(@RequestBody RentDetailsDTO dto){
        rentDetailsService.updateRentDetails(dto);
        StandardResponse response = new StandardResponse(200,"Updated",null);
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity searchRentDetails(@PathVariable String id){
        RentDetailsDTO rentDetailsDTO = rentDetailsService.searchRentDetails(id);
        return new ResponseEntity(new StandardResponse(200,"Success",rentDetailsDTO), HttpStatus.OK);
    }

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity addRentDetails(@RequestBody RentDetailsDTO dto){
        rentDetailsService.addRentDetails(dto);
        StandardResponse response = new StandardResponse(200,"Saved",null);
        return new ResponseEntity(response, HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity getAllRentDetails(){
        List<RentDetailsDTO> allRentDetails = rentDetailsService.getAllRentDetails();
        return new ResponseEntity(new StandardResponse(200,"Success",allRentDetails), HttpStatus.OK);
    }
}
