package shop.payover.datalib.dao.model;

import java.io.Serializable;

public class Permission implements Serializable {
    private Integer id;

    private String name;

    private String access_type;

    private String access_value;

    private String is_open;

    private String data_range_ctl;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccess_type() {
        return access_type;
    }

    public void setAccess_type(String access_type) {
        this.access_type = access_type;
    }

    public String getAccess_value() {
        return access_value;
    }

    public void setAccess_value(String access_value) {
        this.access_value = access_value;
    }

    public String getIs_open() {
        return is_open;
    }

    public void setIs_open(String is_open) {
        this.is_open = is_open;
    }

    public String getData_range_ctl() {
        return data_range_ctl;
    }

    public void setData_range_ctl(String data_range_ctl) {
        this.data_range_ctl = data_range_ctl;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", access_type=").append(access_type);
        sb.append(", access_value=").append(access_value);
        sb.append(", is_open=").append(is_open);
        sb.append(", data_range_ctl=").append(data_range_ctl);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Permission other = (Permission) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getAccess_type() == null ? other.getAccess_type() == null : this.getAccess_type().equals(other.getAccess_type()))
            && (this.getAccess_value() == null ? other.getAccess_value() == null : this.getAccess_value().equals(other.getAccess_value()))
            && (this.getIs_open() == null ? other.getIs_open() == null : this.getIs_open().equals(other.getIs_open()))
            && (this.getData_range_ctl() == null ? other.getData_range_ctl() == null : this.getData_range_ctl().equals(other.getData_range_ctl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getAccess_type() == null) ? 0 : getAccess_type().hashCode());
        result = prime * result + ((getAccess_value() == null) ? 0 : getAccess_value().hashCode());
        result = prime * result + ((getIs_open() == null) ? 0 : getIs_open().hashCode());
        result = prime * result + ((getData_range_ctl() == null) ? 0 : getData_range_ctl().hashCode());
        return result;
    }
}