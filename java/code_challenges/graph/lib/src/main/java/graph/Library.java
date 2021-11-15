/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package graph;


public class Library {
  public boolean someLibraryMethod() {
    return true;
  }

  public static void main(String[] args) {
    Graph BreadthFirst = new Graph();
    Vertex a = BreadthFirst.addVertex("Pandora");
    Vertex b = BreadthFirst.addVertex("Arendelle");
    Vertex c = BreadthFirst.addVertex("Metroville");
    Vertex d = BreadthFirst.addVertex("Monstropolis");
    Vertex e = BreadthFirst.addVertex("Narnia");
    Vertex f = BreadthFirst.addVertex("Naboo");

    BreadthFirst.addEdge("Pandora", "Arendelle");
    BreadthFirst.addEdge("Arendelle", "Metroville");
    BreadthFirst.addEdge("Arendelle", "Monstropolis");
    BreadthFirst.addEdge("Metroville", "Narnia");
    BreadthFirst.addEdge("Metroville", "Naboo");
    BreadthFirst.addEdge("Monstropolis", "Naboo");
    BreadthFirst.addEdge("Narnia", "Naboo");

    System.out.println("\nBreadth First Start with Vertex" + " 'Pandora'" + ":");
    BreadthFirst.breadthFirst(a);
    System.out.println("\n\n");

    Graph businessTrip = new Graph();
    Vertex first = businessTrip.addVertex("Pandora");
    Vertex second = businessTrip.addVertex("Arendelle");
    Vertex third = businessTrip.addVertex("Metroville");
    Vertex fourth = businessTrip.addVertex("Monstropolis");
    Vertex fifth = businessTrip.addVertex("Narnia");
    Vertex sixth = businessTrip.addVertex("Naboo");

    businessTrip.addEdge("Pandora", "Arendelle", 150);
    businessTrip.addEdge("Arendelle", "Metroville", 99);
    businessTrip.addEdge("Pandora", "Metroville", 82);
    businessTrip.addEdge("Arendelle", "Monstropolis", 42);
    businessTrip.addEdge("Metroville", "Monstropolis", 105);
    businessTrip.addEdge("Metroville", "Narnia", 37);
    businessTrip.addEdge("Metroville", "Naboo", 26);
    businessTrip.addEdge("Monstropolis", "Naboo", 73);
    businessTrip.addEdge("Narnia", "Naboo", 250);

    System.out.println("\n\n");
    String[] trip1 = {"Metroville", "Pandora"};
    String[] trip2 = {"Arendelle", "Monstropolis", "Naboo"};
    String[] trip3 = {"Naboo", "Pandora"};
    String[] trip4 = {"Narnia", "Arendelle", "Naboo"};
    System.out.println("Trip1= {\"Metroville\" , \"Pandora\"}\n " + businessTrip.businessTrip(trip1));
    System.out.println("\n Trip2 = {\"Arendelle\" , \"Monstropolis\", \"Naboo\"}\n" + businessTrip.businessTrip(trip2));
    System.out.println("\n Trip3 = {\"Naboo\" , \"Pandora\"} \n" + businessTrip.businessTrip(trip3));
    System.out.println("\n Trip4 = {\"Narnia\" , \"Arendelle\", \"Naboo\"}\n" + businessTrip.businessTrip(trip4));

  }
}