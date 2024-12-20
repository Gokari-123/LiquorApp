package LiquorApp.DataLoader;

import LiquorApp.Entity.Liquor;
import LiquorApp.Repository.LiquorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    LiquorRepository liquorRepository;

    @Override
    public void run(String... args) throws Exception {
        // Pre-load some data
        List<Liquor> liquors = Arrays.asList(
                new Liquor(null, "Johnnie Walker", "Whisky", 1500.0),
                new Liquor(null, "Old Monk", "Rum", 500.0),
                new Liquor(null, "Kingfisher", "Beer", 150.0),
                new Liquor(null, "Remy Martin", "Brandy", 790.0),
                new Liquor(null, "BP", "Brandy", 1350.0)
        );
        liquorRepository.saveAll(liquors);
    }

    }
