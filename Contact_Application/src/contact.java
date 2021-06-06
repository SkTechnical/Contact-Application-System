
public class contact {
    
    private  Integer eid;
    private  String fname;
    private  String lname;
    private  String groupc;
    private  String phone;
    private  String email;
    private  String address;
    private  byte[] pic;
    private  int uid;
    
    //Alt + ins 
    // to generate constructor  & getters & setters

    public contact() {
        
    }

    
    
    public contact(Integer eid, String fname, String lname, String groupc, String phone, String email, String address, byte[] pic, int uid) {
        this.eid = eid;
        this.fname = fname;
        this.lname = lname;
        this.groupc = groupc;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.pic = pic;
        this.uid = uid;
    }


    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getGroupc() {
        return groupc;
    }

    public void setGroupc(String groupc) {
        this.groupc = groupc;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public byte[] getPic() {
        return pic;
    }

    public void setPic(byte[] pic) {
        this.pic = pic;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
    
    
    
}
