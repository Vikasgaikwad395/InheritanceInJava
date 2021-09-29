
class TV{
			void sound() {
					System.out.println("This Sound in TV");
	}
			void Picture() {
					System.out.println("This Picures in TV");
	}
	
}

class ThreeDTV extends TV{
		void threeD() {
			System.out.println("This is ThreeD picture quality in ThreeDTV");
		}
			void dolbyAudio() {
					System.out.println("This is Dolby audio quality in ThreeDTV");
			}
}

class SmartTV extends ThreeDTV{
				void internet() {
					System.out.println("This is the Internet Access SmartTV");
				}
				void FullHD() {
				System.out.println("This is the Full HD SmartTV");		
					}
}
public class Test2 {

	public static void main(String[] args) {
		
		SmartTV s = new SmartTV();
		s.sound();
		s.Picture();
		
		s.threeD();
		s.dolbyAudio();
		
		s.internet();
		s.FullHD();
		
	}

}
