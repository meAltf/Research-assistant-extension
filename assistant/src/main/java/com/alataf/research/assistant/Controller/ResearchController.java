package com.alataf.research.assistant.Controller;

import com.alataf.research.assistant.DTO.ResearchRequest;
import com.alataf.research.assistant.Service.ResearchService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/research")
@CrossOrigin(origins = "*")
public class ResearchController {

    private final ResearchService researchService;

    public ResearchController(ResearchService researchService) {
        this.researchService = researchService;
    }

    @RequestMapping("/process")
    public ResponseEntity<String> processContent(@RequestBody ResearchRequest researchRequest){
        String result = researchService.processContent(researchRequest);
        return ResponseEntity.ok(result);
    }


}
