package com.devsuperior.entities;

import java.io.Serializable;
public class Role implements Serializable {
    private static final long serialVersionUID=1L;

    private Long id;
    private String roleName;

    public Role(){      
    }

    public Role(Long id, String roleName) {
        this.id = id;
        this.roleName = roleName;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return this.roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
