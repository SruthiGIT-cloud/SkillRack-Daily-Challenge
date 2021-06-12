class Student
{
    String name;
    int age;
    String country;
    Student(String a,int n,String b)
    {
        name=a;
        age=n;
        country=b;
    }
    
    public boolean equals(Student obj)
    {
        if(name.equalsIgnoreCase(obj.name) && 
       age==obj.age && 
       country.equalsIgnoreCase(obj.country) )
        {
            return true; 
        }
        else
        {
            return false;
        }
    
    }
    
}
