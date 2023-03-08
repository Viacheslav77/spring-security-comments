package com.security.comments.service.impl;

import org.springframework.stereotype.Service;

import com.security.comments.exception.NullEntityReferenceException;
import com.security.comments.model.Role;
import com.security.comments.repository.RoleRepository;
import com.security.comments.service.RoleService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {

    private RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Role create(Role role) {
        try {
            return roleRepository.save(role);
        } catch (IllegalArgumentException e) {
            throw new NullEntityReferenceException("Role cannot be 'null'");
        }
    }

    @Override
    public Role readById(long id) {
        Optional<Role> optional = roleRepository.findById(id);
        return optional.get();
    }

    @Override
    public Role update(Role role) {
        if (role != null) {
            Role oldRole = readById(role.getId());
            if (oldRole != null) {
                return roleRepository.save(role);
            }
        }
        throw new NullEntityReferenceException("Role cannot be 'null'");
    }

    @Override
    public void delete(long id) {
        Role role = readById(id);
        if (role != null) {
            roleRepository.delete(role);
        } else {
            throw new NullEntityReferenceException("Role cannot be 'null'");
        }
    }

    @Override
    public List<Role> getAll() {
        List<Role> roles = roleRepository.findAll();
        return roles.isEmpty() ? new ArrayList<>() : roles;
    }
}
