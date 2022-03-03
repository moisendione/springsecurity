package sn.minfinances.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import sn.minfinances.dao.IUser;

@Controller
public class UserController {

    @Autowired
    private IUser userDao;

    @RequestMapping("/acceuil")
    public String acceuil(){
        return "acceuil";
    }

    @RequestMapping("/admin/users")
    public String list(){
        return "acceuil";
    }
}
