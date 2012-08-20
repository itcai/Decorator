/**
 * @Title:StarbuzzCoffee.java
 * @Package:me.itcai
 * @Description:TODO
 * @Author Jason
 * @Email caihaiboy@gmail.com
 * @Date 2012-8-18 下午04:37:37
 * @Version V1.0
 */
package me.itcai;

/**
 * @ClassName:StarbuzzCoffee
 * @Description:TODO 
 * @Author Jason
 * @Email caihaiboy@gmail.com
 * @Date 2012-8-18 下午04:37:37
 *
 */
public class StarbuzzCoffee {

	public static void main (String[] args) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + "$" + beverage.cost());
		
		Beverage beverage2 = new HouseBlend();
		beverage2 = new Soy(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + "$" + beverage2.cost());
	}
}
