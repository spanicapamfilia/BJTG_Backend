package org.example.controller;


import org.example.model.CardData;
import org.example.repository.RepoCard;
import org.example.util.AbstractManagedBean;
import org.primefaces.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/cardlist")
public class GenerateCard  extends AbstractManagedBean {

    @Autowired
    private RepoCard repoCard;

    @CrossOrigin(origins = "*", allowedHeaders = "*", maxAge = 3600)
    @RequestMapping(value = "/addCard", method = RequestMethod.POST)
    public Map<String,Object> addCard(@RequestBody Map<String,Object> requestData) {

        List<CardData> allCardData = new ArrayList<>();
        String data = "";
        Map<String, Object> inputData = new HashMap<>();

//        inputData.put("cardnumber", cardnumber);
//        repoCard.save(inputData);
        return inputData;
    }

}
