package com.devsuperior.dscatalog.dto;

import com.devsuperior.dscatalog.entities.Role;
import com.devsuperior.dscatalog.entities.User;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class UserDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;

    private String FirstName;

    private String lastName;

    private String email;

    private Set<RoleDTO> roles = new HashSet<>();
    public UserDTO(){}
    public UserDTO(Long id, String firstName, String lastName, String email) {
        this.id = id;
        this.FirstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public UserDTO(User entity) {
        this.id = entity.getId();
        this.FirstName = entity.getFirstName();
        this.lastName = entity.getLastName();
        this.email = entity.getEmail();
        entity.getRoles().forEach(role -> this.roles.add(new RoleDTO(role)));
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<RoleDTO> getRoles() {
        return roles;
    }
}
