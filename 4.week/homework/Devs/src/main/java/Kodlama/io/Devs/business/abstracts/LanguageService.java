package Kodlama.io.Devs.business.abstracts;

import Kodlama.io.Devs.entities.Language;

import java.util.List;

public interface LanguageService {

    List<Language> getAll();
    public void add(Language language) throws Exception;
    public void delete (Language language) throws Exception;
    public void update(Language language) throws Exception;
    public void listLanguage(List<Language> languages);
    public int getId(int id,Language language);
}
