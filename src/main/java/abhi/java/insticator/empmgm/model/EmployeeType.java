package abhi.java.insticator.empmgm.model;

/**
 * Created by Abhishek on 9/15/2016.
 */
public class EmployeeType {
    public EmployeeType() {
    }

    private int typeid;
    private String type;
    private String rateType;

    public int getTypeid() {
        return typeid;
    }

    public void setTypeid(int typeid) {
        this.typeid = typeid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRateType() {
        return rateType;
    }

    public void setRateType(String rateType) {
        this.rateType = rateType;
    }

    @Override
    public String toString() {
        return "EmployeeType{" +
                "typeid=" + typeid +
                ", type='" + type + '\'' +
                ", rateType='" + rateType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeType that = (EmployeeType) o;

        if (typeid != that.typeid) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        return rateType != null ? rateType.equals(that.rateType) : that.rateType == null;

    }

    @Override
    public int hashCode() {
        int result = typeid;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (rateType != null ? rateType.hashCode() : 0);
        return result;
    }
}
