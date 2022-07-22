package Java.Java0721.Question3;

public class Bank {
    private int id;
    private int password;
    private int saveMoney;

    public Bank() {

    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getSaveMoney() {
        return saveMoney;
    }

    public void setSaveMoney(int saveMoney) {
        this.saveMoney = saveMoney;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + password;
        result = prime * result + saveMoney;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Bank other = (Bank) obj;
        if (id != other.id)
            return false;
        if (password != other.password)
            return false;
        if (saveMoney != other.saveMoney)
            return false;
        return true;
    }

}
