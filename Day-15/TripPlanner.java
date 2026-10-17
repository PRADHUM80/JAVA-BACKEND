class Trip
{
 public String suggestionPlan(String src, String dest, int budget)
 {
    String suggestion = null;
    if(budget <= 1000)
    {
        suggestion = " You can Saty in home";
        System.out.println(suggestion);
    }
    else if (budget > 1000 && budget <= 3000 )
    {
        suggestion = "yo can vist City";
        System.out.println(suggestion);
    }

    else if (budget > 3000 && budget <= 5000)
    {
        suggestion = " u Visit in Goa : ";
        System.out.println(suggestion);
    }
    
    else 
    {
        System.out.println("u Visite anywhere");
    }
    return  suggestion;
 }
}

class TripPlanner
{
    public static void main(String[] args) {
        
        Trip t = new Trip();
        String response = t.suggestionPlan("BLR", "Goa", 3500);
        System.out.println(response);
    }
}