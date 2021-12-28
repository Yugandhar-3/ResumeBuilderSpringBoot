package com.example.SubForm1;


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
       // if (bindingResult.hasErrors()) {
            return "addUser";
        //}

        //System.out.println("we are here");
        //return "showMessage";
    }

    @PostMapping("/preview")
    public String preview(User user,HttpServletRequest request)
    {
        request.setAttribute("user",user);
        return "showMessage";
    }

    @RequestMapping("/show")
    public String showPreview(HttpServletRequest request)
    {
        return"showMessage";
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
