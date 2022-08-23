package bank;

class Account{
  public String name;
  protected String email;
    private int id=10;

//to access private access modifier we use getter and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
public class Bank {
  public static void main(String[] args) {

      Account account=new Account();
      account.name="Harshala";
      account.email="harshalaathani@gmail.com";
      account.setId(10);
      System.out.println(account.getId());

  }
}
