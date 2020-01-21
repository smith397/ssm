package cn.it.colltroller;

import cn.it.domain.user;
import cn.it.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
//修改相同变量名的快捷键 ctrl+r
//或者 Ctrl+Shift+Alt+J
//Ctrl+Alt+L格式化
@Controller
@RequestMapping("/user")
public class UserColltroller {

    @Autowired
    UserService service;
    @RequestMapping("/zj")
    public ModelAndView colltroller(user User)
    {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user",User);
        List<user> use = null;
//        use = new ArrayList<>();
        use = service.findAll();
        for (user zj :use)
        {
            System.out.println(zj);
        }
        System.out.println(User);
        modelAndView.setViewName("success");
        return modelAndView;
    }
    @RequestMapping("/ajax")
    public @ResponseBody user Ajax(@RequestBody  user us)
    {
        System.out.println(us);
        return us;
    }
}
