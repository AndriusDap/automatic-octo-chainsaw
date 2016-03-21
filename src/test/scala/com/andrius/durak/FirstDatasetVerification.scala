package com.andrius.durak

import org.scalatest.{Matchers, FlatSpec}

class FirstDatasetVerification extends FlatSpec with Matchers {

  case class TestCase(result: Option[PlayerNumber], playerOne: List[Card], playerTwo: List[Card])

  def C(s : String): Card = Card(Suite(s.head), Rank(s.last)).get

  /** *
    * Test cases generated from sample file
    */

  "Case" must "resolve TestCase(Some(First), List(C('HQ'), C('H7'), C('HK'), C('C2')), List(C('S4'), C('H6'), C('C7'), C('S6'), C('H5')))" in {
    val testCase = TestCase(Some(First), List(C("HQ"), C("H7"), C("HK"), C("C2")), List(C("S4"), C("H6"), C("C7"), C("S6"), C("H5")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(Second), List(C('D6'), C('S3'), C('CQ'), C('D7')), List(C('H3'), C('HA'), C('S6'), C('S7'), C('D9')))" in {
    val testCase = TestCase(Some(Second), List(C("D6"), C("S3"), C("CQ"), C("D7")), List(C("H3"), C("HA"), C("S6"), C("S7"), C("D9")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('H7'), C('HK'), C('C8')), List(C('DJ'), C('DA'), C('S8')))" in {
    val testCase = TestCase(Some(First), List(C("H7"), C("HK"), C("C8")), List(C("DJ"), C("DA"), C("S8")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('H7'), C('HJ')), List(C('C2'), C('HA'), C('H4')))" in {
    val testCase = TestCase(Some(First), List(C("H7"), C("HJ")), List(C("C2"), C("HA"), C("H4")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('C4'), C('DQ'), C('S4')), List(C('C3'), C('C6'), C('DT')))" in {
    val testCase = TestCase(Some(First), List(C("C4"), C("DQ"), C("S4")), List(C("C3"), C("C6"), C("DT")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('D3'), C('DA'), C('H2')), List(C('S3'), C('H7'), C('HA')))" in {
    val testCase = TestCase(Some(First), List(C("D3"), C("DA"), C("H2")), List(C("S3"), C("H7"), C("HA")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(Second), List(C('S6'), C('SA'), C('C5'), C('D8'), C('HK')), List(C('HT'), C('D7'), C('H5'), C('S7'), C('DA')))" in {
    val testCase = TestCase(Some(Second), List(C("S6"), C("SA"), C("C5"), C("D8"), C("HK")), List(C("HT"), C("D7"), C("H5"), C("S7"), C("DA")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('H2'), C('DQ'), C('DK'), C('C7')), List(C('CQ'), C('C3'), C('ST'), C('D8'), C('CK')))" in {
    val testCase = TestCase(Some(First), List(C("H2"), C("DQ"), C("DK"), C("C7")), List(C("CQ"), C("C3"), C("ST"), C("D8"), C("CK")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(Second), List(C('C3'), C('DQ'), C('D4'), C('S5')), List(C('S8'), C('H4'), C('H2'), C('D5')))" in {
    val testCase = TestCase(Some(Second), List(C("C3"), C("DQ"), C("D4"), C("S5")), List(C("S8"), C("H4"), C("H2"), C("D5")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('H7'), C('H6'), C('D4')), List(C('D8'), C('D7'), C('CT'), C('S3')))" in {
    val testCase = TestCase(Some(First), List(C("H7"), C("H6"), C("D4")), List(C("D8"), C("D7"), C("CT"), C("S3")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(Second), List(C('DK'), C('D2'), C('C4')), List(C('HK'), C('S5'), C('D5'), C('D3')))" in {
    val testCase = TestCase(Some(Second), List(C("DK"), C("D2"), C("C4")), List(C("HK"), C("S5"), C("D5"), C("D3")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(Second), List(C('C3'), C('CQ'), C('S6')), List(C('D4'), C('DQ'), C('CT')))" in {
    val testCase = TestCase(Some(Second), List(C("C3"), C("CQ"), C("S6")), List(C("D4"), C("DQ"), C("CT")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('DQ'), C('SA'), C('H5'), C('H8')), List(C('HK'), C('DA'), C('S6'), C('S9'), C('C6')))" in {
    val testCase = TestCase(Some(First), List(C("DQ"), C("SA"), C("H5"), C("H8")), List(C("HK"), C("DA"), C("S6"), C("S9"), C("C6")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('H5'), C('SQ'), C('CT')), List(C('S3'), C('C5'), C('HK'), C('D6')))" in {
    val testCase = TestCase(Some(First), List(C("H5"), C("SQ"), C("CT")), List(C("S3"), C("C5"), C("HK"), C("D6")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(None, List(C('SQ'), C('DA'), C('C6'), C('D3')), List(C('S5'), C('H7'), C('H9'), C('CA')))" in {
    val testCase = TestCase(None, List(C("SQ"), C("DA"), C("C6"), C("D3")), List(C("S5"), C("H7"), C("H9"), C("CA")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(Second), List(C('HK'), C('D7'), C('C4'), C('S3'), C('DK')), List(C('H7'), C('HJ'), C('CJ'), C('H9'), C('DQ')))" in {
    val testCase = TestCase(Some(Second), List(C("HK"), C("D7"), C("C4"), C("S3"), C("DK")), List(C("H7"), C("HJ"), C("CJ"), C("H9"), C("DQ")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(Second), List(C('ST'), C('DJ'), C('SA')), List(C('D5'), C('C5'), C('H3')))" in {
    val testCase = TestCase(Some(Second), List(C("ST"), C("DJ"), C("SA")), List(C("D5"), C("C5"), C("H3")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('DT'), C('SA'), C('H4'), C('CJ')), List(C('ST'), C('D7'), C('SQ'), C('S3'), C('S5')))" in {
    val testCase = TestCase(Some(First), List(C("DT"), C("SA"), C("H4"), C("CJ")), List(C("ST"), C("D7"), C("SQ"), C("S3"), C("S5")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(Second), List(C('SJ'), C('S2'), C('SA')), List(C('H7'), C('HT'), C('H8'), C('S8')))" in {
    val testCase = TestCase(Some(Second), List(C("SJ"), C("S2"), C("SA")), List(C("H7"), C("HT"), C("H8"), C("S8")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('SK'), C('C9'), C('C6'), C('D6'), C('S9')), List(C('CJ'), C('CQ'), C('C8'), C('D3'), C('S7')))" in {
    val testCase = TestCase(Some(First), List(C("SK"), C("C9"), C("C6"), C("D6"), C("S9")), List(C("CJ"), C("CQ"), C("C8"), C("D3"), C("S7")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('D5'), C('H6'), C('H5')), List(C('C7'), C('DA'), C('DQ'), C('C3')))" in {
    val testCase = TestCase(Some(First), List(C("D5"), C("H6"), C("H5")), List(C("C7"), C("DA"), C("DQ"), C("C3")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('H7'), C('D7'), C('HT')), List(C('SJ'), C('S9'), C('H4')))" in {
    val testCase = TestCase(Some(First), List(C("H7"), C("D7"), C("HT")), List(C("SJ"), C("S9"), C("H4")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(Second), List(C('CA'), C('C5'), C('C7')), List(C('DK'), C('DQ'), C('C9')))" in {
    val testCase = TestCase(Some(Second), List(C("CA"), C("C5"), C("C7")), List(C("DK"), C("DQ"), C("C9")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('H2'), C('H6')), List(C('C9'), C('S2'), C('H3')))" in {
    val testCase = TestCase(Some(First), List(C("H2"), C("H6")), List(C("C9"), C("S2"), C("H3")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('S5'), C('D9'), C('S4')), List(C('C9'), C('S3'), C('H2'), C('DK')))" in {
    val testCase = TestCase(Some(First), List(C("S5"), C("D9"), C("S4")), List(C("C9"), C("S3"), C("H2"), C("DK")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(None, List(C('C3'), C('HA'), C('CA'), C('CK'), C('S9'), C('H9')), List(C('D2'), C('C9'), C('H8'), C('C8'), C('C4'), C('H2')))" in {
    val testCase = TestCase(None, List(C("C3"), C("HA"), C("CA"), C("CK"), C("S9"), C("H9")), List(C("D2"), C("C9"), C("H8"), C("C8"), C("C4"), C("H2")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('DT'), C('S8'), C('CT'), C('H9')), List(C('S6'), C('CJ'), C('D2'), C('C9'), C('H3')))" in {
    val testCase = TestCase(Some(First), List(C("DT"), C("S8"), C("CT"), C("H9")), List(C("S6"), C("CJ"), C("D2"), C("C9"), C("H3")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(Second), List(C('SJ'), C('SQ'), C('S5')), List(C('CK'), C('D7'), C('S8')))" in {
    val testCase = TestCase(Some(Second), List(C("SJ"), C("SQ"), C("S5")), List(C("CK"), C("D7"), C("S8")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('H9'), C('S8'), C('DQ')), List(C('CA'), C('C3'), C('C8')))" in {
    val testCase = TestCase(Some(First), List(C("H9"), C("S8"), C("DQ")), List(C("CA"), C("C3"), C("C8")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('C5'), C('C4'), C('DQ'), C('CJ'), C('HA')), List(C('CT'), C('D3'), C('H2'), C('C8'), C('H9'), C('S4')))" in {
    val testCase = TestCase(Some(First), List(C("C5"), C("C4"), C("DQ"), C("CJ"), C("HA")), List(C("CT"), C("D3"), C("H2"), C("C8"), C("H9"), C("S4")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('SJ'), C('C6')), List(C('DA'), C('S9'), C('C3')))" in {
    val testCase = TestCase(Some(First), List(C("SJ"), C("C6")), List(C("DA"), C("S9"), C("C3")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(Second), List(C('CQ'), C('C7'), C('C6'), C('DJ'), C('D7')), List(C('HQ'), C('DT'), C('SA'), C('C3'), C('S4')))" in {
    val testCase = TestCase(Some(Second), List(C("CQ"), C("C7"), C("C6"), C("DJ"), C("D7")), List(C("HQ"), C("DT"), C("SA"), C("C3"), C("S4")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('D9'), C('H6'), C('C6')), List(C('D7'), C('H8'), C('S7'), C('CJ')))" in {
    val testCase = TestCase(Some(First), List(C("D9"), C("H6"), C("C6")), List(C("D7"), C("H8"), C("S7"), C("CJ")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('H6'), C('H3'), C('HJ')), List(C('DK'), C('DA'), C('H9'), C('C8')))" in {
    val testCase = TestCase(Some(First), List(C("H6"), C("H3"), C("HJ")), List(C("DK"), C("DA"), C("H9"), C("C8")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('DK'), C('S2'), C('C2'), C('DT')), List(C('H3'), C('HJ'), C('CQ'), C('D9'), C('C4')))" in {
    val testCase = TestCase(Some(First), List(C("DK"), C("S2"), C("C2"), C("DT")), List(C("H3"), C("HJ"), C("CQ"), C("D9"), C("C4")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('SK'), C('D9'), C('SA'), C('CA')), List(C('DK'), C('S3'), C('SQ'), C('C4'), C('D7')))" in {
    val testCase = TestCase(Some(First), List(C("SK"), C("D9"), C("SA"), C("CA")), List(C("DK"), C("S3"), C("SQ"), C("C4"), C("D7")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('C9'), C('DK')), List(C('DJ'), C('C7'), C('DQ')))" in {
    val testCase = TestCase(Some(First), List(C("C9"), C("DK")), List(C("DJ"), C("C7"), C("DQ")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('DK'), C('HK'), C('D2'), C('DT'), C('C6')), List(C('C4'), C('DJ'), C('S9'), C('D6'), C('S5'), C('S6')))" in {
    val testCase = TestCase(Some(First), List(C("DK"), C("HK"), C("D2"), C("DT"), C("C6")), List(C("C4"), C("DJ"), C("S9"), C("D6"), C("S5"), C("S6")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('D2'), C('CA'), C('H5'), C('C5')), List(C('S8'), C('D6'), C('C8'), C('DK')))" in {
    val testCase = TestCase(Some(First), List(C("D2"), C("CA"), C("H5"), C("C5")), List(C("S8"), C("D6"), C("C8"), C("DK")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('H7'), C('SJ')), List(C('C5'), C('H4'), C('HA')))" in {
    val testCase = TestCase(Some(First), List(C("H7"), C("SJ")), List(C("C5"), C("H4"), C("HA")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(Second), List(C('C5'), C('CA'), C('DJ'), C('CJ'), C('D7')), List(C('D8'), C('S2'), C('S5'), C('D2'), C('DT'), C('S7')))" in {
    val testCase = TestCase(Some(Second), List(C("C5"), C("CA"), C("DJ"), C("CJ"), C("D7")), List(C("D8"), C("S2"), C("S5"), C("D2"), C("DT"), C("S7")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('D7'), C('D5'), C('C8'), C('C7')), List(C('S8'), C('ST'), C('D4'), C('C4'), C('D2')))" in {
    val testCase = TestCase(Some(First), List(C("D7"), C("D5"), C("C8"), C("C7")), List(C("S8"), C("ST"), C("D4"), C("C4"), C("D2")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('H5'), C('HT'), C('CJ'), C('CT'), C('ST')), List(C('H2'), C('H3'), C('CK'), C('S4'), C('DT')))" in {
    val testCase = TestCase(Some(First), List(C("H5"), C("HT"), C("CJ"), C("CT"), C("ST")), List(C("H2"), C("H3"), C("CK"), C("S4"), C("DT")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(Second), List(C('D5'), C('S6'), C('H7')), List(C('H5'), C('DQ'), C('C2')))" in {
    val testCase = TestCase(Some(Second), List(C("D5"), C("S6"), C("H7")), List(C("H5"), C("DQ"), C("C2")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('S7'), C('HJ'), C('S3'), C('DQ')), List(C('S6'), C('CQ'), C('D2'), C('C6')))" in {
    val testCase = TestCase(Some(First), List(C("S7"), C("HJ"), C("S3"), C("DQ")), List(C("S6"), C("CQ"), C("D2"), C("C6")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('DQ'), C('H3'), C('H4')), List(C('S8'), C('HA'), C('D4'), C('SK')))" in {
    val testCase = TestCase(Some(First), List(C("DQ"), C("H3"), C("H4")), List(C("S8"), C("HA"), C("D4"), C("SK")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('DQ'), C('H8'), C('CT'), C('D9'), C('HQ'), C('H4')), List(C('DK'), C('H9'), C('C5'), C('D4'), C('S8'), C('HA')))" in {
    val testCase = TestCase(Some(First), List(C("DQ"), C("H8"), C("CT"), C("D9"), C("HQ"), C("H4")), List(C("DK"), C("H9"), C("C5"), C("D4"), C("S8"), C("HA")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('S3'), C('D8'), C('HQ')), List(C('DA'), C('S5'), C('SJ'), C('C3')))" in {
    val testCase = TestCase(Some(First), List(C("S3"), C("D8"), C("HQ")), List(C("DA"), C("S5"), C("SJ"), C("C3")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(Second), List(C('CQ'), C('C6'), C('CJ')), List(C('CK'), C('D2'), C('C4'), C('H8')))" in {
    val testCase = TestCase(Some(Second), List(C("CQ"), C("C6"), C("CJ")), List(C("CK"), C("D2"), C("C4"), C("H8")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('SA'), C('DJ'), C('CJ')), List(C('CQ'), C('D9'), C('H8'), C('DA')))" in {
    val testCase = TestCase(Some(First), List(C("SA"), C("DJ"), C("CJ")), List(C("CQ"), C("D9"), C("H8"), C("DA")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('CJ'), C('C7'), C('HA')), List(C('S5'), C('D9'), C('DK')))" in {
    val testCase = TestCase(Some(First), List(C("CJ"), C("C7"), C("HA")), List(C("S5"), C("D9"), C("DK")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(Second), List(C('C3'), C('S9'), C('D4'), C('CK'), C('C2')), List(C('DK'), C('ST'), C('D2'), C('D8'), C('CJ')))" in {
    val testCase = TestCase(Some(Second), List(C("C3"), C("S9"), C("D4"), C("CK"), C("C2")), List(C("DK"), C("ST"), C("D2"), C("D8"), C("CJ")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('CK'), C('S4'), C('DA'), C('C7')), List(C('SQ'), C('HA'), C('CT'), C('DJ')))" in {
    val testCase = TestCase(Some(First), List(C("CK"), C("S4"), C("DA"), C("C7")), List(C("SQ"), C("HA"), C("CT"), C("DJ")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('D8'), C('CQ'), C('S8'), C('DA')), List(C('C8'), C('C9'), C('S7'), C('SA')))" in {
    val testCase = TestCase(Some(First), List(C("D8"), C("CQ"), C("S8"), C("DA")), List(C("C8"), C("C9"), C("S7"), C("SA")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('DJ'), C('H6'), C('D2')), List(C('C3'), C('C5'), C('CJ'), C('S2')))" in {
    val testCase = TestCase(Some(First), List(C("DJ"), C("H6"), C("D2")), List(C("C3"), C("C5"), C("CJ"), C("S2")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('DT'), C('CJ'), C('D2')), List(C('D8'), C('D7'), C('CT'), C('D6')))" in {
    val testCase = TestCase(Some(First), List(C("DT"), C("CJ"), C("D2")), List(C("D8"), C("D7"), C("CT"), C("D6")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('CK'), C('S4')), List(C('DK'), C('C9'), C('C2')))" in {
    val testCase = TestCase(Some(First), List(C("CK"), C("S4")), List(C("DK"), C("C9"), C("C2")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(Second), List(C('D6'), C('D3'), C('HQ')), List(C('CT'), C('CQ'), C('C5'), C('HJ')))" in {
    val testCase = TestCase(Some(Second), List(C("D6"), C("D3"), C("HQ")), List(C("CT"), C("CQ"), C("C5"), C("HJ")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('SQ'), C('C3'), C('HK'), C('CA')), List(C('D6'), C('SK'), C('D2'), C('D7'), C('SA')))" in {
    val testCase = TestCase(Some(First), List(C("SQ"), C("C3"), C("HK"), C("CA")), List(C("D6"), C("SK"), C("D2"), C("D7"), C("SA")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('SK'), C('HK'), C('H5'), C('CT'), C('D7')), List(C('H2'), C('DQ'), C('SA'), C('D9'), C('H6'), C('C3')))" in {
    val testCase = TestCase(Some(First), List(C("SK"), C("HK"), C("H5"), C("CT"), C("D7")), List(C("H2"), C("DQ"), C("SA"), C("D9"), C("H6"), C("C3")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('C9'), C('D3'), C('HQ'), C('D9'), C('S3')), List(C('HJ'), C('DA'), C('H8'), C('S5'), C('C5'), C('S4')))" in {
    val testCase = TestCase(Some(First), List(C("C9"), C("D3"), C("HQ"), C("D9"), C("S3")), List(C("HJ"), C("DA"), C("H8"), C("S5"), C("C5"), C("S4")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('C4'), C('SQ'), C('H3'), C('HK')), List(C('C9'), C('C3'), C('S6'), C('ST')))" in {
    val testCase = TestCase(Some(First), List(C("C4"), C("SQ"), C("H3"), C("HK")), List(C("C9"), C("C3"), C("S6"), C("ST")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('D2'), C('C6'), C('H4'), C('D6')), List(C('H5'), C('HJ'), C('C4'), C('SQ'), C('H2')))" in {
    val testCase = TestCase(Some(First), List(C("D2"), C("C6"), C("H4"), C("D6")), List(C("H5"), C("HJ"), C("C4"), C("SQ"), C("H2")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('D7'), C('H3'), C('CT')), List(C('H2'), C('C6'), C('C4'), C('DA')))" in {
    val testCase = TestCase(Some(First), List(C("D7"), C("H3"), C("CT")), List(C("H2"), C("C6"), C("C4"), C("DA")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('H3'), C('SA'), C('D5'), C('C6'), C('CA')), List(C('S9'), C('ST'), C('DT'), C('C8'), C('S4')))" in {
    val testCase = TestCase(Some(First), List(C("H3"), C("SA"), C("D5"), C("C6"), C("CA")), List(C("S9"), C("ST"), C("DT"), C("C8"), C("S4")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(Second), List(C('C7'), C('C2'), C('DT'), C('S7')), List(C('H8'), C('S6'), C('H7'), C('SJ')))" in {
    val testCase = TestCase(Some(Second), List(C("C7"), C("C2"), C("DT"), C("S7")), List(C("H8"), C("S6"), C("H7"), C("SJ")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('DT'), C('H7'), C('H4'), C('C5')), List(C('CA'), C('DA'), C('S5'), C('D7')))" in {
    val testCase = TestCase(Some(First), List(C("DT"), C("H7"), C("H4"), C("C5")), List(C("CA"), C("DA"), C("S5"), C("D7")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(Second), List(C('S5'), C('HA'), C('DK'), C('D6')), List(C('C4'), C('H3'), C('HK'), C('H4')))" in {
    val testCase = TestCase(Some(Second), List(C("S5"), C("HA"), C("DK"), C("D6")), List(C("C4"), C("H3"), C("HK"), C("H4")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('CA'), C('DK'), C('HT')), List(C('HA'), C('DJ'), C('HJ'), C('S9')))" in {
    val testCase = TestCase(Some(First), List(C("CA"), C("DK"), C("HT")), List(C("HA"), C("DJ"), C("HJ"), C("S9")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('C3'), C('D9'), C('H5')), List(C('H7'), C('DA'), C('D7'), C('S7')))" in {
    val testCase = TestCase(Some(First), List(C("C3"), C("D9"), C("H5")), List(C("H7"), C("DA"), C("D7"), C("S7")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('SQ'), C('H4'), C('CK'), C('D5')), List(C('S3'), C('S2'), C('H3'), C('CA'), C('D2')))" in {
    val testCase = TestCase(Some(First), List(C("SQ"), C("H4"), C("CK"), C("D5")), List(C("S3"), C("S2"), C("H3"), C("CA"), C("D2")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('HQ'), C('S2'), C('C5'), C('H3'), C('H6')), List(C('D6'), C('H9'), C('SA'), C('C8'), C('S3'), C('CT')))" in {
    val testCase = TestCase(Some(First), List(C("HQ"), C("S2"), C("C5"), C("H3"), C("H6")), List(C("D6"), C("H9"), C("SA"), C("C8"), C("S3"), C("CT")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('C2'), C('D2'), C('H4'), C('D3')), List(C('S5'), C('HQ'), C('SJ'), C('HK')))" in {
    val testCase = TestCase(Some(First), List(C("C2"), C("D2"), C("H4"), C("D3")), List(C("S5"), C("HQ"), C("SJ"), C("HK")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('CJ'), C('SK'), C('DA'), C('DJ')), List(C('C7'), C('SJ'), C('DQ'), C('S8')))" in {
    val testCase = TestCase(Some(First), List(C("CJ"), C("SK"), C("DA"), C("DJ")), List(C("C7"), C("SJ"), C("DQ"), C("S8")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('S9'), C('H6'), C('CK'), C('DT'), C('C8')), List(C('S5'), C('D8'), C('D5'), C('DJ'), C('D6'), C('CQ')))" in {
    val testCase = TestCase(Some(First), List(C("S9"), C("H6"), C("CK"), C("DT"), C("C8")), List(C("S5"), C("D8"), C("D5"), C("DJ"), C("D6"), C("CQ")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('HT'), C('DT'), C('S4'), C('D6')), List(C('S2'), C('C5'), C('C7'), C('DK')))" in {
    val testCase = TestCase(Some(First), List(C("HT"), C("DT"), C("S4"), C("D6")), List(C("S2"), C("C5"), C("C7"), C("DK")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(Second), List(C('D9'), C('SQ')), List(C('DK'), C('SK')))" in {
    val testCase = TestCase(Some(Second), List(C("D9"), C("SQ")), List(C("DK"), C("SK")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(None, List(C('CT'), C('H2'), C('DT'), C('CQ'), C('H9')), List(C('C8'), C('H6'), C('H8'), C('HA'), C('H5')))" in {
    val testCase = TestCase(None, List(C("CT"), C("H2"), C("DT"), C("CQ"), C("H9")), List(C("C8"), C("H6"), C("H8"), C("HA"), C("H5")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(Second), List(C('C8'), C('C6'), C('D4'), C('DT'), C('SQ')), List(C('D6'), C('HA'), C('S3'), C('HK'), C('HJ')))" in {
    val testCase = TestCase(Some(Second), List(C("C8"), C("C6"), C("D4"), C("DT"), C("SQ")), List(C("D6"), C("HA"), C("S3"), C("HK"), C("HJ")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(Second), List(C('H9'), C('S4'), C('C5'), C('C2')), List(C('HQ'), C('HA'), C('D5'), C('D4')))" in {
    val testCase = TestCase(Some(Second), List(C("H9"), C("S4"), C("C5"), C("C2")), List(C("HQ"), C("HA"), C("D5"), C("D4")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(Second), List(C('S8'), C('D4'), C('H4'), C('C5')), List(C('ST'), C('CQ'), C('DK'), C('D9'), C('HA')))" in {
    val testCase = TestCase(Some(Second), List(C("S8"), C("D4"), C("H4"), C("C5")), List(C("ST"), C("CQ"), C("DK"), C("D9"), C("HA")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(Second), List(C('D3'), C('ST')), List(C('HA'), C('D7'), C('H9')))" in {
    val testCase = TestCase(Some(Second), List(C("D3"), C("ST")), List(C("HA"), C("D7"), C("H9")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(None, List(C('C6'), C('H5'), C('S9'), C('H3')), List(C('SQ'), C('D2'), C('HJ'), C('DT')))" in {
    val testCase = TestCase(None, List(C("C6"), C("H5"), C("S9"), C("H3")), List(C("SQ"), C("D2"), C("HJ"), C("DT")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('S5'), C('C3'), C('H9'), C('S3'), C('SJ')), List(C('C8'), C('HJ'), C('CK'), C('DJ'), C('C7')))" in {
    val testCase = TestCase(Some(First), List(C("S5"), C("C3"), C("H9"), C("S3"), C("SJ")), List(C("C8"), C("HJ"), C("CK"), C("DJ"), C("C7")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('DT'), C('C7')), List(C('ST'), C('D7'), C('C5')))" in {
    val testCase = TestCase(Some(First), List(C("DT"), C("C7")), List(C("ST"), C("D7"), C("C5")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('D3'), C('ST'), C('DT'), C('S7'), C('CA')), List(C('S6'), C('D5'), C('CQ'), C('D4'), C('H5'), C('DA')))" in {
    val testCase = TestCase(Some(First), List(C("D3"), C("ST"), C("DT"), C("S7"), C("CA")), List(C("S6"), C("D5"), C("CQ"), C("D4"), C("H5"), C("DA")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('H9'), C('DQ'), C('D6'), C('CJ'), C('H6')), List(C('HA'), C('H5'), C('CQ'), C('D4'), C('H8'), C('C5')))" in {
    val testCase = TestCase(Some(First), List(C("H9"), C("DQ"), C("D6"), C("CJ"), C("H6")), List(C("HA"), C("H5"), C("CQ"), C("D4"), C("H8"), C("C5")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('D9'), C('S3'), C('D7'), C('CA'), C('HK')), List(C('D5'), C('H3'), C('C4'), C('H2'), C('ST'), C('D6')))" in {
    val testCase = TestCase(Some(First), List(C("D9"), C("S3"), C("D7"), C("CA"), C("HK")), List(C("D5"), C("H3"), C("C4"), C("H2"), C("ST"), C("D6")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(None, List(C('S4'), C('DJ'), C('H9'), C('S8')), List(C('SK'), C('D2'), C('C2'), C('H7')))" in {
    val testCase = TestCase(None, List(C("S4"), C("DJ"), C("H9"), C("S8")), List(C("SK"), C("D2"), C("C2"), C("H7")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('H2'), C('D3'), C('HA'), C('SA')), List(C('DT'), C('D9'), C('H6'), C('D7'), C('CQ')))" in {
    val testCase = TestCase(Some(First), List(C("H2"), C("D3"), C("HA"), C("SA")), List(C("DT"), C("D9"), C("H6"), C("D7"), C("CQ")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('C2'), C('H2'), C('S5'), C('C8')), List(C('DT'), C('D3'), C('S3'), C('H7')))" in {
    val testCase = TestCase(Some(First), List(C("C2"), C("H2"), C("S5"), C("C8")), List(C("DT"), C("D3"), C("S3"), C("H7")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('D9'), C('HJ'), C('S9'), C('SQ'), C('S5')), List(C('SK'), C('H5'), C('H6'), C('DQ'), C('C3')))" in {
    val testCase = TestCase(Some(First), List(C("D9"), C("HJ"), C("S9"), C("SQ"), C("S5")), List(C("SK"), C("H5"), C("H6"), C("DQ"), C("C3")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('C9'), C('C4'), C('SA'), C('SJ'), C('H8')), List(C('H7'), C('CK'), C('C3'), C('SQ'), C('S5')))" in {
    val testCase = TestCase(Some(First), List(C("C9"), C("C4"), C("SA"), C("SJ"), C("H8")), List(C("H7"), C("CK"), C("C3"), C("SQ"), C("S5")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('C2'), C('HA'), C('SQ'), C('CQ'), C('SK')), List(C('C5'), C('DK'), C('C8'), C('SJ'), C('CA')))" in {
    val testCase = TestCase(Some(First), List(C("C2"), C("HA"), C("SQ"), C("CQ"), C("SK")), List(C("C5"), C("DK"), C("C8"), C("SJ"), C("CA")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('D9'), C('H8'), C('HJ'), C('D2')), List(C('DJ'), C('S2'), C('HQ'), C('D7')))" in {
    val testCase = TestCase(Some(First), List(C("D9"), C("H8"), C("HJ"), C("D2")), List(C("DJ"), C("S2"), C("HQ"), C("D7")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('HT'), C('SQ'), C('DJ')), List(C('D2'), C('HJ'), C('D4'), C('C5')))" in {
    val testCase = TestCase(Some(First), List(C("HT"), C("SQ"), C("DJ")), List(C("D2"), C("HJ"), C("D4"), C("C5")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(Second), List(C('S6'), C('CJ'), C('SQ')), List(C('C5'), C('HJ'), C('H8'), C('DK')))" in {
    val testCase = TestCase(Some(Second), List(C("S6"), C("CJ"), C("SQ")), List(C("C5"), C("HJ"), C("H8"), C("DK")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('C3'), C('C8'), C('S9')), List(C('C6'), C('S6'), C('ST'), C('D7')))" in {
    val testCase = TestCase(Some(First), List(C("C3"), C("C8"), C("S9")), List(C("C6"), C("S6"), C("ST"), C("D7")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('D9'), C('HJ'), C('S4')), List(C('S2'), C('D4'), C('ST'), C('H6')))" in {
    val testCase = TestCase(Some(First), List(C("D9"), C("HJ"), C("S4")), List(C("S2"), C("D4"), C("ST"), C("H6")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }

  "Case" must "resolve TestCase(Some(First), List(C('H7'), C('S9'), C('S5'), C('D9'), C('D7')), List(C('D4'), C('C8'), C('DT'), C('ST'), C('S7'), C('HT'))) " in {
    val testCase = TestCase(Some(First), List(C("H7"), C("S9"), C("S5"), C("D9"), C("D7")), List(C("D4"), C("C8"), C("DT"), C("ST"), C("S7"), C("HT")))
    new GameMachine(Hearts).play(testCase.playerOne, testCase.playerTwo) should be(testCase.result)
  }
}
