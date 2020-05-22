public class ivanPelegri{

    private int edat;
    private String tel;
    
    public IvanPelegri(){} 

    ivanPelegri(int e, String t){
        edat=e;
        tel=t;

    }

    public int getEdat(){
        return this.edat;
    }
    public String getTel(){
        return this.tel;
    }
    setEdat(int e){
        this.edat = e;
    }
    setEdat(String t){
        this.tel = t;
    }
    public String toString(){
        return "EDAT: " + this.edat +  "TELEFON: " + this.tel;
    }
    public boolean equalsEdat(int e){
        if(this.edat == e) return true;
    }
    public boolean equalsTel(String t){
        if(this.tel.equals(t)) return true;
    }
}
