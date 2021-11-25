package builder.ex3;

public class Main {
    public static void main(String[] args) {
    User u1= new User.UserBuilder("Shantanu","banerjee")
            .age(50)
            .mobile(999999444)
            .city("Hyderabad")
            .build();

        User u2= new User.UserBuilder("Kiran","Sain")
                .age(67)
                .build();
    }

    String user = new StringBuilder().append("Shantanu").append("banerjee").append(51).toString();

}

