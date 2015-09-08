public class Arithmetic { //this is my main class
    public static void main(String[] args ){ //this is my main method
        int nSocks = 3; //number of pairs of socks
        double sockCost$ = 2.58; //cost per pair of socks
        int nDrinkingGlasses = 6; //number of drinking glasses
        double glassCost$ = 2.29; //cost per drinking glass
        int nEnvelopes = 1; //number of envelopes
        double envelopeCost$ = 3.25; //cost per box of envelopes
        double taxPercent = 0.06; //this is the percent of tax of each item
        
        System.out.println("The amount of pairs of socks you are buying are " + nSocks); //this prints the amount of pairs of socks you are buying
        System.out.println("The socks cost $" + sockCost$ + " per pair"); //this prints out how much each pair of socks cost
        double totalSocks = (nSocks * sockCost$); //this calculates the total cost of the socks without tax
        System.out.println("The total cost before taxes of the socks are $" + totalSocks);//this prints out the total cost of the socks without tax
        double taxSocks = Math.floor((taxPercent * totalSocks) * 100) / 100; //this calculates the amount of tax on the socks. This also restricts the output to only the hundreth's place.
        System.out.println("The sales tax on the socks is $" + taxSocks); //this prints the tax on the socks
        double finalSocks = Math.floor((totalSocks + taxSocks) * 100) / 100; //this calculates the final cost of the socks with tax. This also restricts the output to only the hundreth's place.
        System.out.println("The final cost of the socks including tax is $" + finalSocks); //This prints the final cost of the socks with tax
        
        System.out.println("The amount of drinking glasses you are buying are " + nDrinkingGlasses); //this prints the amount of drinking glasses you are buying
        System.out.println("The drinking glasses cost $" + glassCost$ + " per glass"); //this prints the cost for each drinking glass
        double totalDrinkingGlasses = (nDrinkingGlasses * glassCost$); //This calculates the total cost of the glasses without tax
        System.out.println("The total cost before taxes of the glasses are $" + totalDrinkingGlasses); //this prints the total cost of the glasses without tax
        double taxDrinkingGlasses = Math.floor((taxPercent * totalDrinkingGlasses) * 100) / 100; //this calculates the amount of tax on the drinking glasses. This also restricts the output to only the hundreth's place.
        System.out.println("The sales tax on the drinking glasses is $" + taxDrinkingGlasses); //this prints out the amount of sales tax on the drinking glasses
        double finalDrinkingGlasses = (totalDrinkingGlasses + taxDrinkingGlasses); //this calculates the final cost of the drinking glasses with tax
        System.out.println("The final cost of the drinking glasses including tax is $" + finalDrinkingGlasses); //this prints the final cost of the drinking glasses with tax
        
        System.out.println("The amount of boxes of envelopes you are buying are " +nEnvelopes); //this prints the amount of boxes of envelopes you are buying
        System.out.println("The envelopes cost $" + envelopeCost$ + " per box"); //this prints out how much each box of envelopes cost
        double totalEnvelopes = (nEnvelopes * envelopeCost$); //this calculates the total cost of the envelopes without tax
        System.out.println("The total cost before taxes of the envelopes is $" + totalEnvelopes); //this prints out the total cost of the envelopes without tax
        double taxEnvelopes = Math.floor((taxPercent * totalEnvelopes) * 100) / 100; // this calculates the amount of tax on the envelopes. This also restricts the output to only the hundreth's place.
        System.out.println("The sales tax on the boxes of envelopes is $" + taxEnvelopes); //This prints out the amount of sales tac on the boxes of envelopes
        double finalEnvelopes = (totalEnvelopes + taxEnvelopes); //this calculates the final cost of the envelopes with tax
        System.out.println("The final cost of the envelopes is $" + finalEnvelopes); //this prints the final cost of the envelopes with tax
        
        double totalPurchase = (totalSocks + totalDrinkingGlasses + totalEnvelopes); //This calculates the total cost before tax of all the items
        System.out.println("The total cost of all the items before tax is $" + totalPurchase); //this prints the total cost before tax of all the items
        
        double totalTax = (taxSocks + taxDrinkingGlasses +  taxEnvelopes); //this calculates the total tax of the entire purchase
        System.out.println("The total cost of tax of the entire transaction is $" + totalTax); //This prints the total tax of the entire purchase
        
        double finalCost = (totalPurchase + totalTax); //this calculates the final price of the transaction including tax
        System.out.println("The final cost of the the entire transaction including tax is $" + finalCost); //this prints the final price of the transaction including tax
    }
}   