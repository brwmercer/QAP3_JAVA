class Person {
    protected String myName;
    protected int myAge;
    protected String myGender;

    public Person(String name, int age, String gender) {
        myName = name;
        myAge = age;
        myGender = gender;
    }

    public String getName() { return myName; }
    public void setName(String name) { myName = name; }
    public int getAge() { return myAge; }
    public void setAge(int age) { myAge = age; }
    public String getGender() { return myGender; }
    public void setGender(String gender) { myGender = gender; }

    public String toString() {
        return myName + ", age: " + myAge + ", gender:" + myGender;
    }
}