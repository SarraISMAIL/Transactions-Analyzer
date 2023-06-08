

/**
 *
 * @author Sarra ISMAIL
 */

package transactionall;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class LogAnalyzer {
    private static final String LOG_FILE_PATH = "transactions.log";

    public static void main(String[] args) {
        String phoneNumber = "+216 7889 64";
        List<TransactionALL> transactions = parseLogTransactions();
        List<TransactionALL> filteredTransactions = filterTransactionsByPhoneNumber(transactions, phoneNumber);

        System.out.println("Transactions for number " + phoneNumber + ":");
        for (TransactionALL transaction : filteredTransactions) {
            System.out.println(transaction.getDescription() + ": $" + transaction.getAmount());
        }
    }

    private static List<TransactionALL> parseLogTransactions() {
        List<TransactionALL> transactions = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("C:/Users/Sarra ISMAIL/Documents/NetBeansProjects/TransactionALL/src/transactionall/transactions.log"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                TransactionALL transaction = parseTransactionFromLogLine(line);
                if (transaction != null) {
                    transactions.add(transaction);
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the log file: " + e.getMessage());
        }

        return transactions;
    }

    private static TransactionALL parseTransactionFromLogLine(String line) {
        String[] parts = line.split(",");
        if (parts.length == 3) {
            String phoneNumber = parts[0].trim();
            String description = parts[1].trim();
            double amount = Double.parseDouble(parts[2].trim());
            return new TransactionALL(phoneNumber, description, amount);
        }
        return null; // Invalid log line format
    }

    private static List<TransactionALL> filterTransactionsByPhoneNumber(List<TransactionALL> transactions, String phoneNumber) {
        List<TransactionALL> filteredTransactions = new ArrayList<>();

        for (TransactionALL transaction : transactions) {
            if (transaction.getPhoneNumber().equals(phoneNumber)) {
                filteredTransactions.add(transaction);
            }
        }

        return filteredTransactions;
    }
}
