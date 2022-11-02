package Kodlama.io.Devs.dataAccess.abstracts;

import Kodlama.io.Devs.entities.Language;

import java.util.List;

public interface LanguageRepository {
    List<Language> getAll();
    void add(Language language);
    void update(Language language);
    void delete(Language language);
    int getId(int id);
}
