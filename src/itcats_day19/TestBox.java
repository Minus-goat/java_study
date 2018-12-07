package itcats_day19;

import java.util.Date;

//HeadFirstJAVA 书本291上机练习内容
public class TestBox {
    Integer i;
    int j;

    public  static  void main(String[] args){
        TestBox t = new TestBox();
        t.go();
    }
    public  void go(){
        j = i;
        System.out.println(j);
        System.out.println(i);


    }
}
