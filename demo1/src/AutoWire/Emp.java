package AutoWire;

/**
 * @author jxd
 * @date 2021/10/25 12:17
 */
public class Emp {
    private Dept dept;

    public Emp(Dept dept) {
        this.dept = dept;
    }

    public Emp() {
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
}
