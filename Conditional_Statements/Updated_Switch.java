class Updated_Switch {
    public static void main(String[] args){
        String day = "Monday";
        String result = "";
        result = switch(day)
        {
            case "Saturday", "Sunday" : yield "6am";
            case "Monday" : yield  "8am";
            default : yield  "7am";
        };
        System.out.println(result);
    } 
}

//Another way
class Updated_Switch_Version_1 {
    public static void main(String[] args){
        String day = "Monday";
        String result = "";
        result = switch(day)
        {
            case "Saturday", "Sunday" -> "6am";
            case "Monday" -> "8am";
            default -> "7am";
        };
        System.out.println(result);
    } 
}

//Adding return keyword is not required 