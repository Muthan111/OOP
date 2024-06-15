class Category () {
  var fillcategory : Array[productType] = new Array[productType](10)

  def addType(newtype: productType): Unit = {
    for (i <- 0 until fillcategory.length) {
      if (fillcategory(i) == null) {
        fillcategory(i) = newtype
        return
      }
    }
  }

  def removeType(newtype: productType): Unit = {
    for (i <- 0 until fillcategory.length) {
      if (fillcategory(i) == newtype) {
        fillcategory(i) = null
        return
      }
    }
  }















}
