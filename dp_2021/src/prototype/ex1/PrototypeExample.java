package prototype.ex1;


import java.util.*;

 abstract class Product implements Cloneable {
		private String SKU;  //stock keeping unit
		private String description;	
		
		public Object clone() {
			Object clone = null;
			try {
				clone = super.clone();
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
			return clone;
		}
		public String getDescription() {
			return description;

		}
		public String getSKU() {
			return SKU;

		}
		public void setDescription(String string) {
			description = string;

		}
		public void setSKU(String string) {
			SKU = string;
		}
	}

	 class Book extends Product {
		private int numberOfPages;

		public int getNumberOfPages() {
			return numberOfPages;
		}
		public void setNumberOfPages(int i) {
			numberOfPages = i;
		}
	}
	class DVD extends Product {
		private int duration;

		public int getDuration() {
			return duration;
		}
		public void setDuration(int i) {
			duration = i;
		}
	}
	
@SuppressWarnings("unchecked")
 class ProductCache {
		private static Hashtable productMap = new Hashtable();

		public static Product getProduct(String productCode) {
			Product cachedProduct = (Product) productMap.get(productCode);
			return (Product) cachedProduct.clone();
		}

		public static void loadCache() {
			// for each product run expensive query and instantiate product
			// productMap.put(productKey, product);
			// for exemplification, we add only two products
			Book b1 = new Book();
			b1.setDescription("Oliver Twist");
			b1.setSKU("B1");
			b1.setNumberOfPages(100);
			productMap.put(b1.getSKU(), b1);

			DVD d1 = new DVD();
			d1.setDescription("Superman");
			d1.setSKU("D1");
			d1.setDuration(180);
			productMap.put(d1.getSKU(), d1);
		}
	}
	public class PrototypeExample
	{
		public static void main(String[] args) {
			ProductCache.loadCache();

			Book clonedBook = (Book) ProductCache.getProduct("B1");
			Book b2=(Book)ProductCache.getProduct("B1") ;
			System.out.println(clonedBook==b2);


			System.out.println("SKU = " + clonedBook.getSKU());
			System.out.println("Desc = " + clonedBook.getDescription());
			System.out.println("Pages = " + clonedBook.getNumberOfPages());

			DVD clonedDVD = (DVD) ProductCache.getProduct("D1");
			System.out.println("SKU = " + clonedDVD.getSKU());
			System.out.println("Desc = " + clonedDVD.getDescription());
			System.out.println("Dur = " + clonedDVD.getDuration());
/*
			DVD clonedDVD2 = (DVD) ProductCache.getProduct("D2");
			System.out.println("SKU = " + clonedDVD2.getSKU());
			System.out.println("Desc = " + clonedDVD2.getDescription());
			System.out.println("Dur = " + clonedDVD2.getDuration());
			*/

		}
	}
