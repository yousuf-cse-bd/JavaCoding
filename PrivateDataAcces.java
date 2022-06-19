 class MyClass{
     //Private Data Modifier
    public String name;
    public void setData(String name){
        this.name = name;
    }
    //Encrypted
    public String getData(){
        StringBuffer sbr = new StringBuffer(name);
        sbr = sbr.reverse();
        name = new String(sbr);
        return name;
    }
}

public class PrivateDataAcces{
    public static void main(String[] args) {
        
        MyClass object = new MyClass();
        object.setData("MuhammadYousufAli");
        //Decrypted
        StringBuffer sbr = new StringBuffer(object.getData());
        sbr = sbr.reverse();
        System.out.println(sbr);
    }
}