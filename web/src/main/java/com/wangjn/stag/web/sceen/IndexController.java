package com.wangjn.stag.web.sceen;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * IndexController
 *
 * @author wangjn
 * @date 2018/9/29
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return mv;
    }
}
