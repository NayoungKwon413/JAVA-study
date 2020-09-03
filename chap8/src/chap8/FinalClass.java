package chap8;
/*
 * final 제어자 : 변경 불가의 의미
 * final 클래스 : 상속 불가 클래스
 *              다른 클래스에 부모 클래스가 될 수 없음.
 *              String 클래스 = final 클래스
 */
public final class FinalClass {   }
class SubClass extends FinalClass {} 
