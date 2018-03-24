package net.lihulab;

public class Student {
    private int id;
    private String name;
    private String branch;
    private int percentage;
    private int phone;
    private String email;

    public Student(String name, String branch, int percentage, int phone, String email) {
        super();
        this.name = name;
        this.branch = branch;
        this.percentage = percentage;
        this.phone = phone;
        this.email = email;
    }

    public Student(){}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int p) {
        this.phone = p;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String e) {
        this.email = e;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int p) {
        this.percentage = p;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("Id = ").append(id).append(" - ");
        sb.append("Name = ").append(name).append(" - ");
        sb.append("Branch = ").append(branch).append(" - ");
        sb.append("Percentage = ").append(percentage).append(" - ");
        sb.append("Phone = ").append(phone).append(" - ");
        sb.append("Email = ").append(email);

        return sb.toString();
    }

}