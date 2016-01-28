package agoda

/**
 *
 * Created by pasoktummarungsri on 3/30/15.
 */
case class ButterflyShape(size: Int) {

  def getButterflyLevel(level: Int): String = {
    var buffer: String = ""
    for (i <- 1 to level) buffer += "+ "
    for (i <- 1 to size-level) buffer += "  "
    buffer += (if (level == size) "-" else " ")
    for (i <- 1 to size-level) buffer += "  "
    for (i <- 1 to level) buffer += " +"
    buffer
  }

  def getButterfly: String = {
    var buffer: String = ""
    for (level <- 1 to size-1) buffer += getButterflyLevel(level) + "\n"
    for (level <- size to 2 by -1) buffer += getButterflyLevel(level) + "\n"
    buffer + getButterflyLevel(1)
  }

  def printButterfly: Unit = {
    print(getButterfly)
  }

}
