/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashtable;

public class Library {
  public static void main(String[] args) {

    HashTable<String, Integer> employeeSalary = new HashTable<>();
    System.out.println(employeeSalary.isEmpty());

    employeeSalary.add("Ahmad", 800);
    employeeSalary.add("Ali", 700);
    employeeSalary.add("Heba", 600);
    employeeSalary.add("Rahaf", 700);
    employeeSalary.add("Hanaa", 600);
    employeeSalary.add("Samar", 700);
    employeeSalary.add("Ibrahim", 1000);
    employeeSalary.add("Yousef", 1200);
    employeeSalary.add("Shaimaa", 900);
    employeeSalary.add("Mais", 800);

    System.out.println("The size is => " + employeeSalary.getSize());
    System.out.println(employeeSalary.isEmpty());
//    System.out.println("Ali salary is => " + employeeSalary.get("Ali"));
//    System.out.println(employeeSalary.contains("Nawal"));
  }
}
