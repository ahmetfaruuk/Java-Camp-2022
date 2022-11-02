package Kodlama.io.Devs.dataAccess.concretes;

import Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.entities.Language;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {
    List<Language> languages;

    public InMemoryLanguageRepository() {
        languages = new ArrayList<Language>();
        languages.add(new Language(1,"Java"));
        languages.add(new Language(2,"C#"));
        languages.add(new Language(3,"Phyton"));
        languages.add(new Language(4,"Javascript"));
        languages.add(new Language(5,"C++"));
        languages.add(new Language(6,"C"));

    }

    @Override
    public List<Language> getAll() {
        return languages;
    }

    @Override
    public void add(Language language) {
        for (Language language1 : languages){
            if (language1.getId() == language.getId()){
                language.setName(language1.getName());
            }
        }
    }

    @Override
    public void update(Language language) {
        for (Language language1: languages){
            if (language == languages){
                language.setName(language1.getName());
            }

        }
    }

    @Override
    public void delete(Language language) {
        for (Language language1 : languages){
            if (language1 == languages){
                languages.remove(language1);
            }
        }
    }

    @Override
    public int getId(int id) {
        return id;
    }
}
