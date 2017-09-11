//double --> double
//solves for this change depending on the payment, amount/type of passengers and distance
/* fareChange(double fair){
 *   return 0;
 * }
`*/
//TEMPLATE 
/* Fields:
 * ...this.distance...-double
 * ...this.totalPassengers...-int
 * ...this.discountPassengers...-int
 * Methods:
 * ...this.fareChange...->double
 * ...this.amount...-->dp
 * ...this.excess...->double
 */

class JeepneyTrip {
  double distance;
  int totalPassengers;
  int discountPassengers;
  
  // constants
  final int BASE_KM = 5;
  final int NORM_PAY = 7;
  final int DIS_PAY = 6;
  
  JeepneyTrip(double distance, int totalPassengers, int discountPassengers) {
    this.distance = distance;
    this.totalPassengers = totalPassengers;
    this.discountPassengers = discountPassengers;
  }
  
  double fareChange(double payment) {
    int norm = this.totalPassengers - this.discountPassengers;
    return payment - amount(norm);
  }
  
  double amount(int norm){
    if(this.distance <= 5){
      return NORM_PAY * norm + DIS_PAY * this.discountPassengers;
    }
    else{
      return ((NORM_PAY + (excess() * 0.50)) * norm)  + ((DIS_PAY + (excess() * 0.50)) * norm);
    }
  }
  
  double excess(){
    return this.distance - 5.0;
  }
}
