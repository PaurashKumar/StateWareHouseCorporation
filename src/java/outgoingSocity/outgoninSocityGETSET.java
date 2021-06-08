 
package outgoingSocity;
 
public class outgoninSocityGETSET {
 private String outgoingid,ordername,bags,date,vnumber,dname;
 public outgoninSocityGETSET(){
 super();
 }

    public outgoninSocityGETSET(String outgoingid, String ordername, String bags, String date, String vnumber, String dname) {
        this.outgoingid = outgoingid;
        this.ordername = ordername;
        this.bags = bags;
        this.date = date;
        this.vnumber = vnumber;
        this.dname = dname;
    }

    public String getOutgoingid() {
        return outgoingid;
    }

    public void setOutgoingid(String outgoingid) {
        this.outgoingid = outgoingid;
    }

    public String getOrdername() {
        return ordername;
    }

    public void setOrdername(String ordername) {
        this.ordername = ordername;
    }

    public String getBags() {
        return bags;
    }

    public void setBags(String bags) {
        this.bags = bags;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getVnumber() {
        return vnumber;
    }

    public void setVnumber(String vnumber) {
        this.vnumber = vnumber;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
 
}
