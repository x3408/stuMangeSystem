package com.x3408.stumanage.entity;

public class Financial {
    private Integer id;
    private String accommodation;
    private String trainingPay;
    private String tuitionPayment;
    private Dept dept;

    public String getTuitionPayment() {
        return tuitionPayment;
    }

    public void setTuitionPayment(String tuitionPayment) {
        this.tuitionPayment = tuitionPayment;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccommodation() {
        return accommodation;
    }

    public void setAccommodation(String accommodation) {
        this.accommodation = accommodation;
    }

    public String getTrainingPay() {
        return trainingPay;
    }

    public void setTrainingPay(String trainingPay) {
        this.trainingPay = trainingPay;
    }
}
