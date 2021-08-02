package unittest;

public class Hello {

    UserDB userDB;

    public String hi(String name) {
        return "Hello, " + name;
    }

    public String workWithDb(int id) {
        return userDB.getNameById(id);
    }
}

interface UserDB {
    public String getNameById(int id);
}