



class staff {
    int Sid;
    String Sname;
    int phone;
}
class trainer extends staff {
    int Max_Load;
    int Set_max_load;

trainer(int Sd , String Sn , int Ph  ){
     Sid= Sd;
     Sname= Sn;
     phone= Ph;

}
public void Set_max_load(int Sml) {
    Set_max_load= Sml;
}
public void Get_info() {
    
     System.out.println(Sid + " "+Sname + " "+ phone +" "+ Set_max_load);
}


static class employee extends staff {
int Max_overtime;
int Set_max_overtime;

employee(int sd , String sn , int p){
    Sid= sd;
    Sname= sn;
    phone= p;
}
public void Set_max_overtime(int SMT) {
    Set_max_overtime = SMT;
}
public void Get_Info() {
 
    System.out.println(Sid + " "+Sname + " "+ phone +" "+Set_max_overtime);
}
    public static void main(String[] args) {
trainer trainer1 = new trainer (1 , "ahmed" , 0444333555);
trainer1.Set_max_load(18);
trainer1.Get_info();
employee emp1 = new employee (10 , "Ali" , 0333444666);
emp1.Set_max_overtime(40);
emp1.Get_Info();
    }
}
}