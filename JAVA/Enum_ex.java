class Enum_ex
{  
    enum colors 
    {
        RED, GREEN, YELLOW, WHITE, BLACK;
    }  

    public static void main(String[] args) 
    {  
        System.out.println("The colors are::");  
        for (colors s : colors.values())
        {  
            System.out.println(s);  
        }  

        System.out.println("Value of WHITE is: "+colors.valueOf("WHITE"));  
        System.out.println("Index of RED is: "+colors.valueOf("RED").ordinal());  
        System.out.println("Index of YELLOW is: "+colors.valueOf("YELLOW").ordinal());  
    }
}
