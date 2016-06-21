import learnshapeless.Ch01_HLists
import learnshapeless.Data.{Calculus, England}
import org.specs2.Specification
import shapeless.HNil

class HListSpec extends Specification {

  def is = s2"""
    Specification for HList examples

    ex_newton should equals "Newton" :: 1642 :: England :: HNil $e1
    ex_prependAndAppend should equals "Isaac" :: "Newton" :: 1642 :: England :: Calculus :: HNil $e2
    ex_tuple should be a tuple of (String, Int, Country) $e3
    ex_tuple_append should be (String, Int, Country, Calculus) $e4
    ex_from_tuple should be "Newton" :: 1642 :: England :: Calculus :: HNil $e5
    ex_poly should be "NEWTON" :: 1642 :: England :: Calculus :: HNil $e6
    ex_to_firstname_by_index should equals "Isaac" :: 1642 :: England :: HNil $e7
  """

  def e1 = Ch01_HLists.ex_newton must be_=== ("Newton" :: 1642 :: England :: HNil)
  def e2 = Ch01_HLists.ex_prependAndAppend must be_=== ("Isaac" :: "Newton" :: 1642 :: England :: Calculus :: HNil)
  def e3 = Ch01_HLists.ex_tuple must be_=== ("Newton", 1642, England)
  def e4 = Ch01_HLists.ex_tuple_append must be_=== ("Newton", 1642, England, Calculus)
  def e5 = Ch01_HLists.ex_from_tuple must be_=== ("Newton" :: 1642 :: England :: Calculus :: HNil)
  def e6 = Ch01_HLists.ex_poly must be_=== ("NEWTON" :: 1642 :: England :: HNil)
  def e7 = Ch01_HLists.ex_to_firstname_by_index._2 must be_=== ("Isaac" :: 1642 :: England :: HNil)

}
