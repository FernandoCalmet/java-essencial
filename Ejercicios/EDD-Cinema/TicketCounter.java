public class TicketCounter {
    final static int PROCESS = 120;
    final static int MAX_CASHIERS = 10;
    final static int NUM_CUSTOMERS = 100;

    public static void main(String[] args) {
        Customer customer;
        LinkedQueue<Customer> customerQueue = new LinkedQueue<Customer>();
        int[] cashierTime = new int[MAX_CASHIERS];
        int totalTime, averageTime, departs;

        for (int cashiers = 0; cashiers < MAX_CASHIERS; cashiers++) {
            for (int count = 0; count < cashiers; count++)
                cashierTime[count] = 0;

            for (int count = 1; count <= NUM_CUSTOMERS; count++)
                customerQueue.enqueue(new Customer(count * 15));

            totalTime = 0;

            while (!(customerQueue.isEmpty())) {
                for (int count = 0; count <= cashiers; count++) {
                    if (!(customerQueue.isEmpty())) {
                        customer = customerQueue.dequeue();
                        if (customer.getArrivalTime() > cashierTime[count])
                            departs = customer.getArrivalTime() + PROCESS;
                        else
                            departs = cashierTime[count] + PROCESS;
                        customer.setDepartureTime(departs);
                        cashierTime[count] = departs;
                        totalTime += customer.totalTime();
                    }
                }
            }

            averageTime = totalTime / NUM_CUSTOMERS;
            System.out.println("Number of cashiers: " + (cashiers + 1));
            System.out.println("Average time: " + averageTime + "\n");
        }
    }
}