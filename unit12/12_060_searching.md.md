# 12.060 Searching

We will do more searching next week.  This week we will be using the equals() method to do searching.

The following code assumes the data has been read into an array of teams.

```java 
/**  
 * Searches for a team * @param teams is the array of teams  
 * @param name is the name of the team we are looking for  
 * @param n is the number of items on the list  
 * @return -1 is returned if not found.  Otherwise, the return value is the index in the array.  
 */public static int search(Team[] teams, int n, String name){  
    int foundAt = -1;  
    boolean found = false;  
    Team target = new Team(name,0);  
    int i=0;  
    while(!found && i < n){  
        found = teams[i].equals(target);  
        if(found){  
            foundAt = i;  
        }  
        i++;  
    }  
    return foundAt;  
}
```

## The routine for calling the search.

```java
Scanner keyboard = new Scanner(System.in);  
String teamName;  
do{  
    System.out.print("What team? (Hit enter to quit) ");  
    teamName = keyboard.nextLine().trim().toLowerCase();  
    if(!teamName.isEmpty()){  
        int foundAt = search(teams,n,teamName);  
        if(foundAt != -1){  
            System.out.println(teams[foundAt]);  
        }else{  
            System.out.printf("Team %s was not found.\n",teamName);  
        }  
    }}while(!teamName.isEmpty());
```