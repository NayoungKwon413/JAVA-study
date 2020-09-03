package Test;

class Product   {

	int price, bonusPoint;

	Product(int price) {

	this.price = price;

	bonusPoint =(int)(price/10.0);

	}

	}

	class Tv extends Product {
		Tv(){
			super(100);  //부모클래스에 맞는 생성자가 필요함
		}

	public String toString() {     return "Tv";       }

	}


	
	
		class Test {

		public static void main(String[] args) {

		Tv t = new Tv();

		}      }


