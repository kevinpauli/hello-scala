package greeter

object HelloWorksheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(52); 
  val x = 1;System.out.println("""x  : Int = """ + $show(x ));$skip(31); 
  def increase(i: Int) = i + 1;System.out.println("""increase: (i: Int)Int""");$skip(14); val res$0 = 
  increase(x);System.out.println("""res0: Int = """ + $show(res$0));$skip(4); val res$1 = 
  x;System.out.println("""res1: Int = """ + $show(res$1));$skip(14); val res$2 = 
  increase(x);System.out.println("""res2: Int = """ + $show(res$2));$skip(6); val res$3 = 
  1+1;System.out.println("""res3: Int(2) = """ + $show(res$3));$skip(6); val res$4 = 
  2+2;System.out.println("""res4: Int(4) = """ + $show(res$4))}
}
