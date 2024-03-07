public class Main {
    public static void main(String[] args) {


        AutoPolicy policy1 = new AutoPolicy(00056567, "Toyota camry", "ME");
        AutoPolicy policy2 = new AutoPolicy(00123545, "Mercediz Benz", "NJ");


        policyInNoFaultState(policy1);
        policyInNoFaultState(policy2);
    }

    public static void policyInNoFaultState(AutoPolicy policy) {
        System.out.println("The auto policy:");
        System.out.printf(
                "Account #: %d; Car: %s;%nState %s %s a no-fault state%n%n",
                policy.getAccountNumber(), policy.getMakeAndModel(),
                policy.getState(),
                (policy.isNoFaultState() ? "is" : "is not")); // fixed the missing quote and parenthesis
    }




}

