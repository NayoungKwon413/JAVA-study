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
			super(100);  //�θ�Ŭ������ �´� �����ڰ� �ʿ���
		}

	public String toString() {     return "Tv";       }

	}


	
	
		class Test {

		public static void main(String[] args) {

		Tv t = new Tv();

		}      }


