package Kodlama.io.Devs.business.concretes;

import Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.entities.Language;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class LangugageManager implements LanguageService {
    private LanguageRepository languageRepository;
    public LangugageManager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public List<Language> getAll() {
        return languageRepository.getAll();
    }

    @Override
    public void add(Language language) throws Exception {
        for (Language languages1:getAll()) {
            if(languages1 == getAll()){
                throw new Exception("Dil ismi aynı olamaz!");
            }else if (languages1.getName().isEmpty()){
                throw new Exception("Dil ismi boş bırkaılamaz.");
            }
        }
    }

    @Override
    public void delete(Language language) throws Exception {
        for (Language language1: getAll()){
           if (language1.getId() != language.getId()) {
               throw new Exception("Silinecek dil kaydı bulunamadı!");
           }
        }
    }

    @Override
    public void update(Language language) throws Exception {
        for (Language languages2: getAll()){
            if (languages2.getId() != language.getId()){
                throw new Exception("Güncellemeye çalıştığınız dil bulunamadı!");
            }
        }
    }

    @Override
    public void listLanguage(List<Language> languages) {
        System.out.println(languageRepository.getAll());
    }

    @Override
    public int getId(int id,Language language) {
        return language.getId();

    }
}
