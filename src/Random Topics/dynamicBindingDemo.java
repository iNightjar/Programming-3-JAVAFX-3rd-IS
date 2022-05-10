// // dynamic binding demo

// import javax.naming.ldap.ManageReferralControl;

// public class dynamicBindingDemo {
//     public static void main(String[] args) {
//         func(new graduateStudent());        
//         func(new students());    
//         func(new persons());        
//         func(new Object());            
//     }
//     public static void func(Object str)
//     {
//         System.out.println(str.toString());
//     }
// }
// class graduateStudent extends students{

// }
// class students extends persons{
//     @Override
//     public String toString(){
//         return "Student";
//     }
// }
// class persons extends Object{
//     @Override
//     public String toString(){
//         return "person";
//     }
// }