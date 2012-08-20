/**
 * @Title:Beverage.java
 * @Package:me.itcai
 * @Description:TODO
 * @Author Jason
 * @Email caihaiboy@gmail.com
 * @Date 2012-8-18 上午10:49:01
 * @Version V1.0
 */
package me.itcai;

/**
 * @ClassName:Beverage
 * @Description:饮料抽象类
 * @Author Jason
 * @Email caihaiboy@gmail.com
 * @Date 2012-8-18 上午10:49:01
 *
 */
public abstract class Beverage {
	String description = "Unknown Beverage";

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}
