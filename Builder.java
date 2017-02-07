import java.util.*;
import java.lang.*;
import java.io.*;

class Personal {
    private String mName;
    private int mAge;
    private String mCountry;
    private boolean misMale;
    
    private Personal(String name, int age, String country, boolean isMale) {
        this.mName = name;
        this.mAge = age;
        this.mCountry = country;
        this.misMale = isMale;
    }
    
    public static class PersonalBuilder {
        private String mName = "default name";
        private int mAge = 20;
        private String mCountry = "default country";
        private boolean misMale = false;
        
        public PersonalBuilder setName(String name) {
            this.mName = name;
            return this;
        }
        
        public PersonalBuilder setAge(int age) {
            this.mAge = age;
            return this;
        }
        
        public PersonalBuilder setCountry(String country) {
            this.mCountry = country;
            return this;
        }
        
        public PersonalBuilder setisMale(boolean isMale) {
            this.misMale = isMale;
            return this;
        }
        
        public Personal createPersonal() {
            return new Personal(this.mName, this.mAge, 
                                this.mCountry, this.misMale);
        }
    }
    
    public void showInfo() {
        System.out.println("Name: " + this.mName);
        System.out.println("Age: " + this.mAge);
        System.out.println("Country: " + this.mCountry);
        System.out.println("Sex: " + (this.misMale?"Male":"Female"));
    }
}

class BuilderPattern {
    public static void main(String [] args) throws java.lang.Exception {
        Personal p = new Personal.PersonalBuilder()
                                 .setName("Weian")
                                 .setCountry("Taiwan")
                                 .setisMale(true)
                                 .createPersonal();
        p.showInfo();
    }
}