

import org.apache.spark.{SparkContext, SparkConf}


object LabAssignment2 {

  def main(args: Array[String]) {

    System.setProperty("hadoop.home.dir", "C:\\Users\\gshkr\\OneDrive\\Documents\\Big Data Analytics\\BigDataTurorials\\winutils");

    val sparkConf = new SparkConf().setAppName("LabAssignment2").setMaster("local[*]")

    val sc = new SparkContext(sparkConf)

    val input = sc.textFile("input")

    val wc = input.flatMap(line => {
      line.split(" ")
    }).map(word => (word, 1)).cache()

    val output = wc.reduceByKey(_ + _)

    /* val output=results.sortBy(_._2,false) */

    output.saveAsTextFile("results")



    val o = output.collect()

    var s: String = "Words:Count \n"
    o.foreach { case (word, count) => {

      s += word + " : " + count + "\n"

    }
    }

  }
}
