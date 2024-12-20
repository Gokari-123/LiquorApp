package LiquorApp.Controller;

import LiquorApp.Entity.Liquor;
import LiquorApp.Repository.LiquorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/liquors")
public class LiquorController {
    @Autowired
    private LiquorRepository liquorRepository;

    @GetMapping("/")
    public List<Liquor> getAllLiquors() {
        return liquorRepository.findAll();
    }

    @GetMapping("/type/{type}")
    public List<Liquor> getLiquorsByType(@PathVariable String type) {
        return liquorRepository.findByType(type);
    }

    @PostMapping("/bill")
    public double generateBill(@RequestBody Map<Long, Integer> order) {
        double total = 0.0;
        for (Map.Entry<Long, Integer> entry : order.entrySet()) {
            Liquor liquor = liquorRepository.findById(entry.getKey()).orElseThrow();
            total += liquor.getPrice() * entry.getValue();
        }
        return total;
    }
}

