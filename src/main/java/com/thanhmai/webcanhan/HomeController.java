package com.thanhmai.webcanhan;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        addCommonData(model);
        return "index";
    }

    @GetMapping("/skills")
    public String skills(Model model) {
        addCommonData(model);
        return "skills";
    }

    @GetMapping("/projects")
    public String projects(Model model) {
        addCommonData(model);
        return "projects";
    }

    private void addCommonData(Model model) {
        model.addAttribute("name", "Mai Văn Thanh");
        model.addAttribute("age", "22");
        model.addAttribute("school", "Đại học Mỏ - Địa Chất");
        model.addAttribute("email", "maivanthanh36tb@gmail.com");
        model.addAttribute("phone", "0387 110 432");
        model.addAttribute("address", "Đông Ngạc, Hà Nội, Việt Nam");
        model.addAttribute("facebook", "https://www.facebook.com/mai.van.thanh.21230?locale=vi_VN");
        model.addAttribute("zalo", "https://zalo.me/0387110432");
    }
}