public class nomCognom{

    private int edat;
    private String tel;
    
    public IvanPelegri(){} 

    IvanPelegri(int e, String t){
        edat=e;
        tel=t;

    }

    getEdat(){
        return this.edat;
    }
    getTel(){
        return this.tel;
    }
    setEdat(e){
        this.edat = e;
    }
    setEdat(t){
        this.tel = t;
    }
    public String toString(){
        return "EDAT: " + this.edat +  "TELEFON: " + this.tel;
    }
    public boolean equals(nomCognom object){
        if(this == object) return true;
    }
}
