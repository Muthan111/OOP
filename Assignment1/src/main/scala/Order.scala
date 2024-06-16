import java.util.Date
class Order (_customer: Customer, _product: Product,  private var _quantity : Int = 0,
private var _orderDate : Date );
{


  def cart (product : Product, quantity: Int): Unit = {
    println(product.name)
    println(product.color)
    println(product.model)
    println(quantity)

  }
  def displayCustomer (customer: Customer): Unit = {
    println(customer.name)
    println(customer.address)
  }
  def displayOrder (product : Product, customer: Customer): Unit = {
    println("Order displayed")
  }
  def makePayment (customer: Customer, product : Product): Unit = {
     customer.balance - product.price
  }
}
