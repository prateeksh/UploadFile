package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UploadController {

    private UploadRepository repository;

    @Autowired
    public UploadController(UploadRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<UploadData> get(@PathVariable("id") Long id) {
        UploadData user = repository.findOne(id);
        if (null == user) {
            return new ResponseEntity<UploadData>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<UploadData>(user, HttpStatus.OK);
    }

    @RequestMapping(value = "/addmedia", method = RequestMethod.POST)
    public ResponseEntity<UploadData> update(@RequestBody UploadData user) {
        repository.save(user);
        return get(user.getId());
    }

    @RequestMapping(value = "/result", method = RequestMethod.GET)
    public List<UploadData> all() {
        return repository.findAll();
    }

    @RequestMapping("/datacheck")
    @ResponseBody
    String data() {
        return "check data";
    }
}