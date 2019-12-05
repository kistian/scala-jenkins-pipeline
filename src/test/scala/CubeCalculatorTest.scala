import org.scalatest.FunSuite

class CubeCalculatorTest extends FunSuite {
  test("CubeCalculator.cube") {
    assert(CubeCalculator.cube(3) === 27)
    assert(CubeCalculator.cube(0) === 0)
    assert(CubeCalculator.cube(1) === 1)
    assert(CubeCalculator.cube(2) === 8)
    assert(CubeCalculator.cube(-3) === -27)
    assert(CubeCalculator.cube(5) === 125)
    assert(CubeCalculator.cube(10) === 1000)
    assert(CubeCalculator.cube(-1) === -1)
  }
}