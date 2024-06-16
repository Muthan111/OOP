case class Product (private var _name: String,
private var _model: String,
private var _price: Double,
private var _color: String ) {
  def name = _name;
  def model = _model;
  def price = _price;
  def color = _color;
  def this() = this("", "", 0.0, "")
  def name_= (value: String): Unit = _name = value
  def model_= (value: String): Unit = _model = value
  def price_= (value: Double): Unit = _price = value
  def color_= (value: String): Unit = _color = value
  var newProductType: Array[productType] = new Array[productType](10)

  def addProductType(newType: productType): Unit = {
    for (i <- 0 until newProductType.length) {
      if (newProductType(i) == null) {
        newProductType(i) = newType
        return
      }
    }
  }
  def removeProductType(newType: productType): Unit = {
    for (i <- 0 until newProductType.length) {
      if (newProductType(i) == newType) {
        newProductType(i) = null
        return
      }
    }
  }
}
