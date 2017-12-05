package in.blogspot.codewithnikhil.gontu.annotation.controller;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController
{

    @RequestMapping(value = "/admissionForm", method = RequestMethod.GET)
    public ModelAndView getAdmissionForm()
    {
        throw new NullPointerException("Error in constructor ");
//        ModelAndView model = new ModelAndView("AdmissionForm");
//        model.addObject("headerMessage", "Your are welcomed to Engg. College");
//        return model;
    }

    @ModelAttribute
    public void addingCommonObjects(Model co_model)
    {
        co_model.addAttribute("headerMessage", "Your are welcomed to Engg. College");
    }

    @InitBinder
    public void initBinder(WebDataBinder binder)
    {
//        binder.setDisallowedFields(new String[]{"studentMobile"});
        binder.registerCustomEditor(String.class, "studentName", new StudentNameEditor());
    }

    @RequestMapping(value = "/submitAdmissionForm", method = RequestMethod.POST)
    public ModelAndView submitAdmissionForm(@Valid @ModelAttribute("ladaka") Student std, BindingResult result)
    {
        if (result.hasErrors())
        {
            ModelAndView model = new ModelAndView("AdmissionForm");
            return model;
        }

//        Student std = new Student(studentName, studentHobby);
        ModelAndView model = new ModelAndView("AdmissionSuccess");
//        model.addObject("headerMessage", "Your are welcomed to Engg. College");
        model.addObject("ladaka", std);
        return model;
    }

//    @RequestMapping(value = "/submitAdmissionForm", method = RequestMethod.POST)
//    public ModelAndView submitAdmissionForm(
//            @RequestParam(value = "studentName", defaultValue = "Mr.ABCDEF") String studentName,
//            @RequestParam("studentHobby") String studentHobby)
//    {
//        
//        Student std = new Student(studentName,studentHobby);
//        ModelAndView model = new ModelAndView("AdmissionSuccess");
//        model.addObject("headerMessage","Your are welcomed to Engg. College");
//        model.addObject("ladaka",std);
//        return model;
//    }
}
