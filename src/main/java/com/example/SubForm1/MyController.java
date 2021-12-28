package com.example.SubForm1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
//import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.File;
//import java.io.FileOutputStream;
import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;

//import com.pdfcrowd.*;


@Controller
public class MyController implements WebMvcConfigurer {
    @Autowired
    private Service service;

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/showMessage").setViewName("showMessage");
	}

    @GetMapping("/addUser")
    public String sendForm(User user,HttpServletRequest request) {
        request.setAttribute("user",user);
        return "addUser";
    }

    @PostMapping("/addUser")
    public String processForm(@Valid User user , BindingResult bindingResult) throws IOException {
          return "addUser";

    }

    @PostMapping("/preview")
    public String preview(User user,HttpServletRequest request)
    {
        request.setAttribute("user",user);
        service.addUser(user);
        return "preview";
    }

    @RequestMapping("/show")
    public String showPreview(HttpServletRequest request)
    {
        User u= service.getUser();
        request.setAttribute("user",u);
        return"showMessage";
    }
    @RequestMapping("/temp")
    public String templatepreview(HttpServletRequest request)
    {
        User u= service.getUser();
        request.setAttribute("user",u);
        return"template1";
    }


    @PostMapping("/upload")
    public String uploadImage(@RequestParam("file") MultipartFile file) throws IllegalStateException,IOException{
        System.out.println("1");
	    String basedir = "C:\\Users\\YUGANDER\\Desktop\\3-1\\CODES\\resume-Spring-master\\src\\main\\resources\\templates";
        System.out.println("dir found");
	   file.transferTo(new File(basedir+""));
        System.out.println("last step");
	    return "redirect:/addUser";}
    }
