package org.info.kiss.usepolymorphism.domain;

import java.time.LocalDateTime;

public class FullTimeEmployee extends Employee{

    private LocalDateTime create;

    public LocalDateTime getCreate() {
        return create;
    }

    @Override
    public double getSalary(){
        return super.getSalary() / 12;
    }

    public void setCreate(LocalDateTime create) {
        this.create = create;
    }
}
