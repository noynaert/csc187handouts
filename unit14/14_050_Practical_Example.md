# 14.050 Practical Example

## Person Class

```java
package com.noynaert.people;

public class Person {
    private String name;
    private String idNumber;

    public Person(String name, String idNumber){
        this.name = name;
        this.idNumber = idNumber;
    }
    public Person(){
        this(" -- ", "");
    }

    @Override
    public String toString(){
        String s = String.format("%-20s ID: %10s",name,idNumber);
        return s;
    }

}
```
## Employee Class
```java
package com.noynaert.people;  
  
import java.time.LocalDate;  
  
public class Employee  extends Person{  
    LocalDate hireDate;  
  
    public Employee(String name, String idNumber, int year, int month, int day){  
  
        super(name, idNumber);  
        hireDate = LocalDate.of(year,month,day);  
  
    }  
  
    @Override  
    public String toString(){  
        String s = "";  
        s = super.toString();  
        s += " " + hireDate;  
  
        return s;  
    }  
  
}
```

## Customer

```java
package com.noynaert.people;  
  
public class Customer extends Person{  
    double lastPurchaseAmount;  
  
    public Customer(String name, String idNumber){  
        super(name,idNumber);  
        lastPurchaseAmount = 0.0;  
    }  
    public void setLastPurchaseAmount(double lastPurchaseAmount){  
        this.lastPurchaseAmount = lastPurchaseAmount;  
    }  
    @Override  
    public String toString(){  
        String s = "";  
        s = String.format("%s $%1.2f",super.toString(),lastPurchaseAmount);  
        return s;  
    }  
}
```

## Main

```java
import com.noynaert.people.*;  
  
public class Main14 {  
    public static void main(String[] args) {  
        Person[] list = new Person[10];  
        list[0] = new Person("Flintstone, Fred", "00001");  
        list[1] = new Person();  
        list[2] = new Employee("Barney Rubble", "00002",2020,5,19);  
        Customer customer = new Customer("Flintstone, Wilma", "00003");  
        customer.setLastPurchaseAmount(100.00);  
        list[3] = customer;  
  
        int n = 4;  
  
        for(int i=0;i<n;i++){  
            System.out.println(list[i]);  
        }  
  
        System.out.println("\nDone!");  
    }  
}
```

