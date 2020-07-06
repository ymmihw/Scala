package com.ymmihw.scala

import java.io.{BufferedReader, BufferedWriter, DataOutputStream, File, FileOutputStream, FileReader, FileWriter, PrintWriter}

import org.junit.Test

import scala.util.{Random, Try}

class FileIOTest {
  @Test
  def fileWriterTest = {
    val fileWriter = new FileWriter(new File("target/fileWriterTest.txt"))
    fileWriter.write("hello there")
    fileWriter.close()
  }

  @Test
  def printWriterTest = {
    val writer = new PrintWriter(new File("target/printWriterTest.txt"))
    val s = "big"
    val numberOfLines = 3000000
    writer.printf("This is a %s program with %d of code", s, new Integer(numberOfLines))
    writer.close()
  }

  @Test
  def dataOutputStreamTest1 = {
    val printWriter = new PrintWriter(new FileOutputStream(new File("target/dataOutputStreamTest1.txt")))
    val random = Random
    for (_ <- 1 to 10000) {
      printWriter.write(random.nextDouble().toString)
    }

    printWriter.close()
  }

  @Test
  def dataOutputStreamTest2 = {
    val random = Random
    val dataOutputStream = new DataOutputStream(new FileOutputStream(new File("target/dataOutputStreamTest2.txt")))
    for (_ <- 1 to 10000) {
      dataOutputStream.writeDouble(random.nextDouble())
    }

    dataOutputStream.close()
  }

  @Test
  def dataOutputStreamTest3 = {
    val pi = Math.PI
    val dataOutputStream = new DataOutputStream(new FileOutputStream(new File("target/dataOutputStreamTest3.txt")))

    dataOutputStream.writeDouble(pi)
    val piLengthDouble = dataOutputStream.size() // evaluates to 8

    dataOutputStream.flush() // clear the buffer

    val piLengthString = pi.toString.getBytes.length // evalueates to 17
  }

  @Test
  def handlingExceptionsWhenWriteFile = {
    Try {
      val fileWriter = new FileWriter(new File("target/handlingExceptions.txt"))
      fileWriter.write("Hello World!")
      fileWriter.close()
    }.toEither match {
      case Left(ex) =>
      // handle exception: ex
      case Right(_) =>
      // write operation was successfull
    }
  }

  @Test
  def bufferedWriterTest = {
    val bufferedPrintWriter = new BufferedWriter(new PrintWriter(new File("target/bufferedWriterTest.txt")))
    val random = Random
    for (_ <- 1 to 10000) {
      bufferedPrintWriter.write(random.nextDouble().toString)
    }
    bufferedPrintWriter.close()
  }

  @Test
  def bufferedSourceTest = {
    val fileName = "data.txt"
    val bufferedSource = scala.io.Source.fromFile(fileName)
    for (lines <- bufferedSource.getLines()) {
      // do something with lines
    }
    bufferedSource.close()
  }

  @Test
  def handlingExceptionsWhenReadFile = {
    val fileName = "data.txt"
    Try {
      val bufferedSource = scala.io.Source.fromFile(fileName)
      for (lines <- bufferedSource.getLines()) {
        // do something with lines
      }
      bufferedSource
    }.toEither match {
      case Left(error) =>
      //handle error
      case Right(bufferedSource) =>
        //close buffered source
        bufferedSource.close()
    }
  }

  @Test
  def readWhole = {
    val fileName = "data.txt"
    val bufferedSource = scala.io.Source.fromFile(fileName)
    val text = bufferedSource.getLines().mkString
    bufferedSource.close()
  }

  @Test
  def readUseJavaApi = {
    val fileName = "data.txt"
    val fileReader = new BufferedReader(new FileReader(fileName))

    def handleRead(line: String): Unit = {
      //handle line that was read
      val newLine = fileReader.readLine()
      if (newLine != null) // if there are more lines to read
      handleRead(newLine)
    }

    handleRead(fileReader.readLine())
    fileReader.close()
  }
}
