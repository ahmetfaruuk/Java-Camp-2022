package Kodlama.io.Devs.webApi.controllers;

import Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.entities.Language;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
    private LanguageService languageService;

    public LanguagesController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("/getall")
    public List<Language> getAll(){
        return languageService.getAll();
    }

    @PostMapping("/add")
    public void add(Language language) throws Exception {
         languageService.add(language);
    }
    @DeleteMapping("/delete")
    public void delete(Language language) throws Exception{
         languageService.delete(language);
    }
    @PutMapping("/update")
    public void update(Language language) throws Exception{
        languageService.update(language);
    }
    @GetMapping("/getid")
    public int getId(int id,Language language){
        return languageService.getId(id,language);

    }
}
