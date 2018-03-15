public class Customer {

      private String name;
      
      private int[] numbers = new int[10];
      private String[] names = new String[10];
      private double[] numbers = new double[10];
      
      //private Account account;
      
      private Account[] accounts;
      
      public Customer(){
          //account =  new Account(); 
          accounts = new Account[10];
      }
      
      public void openAccount(){
      
         numbers[0] = 10;
         numbers[1] = 100;
         numbers[2] = 5000;
      
         accounts[0] = new Account();
        // accounts[1] = new Account();
        // accounts[2] = new Account();
      }
        
      public String getName(){
         return name;
      }
      
      public String display(){
      
          // return navn, kontonummer og balance
          return "";
      }

}