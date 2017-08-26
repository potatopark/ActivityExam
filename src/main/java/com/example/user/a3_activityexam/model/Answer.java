package com.example.user.a3_activityexam.model;

/**
 * Created by user on 2017-08-26.
 */
import java.io.Serializable;
//Serializable : Activity 간의 교환 규격
//Intent에 포함되는 모든 객체는 Serializable을 상속 받아야 한다.
public class Answer implements Serializable {

    private static final long serialVersionUID = 1L;
    private String id;
    private String password;
    private String email;

    public Answer(){

    }

    public Answer(String id, String passworc, String email) {
        this.id = id;
        this.password = passworc;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String passworc) {
        this.password = passworc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
