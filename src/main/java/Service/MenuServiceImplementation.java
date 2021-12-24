package Service;

import Model.MenuItem;
import Repository.MenuRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class MenuServiceImplementation implements MenuItemService{
    @Autowired
    MenuRepo repoObj;
    @Override
    public void addItem(MenuItem menuItem) {
        repoObj.save(menuItem);

    }
}
