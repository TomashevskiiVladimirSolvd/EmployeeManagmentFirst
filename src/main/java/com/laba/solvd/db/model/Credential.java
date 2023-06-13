package com.laba.solvd.db.model;

import java.util.Objects;

public class Credential {
    private long id;
    private String login;
    private String password;
    public Credential(){};

    public Credential(long id, String login, String password){
        this.id=id;
        this.login=login;
        this.password=password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Credential that = (Credential) o;
        return id == that.id && Objects.equals(login, that.login) && Objects.equals(password, that.password) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, password);
    }
}