package builder.ex1;


class PromoKit
 {   
	 String message;
	 public void setMessage(String s)
	 {message=s;
	 }
	 public String toString()
	 {
		 return(message);
	 }

 };
 abstract class PromoKitBuilder {
		PromoKit promoKit = new PromoKit();
		public abstract void buildVideoPart();
		public abstract void buildGarmentPart();
		public abstract void buildBookPart();
		public abstract PromoKit getPromoKit();
	}

	
class MenPromoKitBuilder extends PromoKitBuilder {

          public void buildVideoPart() 
			  {
      System.out.println("Videos PromoKit based on men-specific preferences");
		}

		public void buildGarmentPart() {
		System.out.println(" add men garments to PromoKit ");
		}
		public void buildBookPart() {
		System.out.println("add men books to PromoKit");
		}
		public PromoKit getPromoKit() {
	 	   promoKit.setMessage("MEN PROMOKIT COMPLETE ");
			return promoKit;
		}
	}
 class WomenPromoKitBuilder extends PromoKitBuilder {
		public void buildVideoPart() {
	      System.out.println("Videos PromoKit based on WOMEN-specific preferences");

		}
		public void buildGarmentPart() {
		System.out.println(" add WOmen garments to PromoKit ");
		}
		public void buildBookPart() {
		System.out.println("add WOmen books to PromoKit");
		}
		public PromoKit getPromoKit() {
			promoKit.setMessage("WOMEN PROMOKIT COMPLETE");
			return promoKit;
		}
	}
	// Director
 class PromoKitDirector {
		public PromoKit createPromoKit(PromoKitBuilder builder) {
			builder.buildVideoPart();
			builder.buildGarmentPart();
			builder.buildBookPart();
			return builder.getPromoKit();
		}
	}
	// Integration with overal application
	public class BuilderExample {
		public static void main(String[] args) {
			String gendre = args[0];
			PromoKitDirector director = new PromoKitDirector();
			PromoKitBuilder promoKitBuilder = null;

			if (gendre.equals("M")) {
				promoKitBuilder = new MenPromoKitBuilder();
			} else if (gendre.equals("F")) {
				promoKitBuilder = new WomenPromoKitBuilder();
			}

			PromoKit result = director.createPromoKit(promoKitBuilder);
			System.out.println("from main :"+result);
		}
	}
    	