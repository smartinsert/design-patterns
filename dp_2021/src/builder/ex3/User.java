package builder.ex3;

public class User {
    private int userId;
    private String firstName;
    private String lastName;
    private String city;
    private int mobile;
    private int age;
    private User( UserBuilder builder){
        this.userId= builder.userId;
        this.firstName= builder.firstName;
        this.lastName= builder.lastName;
        this.age= builder.age;
        this.mobile= builder.mobile;
    }


 public static class UserBuilder{
     private int userId;
     private String firstName;
     private String lastName;
     private String city;
     private int mobile;
     private int age;

     public UserBuilder(String firstName, String lastName) {
         this.firstName = firstName;
         this.lastName = lastName;
     }

     public UserBuilder age(int age){
         this.age=age;
         return this;
     }

     public UserBuilder city(String city){
         this.city=city;
         return this;
     }

     public UserBuilder userId(int id){
         this.userId=id;
         return this;
     }

     public UserBuilder mobile(int mobile){
         this.mobile=mobile;
         return this;
     }

     public User build(){
         User u= new User(this);
         return u;
     }
 }
}
