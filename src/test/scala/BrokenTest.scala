import org.specs.Specification

class BrokenTest extends Specification {
  error("boo")
  "1" in {
    1 must be(1)
  }
}