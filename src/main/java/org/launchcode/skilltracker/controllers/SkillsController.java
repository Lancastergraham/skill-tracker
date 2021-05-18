package org.launchcode.skilltracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String greeting() {
        return "<html>" +
                    "<body>" +
                "<h1>Skills Tracker</h1>" +
                    "<h2>Here's some skills you will need to learn</h2>" +
                    "<ol>" +
                        "<li>Java</li>" +
                        "<li>JavaScript</li>" +
                        "<li>C++</li>" +
                    "</ol>" +
                    "</body>" +
                "</html>";
    }

    @RequestMapping(method = RequestMethod.GET, value =
            "form")
    public String theForm() {
        return "<html>" +
                "<body>" +
                "<form method = 'post'>" +
                "<p>Name:<p>" +
                "<input type = 'text' name = 'name' value = 'Enter a name'>" +
                "<p>My favorite language:</p>" +
                "<select name = 'favorite'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select>" +
                "<p>My second favorite language:</p>" +
                "<select name = 'second'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select>" +
                "<p>My third favorite language:</p>" +
                "<select name = 'third'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select>" +
                "<br><input type = 'submit' value = 'Submit' >" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @RequestMapping(method = RequestMethod.POST, value = "form")
    public String handleForm(@RequestParam String name,
                             @RequestParam String favorite, @RequestParam
                             String second, @RequestParam String third) {
        return "<html>" +
                "<body>" +

                "<h2>Name: " + name + "</h2>" +
                "<ol>" +
                "<li>" + favorite + "</li>" +
                "<li>" + second + "</li>" +
                "<li>" + third + "</li>" +
                "</ol>" +

                "</body>" +
                "</html>";
    }
}
