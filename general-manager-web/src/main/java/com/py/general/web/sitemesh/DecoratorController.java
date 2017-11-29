package com.py.general.web.sitemesh;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by huanghe on 2017/7/2.
 */
@Controller
@RequestMapping(value = "/decorator")
public class DecoratorController  {

    private static final Logger logger = LoggerFactory.getLogger(DecoratorController.class);

    @RequestMapping(value = "/index")
    public ModelAndView index(ModelMap modelMap) {
        return new ModelAndView("decorators/index");
    }
}
