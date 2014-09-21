package com.leeqj.server.entitys;

import org.springframework.data.web.PageableDefault;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by leeqj on 14-9-21.
 */

@Entity
public class User implements Serializable {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }



    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String firstName;
    private String lastName;
    private Date createdDate;
//    private Date lastAccessed;
//    private Boolean isActive = Boolean.TRUE;




}
