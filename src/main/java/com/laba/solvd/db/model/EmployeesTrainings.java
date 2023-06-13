package com.laba.solvd.db.model;

import java.util.Objects;

public class EmployeesTrainings {
    private long id;
    private String status;
    public EmployeesTrainings(){};

    public EmployeesTrainings(long id,String status){
        this.id=id;
        this.status=status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeesTrainings that = (EmployeesTrainings) o;
        return id == that.id && Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status);
    }
}
