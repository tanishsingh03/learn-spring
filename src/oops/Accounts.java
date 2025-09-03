package oops;

 class Accounts {
     public String name;
     protected String email;
     private String password;

    //getter and setter
//  What are Getters and Setters?
//             Getter → A method that returns (gets) the value of a private variable.
//             Setter → A method that updates (sets) the value of a private variable.
//👉 They are part of encapsulation.
//👉 They allow controlled access to class fields (instead of directly accessing them).

    public   String getPassword(){
        return this.password;
    }
    public void setPassword(String str){
        this.password=str;
    }

}

