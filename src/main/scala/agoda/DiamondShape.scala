package agoda

/**
 *
 * Created by pasoktummarungsri on 3/30/15.
 */
case class DiamondShape(size: Int) {

  def getDiamondLevel(level: Int): String = {
    var buffer: String = ""
    for (i <- 1 to size/2-level+1) buffer += "  "
    for (i <- 1 to 2*level-2) buffer += "+ "
    buffer + "+"
  }

  def getDiamond: String = {
    var buffer: String = ""
    for (level <- 1 to size/2+1) buffer += getDiamondLevel(level) + "\n"
    for (level <- size/2 to 2 by -1) buffer += getDiamondLevel(level) + "\n"
    buffer + getDiamondLevel(1)
  }

  def printDiamond: Unit = {
    print(getDiamond)
  }

}
