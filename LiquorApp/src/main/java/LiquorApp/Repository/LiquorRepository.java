package LiquorApp.Repository;

import LiquorApp.Entity.Liquor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LiquorRepository extends JpaRepository<Liquor,Long> {
    List<Liquor> findByType(String type);
}
