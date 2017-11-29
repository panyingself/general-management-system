package com.py.general.web.base;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import java.util.Date;

/**
 * Created by reapal on 2017/7/19.
 */
public class BaseController {
//    /**
//     * 获取当前
//     *
//     * @return
//     */
//    public SysUser getCurrentUser() {
//        Subject subject = SecurityUtils.getSubject();
//        Session session = subject.getSession();
//        return (SysUser) session.getAttribute("user");
//    }
//
//    @InitBinder
//    public void initBinder(WebDataBinder binder) {
//        binder.registerCustomEditor(Date.class, new com.reapal.fund.web.base.DateEditor());
//        binder.registerCustomEditor(String.class, new com.reapal.fund.web.base.StringEscapeEditor(false, false, true));
//    }
}
