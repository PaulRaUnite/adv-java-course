package com.pavlo_tokariev.spring_data.services;

import com.pavlo_tokariev.spring_data.model.Group;
import com.pavlo_tokariev.spring_data.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GroupService {
    @Autowired
    GroupRepository groupRepository;

    @Transactional
    public Iterable<Group> getAllGroups() {
        return groupRepository.findAll();
    }

    @Transactional
    public List<Group> findByName(String name) {
        return groupRepository.findByName(name);
    }

    @Transactional
    public Group getById(Long id) {
        return groupRepository.findOne(id);
    }

    @Transactional
    public void deleteGroup(Long groupId) {
        groupRepository.delete(groupId);
    }

    @Transactional
    public boolean addGroup(Group group) {
        return groupRepository.save(group) != null;
    }

    @Transactional
    public boolean updateGroup(Group group) {
        return groupRepository.save(group) != null;
    }
}
