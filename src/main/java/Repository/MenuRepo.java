package Repository;

import Model.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepo extends JpaRepository<MenuItem , Integer> {


}
