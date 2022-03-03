package sn.minfinances.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import sn.minfinances.dao.IRole;

@Controller
public class RoleController {

    @Autowired
    IRole roleDao;
}
