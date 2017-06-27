public class Bus {

  private String route;
  private Person[] passengers;

  public Bus(String route) {
    this.route = route;
    this.passengers = new Person[5];
  }

  public String getRoute() {
    return this.route;
  }

  public int passengerCount() {
    int count = 0;
    for(Person person : passengers){
      if(person != null){
        count++;
      }
    }
    return count;
  }

  public void boaring(Person person){
    int passengerCount = passengerCount();
    passengers[passengerCount] = person;
  }











}