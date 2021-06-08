package incomingCMDao;

public class incomingCMGETSET {
    
    private String mid,ordername,bags,date,vnumber,dname;
    
    public incomingCMGETSET(){
    super();
    }

    public incomingCMGETSET(String mid, String ordername, String bags, String date, String vnumber, String dname) {
        this.mid = mid;
        this.ordername = ordername;
        this.bags = bags;
        this.date = date;
        this.vnumber = vnumber;
        this.dname = dname;
    }

    public String getMid() {
        return mid;
    }

    public String getOrdername() {
        return ordername;
    }

    public String getBags() {
        return bags;
    }

    public String getDate() {
        return date;
    }

    public String getVnumber() {
        return vnumber;
    }

    public String getDname() {
        return dname;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public void setOrdername(String ordername) {
        this.ordername = ordername;
    }

    public void setBags(String bags) {
        this.bags = bags;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setVnumber(String vnumber) {
        this.vnumber = vnumber;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
    
    
}
