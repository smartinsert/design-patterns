package builder.ex1;

public class BuilderDemo1 {
    public static void main(String[] args) {
       String details=new StringBuilder()
               .append("Shantanu")
               .append("Banerjee")
               .append("from Hyderabad")
               .append(50)
               .append("years")
               .toString();
    }
}
