package policy;
 
import java.util.*;
        import java.util.stream.Collectors;

class Policy{
    String policy_number;
    String name_holder;
    Double premium_amount;
    Policy(String policy_number,String name_holder,Double premium_amount){
        this.policy_number=policy_number;
        this.name_holder=name_holder;
        this.premium_amount=premium_amount;
    }

    public String getPolicy_number() {
        return policy_number;
    }

    public void setPolicy_number(String policy_number) {
        this.policy_number = policy_number;
    }

    public String getName_holder() {
        return name_holder;
    }

    public void setName_holder(String name_holder) {
        this.name_holder = name_holder;
    }

    public Double getPremium_amount() {
        return premium_amount;
    }

    public void setPremium_amount(Double premium_amount) {
        this.premium_amount = premium_amount;
    }

    @Override
    public String toString() {
        return "Name : "+name_holder+"\n"+"Number : "+policy_number+"\n"+"Premium Amount : "+premium_amount+"\n";
    }
}
public class PolicyManagement {
    static ArrayList<Policy> policies=new ArrayList<>();
    static String policy_number;
    static String name_holder;
    static Double premium_amount;

    static void filterByAmount(){
        List<Policy> policy1= policies.stream()
                .filter(person->person.premium_amount>1200)
                .collect(Collectors.toList());
        System.out.println(policy1);
    }

    static void sortByName(){
        List<Policy> policy2= policies.stream()
                .sorted((policyone,policytwo)-> CharSequence.compare(policyone.name_holder,policytwo.name_holder))
                .collect(Collectors.toList());
        System.out.println(policy2);
    }

    static void totalPremium(){
        double total_amount=policies.stream()
                .mapToDouble(n->n.premium_amount)
                .sum();
        System.out.println(total_amount);
    }

    static void printPolicy(){
        System.out.println(policies.stream().map(policy->policy.policy_number+" "+policy.name_holder+"\n").collect(Collectors.toList()));
    }

    static void filterByRange(){
        List<Policy> policy3=policies.stream()
                .filter(policy -> (policy.premium_amount>1000 && policy.premium_amount<2000))
                .collect(Collectors.toList());
        System.out.println(policy3);
    }

    static void highestPremium(){
        System.out.println(policies.stream().mapToDouble(policy->policy.premium_amount).max());
    }
    static void filterByCharacter(char character){
        List<Policy> policy4=policies.stream()
                .filter(policy -> (policy.name_holder.charAt(0)==character))
                .collect(Collectors.toList());
        System.out.println(policy4);
    }

    static void findAverage(){
        double total_amount=policies.stream()
                .mapToDouble(n->n.premium_amount)
                .sum();
        double average=total_amount/policies.size();
        System.out.println(average);
    }

    static void sortByAmount(){
        List<Policy> policy4= policies.stream()
                .sorted((policyone,policytwo)->  Double.compare(policyone.premium_amount,policytwo.premium_amount))
                .collect(Collectors.toList());
        System.out.println(policy4);
    }

    static void policyExceeds(){
        List<Policy> policy5= policies.stream()
                .filter(policy -> policy.premium_amount>2000)
                .collect(Collectors.toList());
        System.out.println(policy5);
    }

    static void rangePremium(double start,double end){
        List<Policy> policy6= policies.stream()
                .filter(policy -> policy.premium_amount>start && policy.premium_amount<end)
                .collect(Collectors.toList());
        System.out.println(policy6.size());
    }

    static  void uniqueHolder(){
        Set<String> policySet=new HashSet<>();
        System.out.println(policies.stream().map(policy -> policy.name_holder).map(name->policySet.add(name)));
    }

    static void findBySubstring(String substring){
        List<Policy> subString=policies.stream()
                .filter(policy->policy.name_holder.contains(substring))
                .collect(Collectors.toList());
        System.out.println(subString);
    }
    static void maptoPolicyAmount(){
//        Map<String,Double> maping=policies.stream()
//                .collect(Collectors.toMap())
    }
    public static void main(String[] args){
        int choice;
        do{
            System.out.println("Enter the choice");
            System.out.println("1.Add new policy");
            System.out.println("2.Remove Policy by number");
            System.out.println("3.Update policy details");
            System.out.println("4.Display policies");
            System.out.println("5.Operations");
            System.out.println("6.Exit");
            Scanner scannerobject=new Scanner(System.in);
            choice=scannerobject.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter the details of new policy");
                    System.out.println("Name of Policy holder");
                    scannerobject.nextLine();
                    name_holder=scannerobject.nextLine();
                    System.out.println("Name of Policy number");
                    policy_number=scannerobject.next();
                    System.out.println("Premium Amount Amount");
                    premium_amount=scannerobject.nextDouble();
                    Policy policyobject=new Policy(policy_number,name_holder,premium_amount);
                    policies.add(policyobject);
                    System.out.println(policies);
                    break;
                case 2:
                    System.out.println("Enter the policy number to remove");
                    String remove_policy=scannerobject.next();
                    for(int i=0;i<policies.size();i++){
                        if(remove_policy.equals(policies.get(i).policy_number)){
                            policies.remove(i);
                        }
                    }
                    System.out.println("Removed");
                    System.out.println(policies);
                    break;
                case 3:
                    System.out.println("Update policy details");
                    int field_update;
                    System.out.println("Enter the policy number of which should be edited");
                    String policy_editing_number=scannerobject.next();
                    do{
                        System.out.println("Enter which field to update");
                        System.out.println("1.Name");
                        System.out.println("2.Policy Number");
                        System.out.println("3.Premium Amount");
                        System.out.println("4.Exit");
                        field_update=scannerobject.nextInt();
                        Policy policyobject_editing=null;
                        for(int i=0;i<policies.size();i++)
                        {
                            if(policy_editing_number.equals(policies.get(i).policy_number))
                            {
                                policyobject_editing=policies.get(i);
                            }
                        }
                        switch (field_update){
                            case 1:
                                System.out.println("Enter the new name");
                                scannerobject.nextLine();
                                String new_name=scannerobject.nextLine();
                                policyobject_editing.setName_holder(new_name);
                                break;
                            case 2:
                                System.out.println("Enter the new Policy Number");
                                String new_number=scannerobject.next();
                                policyobject_editing.setPolicy_number(new_number);
                                break;

                            case 3:
                                System.out.println("Enter the new Coverage Amount");
                                Double new_premium=scannerobject.nextDouble();
                                policyobject_editing.setPremium_amount(new_premium);
                                break;
                            case 4:
                                System.out.println("Exiting");
                                break;
                            default:
                                System.out.println("Invalid ");
                        }
                    }while (field_update<4);
                    System.out.println("Updation Completed");
                    break;
                case 4:
                    System.out.println("Displaying Details");
                    for(int i=0;i<policies.size();i++){
                        System.out.println(policies.get(i));
                    }
                    break;
                case 5:
                    System.out.println("These are the available operations");
                    int operation;
                    do{
                        System.out.println("1.Filter by premium amount");
                        System.out.println("2.Sort by policy holder name");
                        System.out.println("Enter the choice");
                        operation=scannerobject.nextInt();
                        switch (operation){
                            case 1:
                                filterByAmount();
                                break;
                            case 2:
                                sortByName();
                                break;
                            case 3:
                                totalPremium();
                                break;
                            case 4:
                                printPolicy();
                                break;
                            case 5:
                                filterByRange();
                                break;
                            case 6:
                                highestPremium();
                                break;
                            case 7:
                                System.out.println("Enter character");
                                char character=scannerobject.next().charAt(0);
                                filterByCharacter(character);
                                break;
                            case 8:
                                findAverage();
                                break;
                            case 9:
                                sortByAmount();
                                break;
                            case 10:
                                policyExceeds();
                                break;
                            case 11:
                                System.out.println("Enter the ranges");
                                Double start=scannerobject.nextDouble();
                                Double end=scannerobject.nextDouble();
                                rangePremium(start,end);
                                break;
                            case 12:
                                uniqueHolder();
                                break;
                            case 13:
                                System.out.println("Enter the substring");
                                String substring=scannerobject.next();
                                findBySubstring(substring);
                                break;
                            case 14:
                                maptoPolicyAmount();
                                break;
                            case 15:
                                System.out.println("Exiting");
                                break;
                            default:
                                System.out.println("Invalid");
                        }
                    }while(operation<15);

                    break;
                case 6:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid ");

            }

        }while (choice<6);
    }
}