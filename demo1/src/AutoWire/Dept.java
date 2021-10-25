package AutoWire;

/**
 * @author jxd
 * @date 2021/10/25 12:16
 */
public class Dept {
    private String deptName;

    public Dept() {
    }

    public Dept(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
