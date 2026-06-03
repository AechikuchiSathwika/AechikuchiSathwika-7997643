import java.sql.*;
class Transaction {
    Connection con;
    Transaction() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college",
                "root",
                "Sathwika@190814"
            );

        } catch(Exception e) {
            System.out.println(e);
        }
    }

    void transfer(int fromId, int toId, double amount) {
        try {
            con.setAutoCommit(false);
            String debitQuery =
                "UPDATE accounts SET balance = balance - ? WHERE id = ?";
            PreparedStatement debit =
                con.prepareStatement(debitQuery);
            debit.setDouble(1, amount);
            debit.setInt(2, fromId);
            int debitRows = debit.executeUpdate();
            String creditQuery =
                "UPDATE accounts SET balance = balance + ? WHERE id = ?";
            PreparedStatement credit =
                con.prepareStatement(creditQuery);
            credit.setDouble(1, amount);
            credit.setInt(2, toId);
            int creditRows = credit.executeUpdate();
            if(debitRows > 0 && creditRows > 0) {
                con.commit();
                System.out.println("Transaction Successful");
            }
            else {
                con.rollback();
                System.out.println("Transaction Failed");
            }
        }
        catch(Exception e) {
            try {
                con.rollback();
            }
            catch(Exception ex) {
                System.out.println(ex);
            }
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        Transaction t = new Transaction();
        t.transfer(1, 2, 1000);
    }
}