public class AdvancedWeek {
  
    private int index = 1;
     private String day_1;
    
    private String day_2;
    
    private String day_3;
    
    private String day_4;
    
    private String day_5;
    
    private String day_6;
    
    private String day_7;
	
    

    public AdvancedWeek() {
	day_1 = "Monday";
	day_2 = "Tuesday";
	day_3 = "Wednesday";
	day_4 = "Thursday";
	day_5 = "Friday";
	day_6 = "Saturday";
	day_7 = "Sunday";
	}

   
    public void printDays() {
        System.out.println( index + ": " + day_1 + ",\n" +
		(index + 1) + ": " + day_2 + ",\n" +
		(index + 2) + ": " + day_3 + ",\n" +
		(index + 3) + ": " + day_4 + ",\n" +
		(index + 4) + ": " + day_5 + ",\n" +
		(index + 5) + ": " + day_6 + ",\n" +
		(index + 6) + ": " + day_7 + "." );
		}
    }
