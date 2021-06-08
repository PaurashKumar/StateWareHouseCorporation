
public class incomingGETSET {
    private String orderid,ordername,bags,date,vnumber,dname ;
    public incomingGETSET(){
    super();
    }

    public incomingGETSET(String orderid, String ordername,String bags, String date, String vnumber, String dname) {
        super();
        this.orderid = orderid;
        this.ordername = ordername;
        this.bags=bags;
        this.date = date;
        this.vnumber = vnumber;
        this.dname = dname;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public void setOrdername(String ordername) {
        this.ordername = ordername;
    }
    public void setBags(String bags){
    this.bags=bags;
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

    public String getOrderid() {
        return orderid;
    }

    public String getOrdername() {
        return ordername;
    }
    
    public String getBags(){
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
    
}
