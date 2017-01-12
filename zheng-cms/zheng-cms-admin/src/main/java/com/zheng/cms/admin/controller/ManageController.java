package com.zheng.cms.admin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 后台controller
 * Created by ZhangShuzheng on 2017/01/12.
 */
@Controller
@RequestMapping("/manage")
public class ManageController extends BaseController {

	private static Logger _log = LoggerFactory.getLogger(ManageController.class);

	@RequestMapping(value = {"", "/index"})
	public String index() {
		return "/manage/index";
	}

	@RequestMapping("/login")
	public String login() {
		return "/manage/login";
	}

}