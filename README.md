# Transactions-Analyzer
In this code, we assume that the log file containing transactions is named "transactions.log" and located in the same directory as the Java file. You can modify the LOG_FILE_PATH constant to match the actual path and name of your log file.

The parseLogTransactions method reads the log file line by line, parses each line into a Transaction object using the parseTransactionFromLogLine method, and stores valid transactions in a list.

The parseTransactionFromLogLine method splits each log line using a comma as the delimiter and extracts the phone number, description, and amount of the transaction. It creates a Transaction object if the line format is valid.

The filterTransactionsByPhoneNumber method filters the list of transactions based on the given phone number, returning a new list that only contains transactions with a matching phone number.

In the main method, you can specify the phoneNumber variable to filter the transactions for a specific number. The code then prints the filtered transactions' description and amount to the
