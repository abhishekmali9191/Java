package day7;

public class Department {
    private int empId;
    private String deptname;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public Department(int empId, String deptname) {
        this.empId = empId;
        this.deptname = deptname;
    }

    @Override
    public String toString() {
        return "Department{" +
                "empId=" + empId +
                ", deptname='" + deptname + '\'' +
                '}';
    }
}
