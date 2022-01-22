package be.vdab.voorraad.services;

import be.vdab.voorraad.domain.Artikel;
import be.vdab.voorraad.repositories.ArtikelRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DefaultArtikelService implements ArtikelService {
    private final ArtikelRepository repository;

    public DefaultArtikelService(ArtikelRepository repository) {
        this.repository = repository;
    }

    @Override
    public void create(Artikel artikel) {
        repository.save(artikel);
    }
}
