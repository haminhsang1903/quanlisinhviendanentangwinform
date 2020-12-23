package com.example.QuanLiSinhVienDaNenTang;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class XController {
	@RequestMapping({"/","/index"})
	public String index() {
		return "index";
	}
}
