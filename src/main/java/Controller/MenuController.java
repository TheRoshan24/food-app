package Controller;

import Model.MenuItem;
import Service.MenuItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    MenuItemService serviceObj;

    @PostMapping("/additem")
    public void addItem(@RequestBody MenuItem item){
        serviceObj.addItem(item);

    }



}
