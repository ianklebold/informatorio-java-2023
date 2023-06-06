package org.info.kiss.usepolymorphism;


import org.info.kiss.usepolymorphism.domain.Employee;

//Servicio de pago
public class PaymentService {
    //Antes del refactoring
    public double calculatePayment(Employee employee){
        return employee.getSalary();
    }
}
