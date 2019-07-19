package com.chentian.kill.controller;

import com.chentian.kill.domain.MiaoshaUser;
import com.chentian.kill.domain.User;
import com.chentian.kill.result.Result;
import com.chentian.kill.service.MiaoshaUserService;
import com.chentian.kill.vo.LoginVo;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@Controller
@RequestMapping("/goods")
public class GoodsController {

    private static Logger log = LoggerFactory.getLogger(GoodsController.class);

    @Autowired
    MiaoshaUserService userService;

    @RequestMapping("/to_list")
    public String toLogin(Model model,MiaoshaUser user){

        model.addAttribute("user",user);

        return "goods_list";
    }


}
