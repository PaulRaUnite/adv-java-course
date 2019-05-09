package com.pavlo_tokariev.spring_data.controller;

import com.pavlo_tokariev.spring_data.model.Student;
import com.pavlo_tokariev.spring_data.services.GroupService;
import com.pavlo_tokariev.spring_data.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

@RestController
@ControllerAdvice
public class StudentController {

    @Autowired
    StudentService studentService;

    @Autowired
    GroupService groupService;

    @RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
    public @ResponseBody
    ModelAndView getAStudent(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("show_student");
        modelAndView.addObject("student", studentService.getById(id));
        return modelAndView;
    }

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public ModelAndView getAll() {
        ModelAndView modelAndView = new ModelAndView("show_students");
        modelAndView.addObject("students", studentService.getAllStudents());
        return modelAndView;
    }

    @RequestMapping(value = "/best_students", method = RequestMethod.GET)
    public ModelAndView getBest() {
        ModelAndView modelAndView = new ModelAndView("show_students");
        modelAndView.addObject("students", studentService.getBestStudents());
        return modelAndView;
    }

    @RequestMapping(value = "/student/{id}", method = RequestMethod.DELETE)
    public HttpStatus deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return HttpStatus.NO_CONTENT;
    }

    @RequestMapping(value = "/student/new", method = RequestMethod.GET)
    public @ResponseBody
    ModelAndView editAStudent() {
        ModelAndView modelAndView = new ModelAndView("new_student");
        modelAndView.addObject("groups", groupService.getAllGroups());
        return modelAndView;
    }

    @RequestMapping(value = "/student/{id}/edit", method = RequestMethod.GET)
    public @ResponseBody
    ModelAndView editAStudent(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("edit_student");
        modelAndView.addObject("student", studentService.getById(id));
        modelAndView.addObject("groups", groupService.getAllGroups());
        return modelAndView;
    }

    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public HttpStatus insertStudent(@ModelAttribute("student") Student student,
                                    BindingResult result, SessionStatus status) {
        System.out.println(student);
        student.setGroup(groupService.getById(student.getGroup().getId()));
        System.out.println(student);
        return studentService.addStudent(student) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
    }
}
