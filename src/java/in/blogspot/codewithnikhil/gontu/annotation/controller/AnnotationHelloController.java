package in.blogspot.codewithnikhil.gontu.annotation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/greet")
public class AnnotationHelloController
{

    /**
     * It is a multi-action controller class since it has more than one request
     * handler.
     *
     */
    @RequestMapping(value = "/welcome/{countryName}/userName", method = RequestMethod.GET)
    public ModelAndView helloWorld(@PathVariable("countryName") String countryName)
    {
        ModelAndView model = new ModelAndView("HelloPage");
        model.addObject("welcomeMessage", "This is nikhil from " + countryName);
        return model;
    }

    @RequestMapping("/hi")
    public ModelAndView hiWorld()
    {
        ModelAndView model = new ModelAndView("HelloPage");
        model.addObject("welcomeMessage", "Hi World method is called dude");
        return model;
    }

}
