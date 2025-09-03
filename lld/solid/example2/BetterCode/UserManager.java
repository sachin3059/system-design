package lld.solid.example2.BetterCode;

public class UserManager {
    public void add(User user){
        if(user.age < 18){
            throw new IllegalArgumentException("User is not adult");
        }
        System.out.println("User added successfully");
    }

    public void delete(User user){
        System.out.println("User deleted successfully");
    }

    public void update(User user){
        if(user.age < 18){
            throw new IllegalArgumentException("User is not adult");
        }
        System.out.println("User updated successfully");
    }

    public void get(User user){
        System.out.println("User returned");
    }


    // activity logging => might be any that you want to monitor such as cursor pointer.
    // for this we have to make another class
    // public void logUserActivity(User user){
    //     System.out.println("User activity logged");
    // }
}