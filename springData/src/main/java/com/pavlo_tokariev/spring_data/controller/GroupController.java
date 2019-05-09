package com.pavlo_tokariev.spring_data.controller;

import com.pavlo_tokariev.spring_data.model.Group;
import com.pavlo_tokariev.spring_data.services.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GroupController {

    @Autowired
    GroupService groupService;

    @RequestMapping(value = "/group/{id}", method = RequestMethod.GET)
    public ModelAndView get(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("show_group");
        modelAndView.addObject("group", groupService.getById(id));
        return modelAndView;
    }

    @RequestMapping(value = "/groups", method = RequestMethod.GET)
    public ModelAndView getAll() {
        ModelAndView modelAndView = new ModelAndView("show_groups");
        modelAndView.addObject("groups", groupService.getAllGroups());
        return modelAndView;
    }

    @RequestMapping(value = "/group/{id}", method = RequestMethod.DELETE)
    public HttpStatus delete(@PathVariable Long id) {
        groupService.deleteGroup(id);
        return HttpStatus.NO_CONTENT;
    }

    @RequestMapping(value = "/group/new", method = RequestMethod.GET)
    public String edit() {
        return "new_group";
    }

    @RequestMapping(value = "/group/{id}/edit", method = RequestMethod.GET)
    public ModelAndView edit(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("edit_group");
        modelAndView.addObject("group", groupService.getById(id));
        return modelAndView;
    }

    @RequestMapping(value = "/group", method = RequestMethod.POST)
    public @ResponseBody HttpStatus upsert(@ModelAttribute("group") Group group,
                      BindingResult result, SessionStatus status) {
        return groupService.addGroup(group) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
    }
}
